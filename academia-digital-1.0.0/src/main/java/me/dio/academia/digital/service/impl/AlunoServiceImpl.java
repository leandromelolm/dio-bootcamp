package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.mapper.DozerMapper;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IAlunoService;
import me.dio.academia.digital.service.exceptions.DatabaseException;
import me.dio.academia.digital.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoRepository;

    @Autowired
    private MatriculaRepository matriculaRepository;

    public boolean existCpf(String cpf){
        if(repository.existsByCpf(cpf)){
            throw new DatabaseException("Erro: CPF "+ cpf +" já cadastrado!");
        }
        return false;
    }

    @Override
    public Aluno create(AlunoForm form) {
        existCpf(form.getCpf());
        var entity = DozerMapper.parseObject(form, Aluno.class);
        return repository.save(entity);
    }

    @Override
    public Aluno get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(
                "Entity not found! Id: " + id ));
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        Aluno aluno = get(id);
        Aluno entity = DozerMapper.parseObject(formUpdate, Aluno.class);
        entity.setId(id);
        entity.setCpf(aluno.getCpf());
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        get(id);
//        avaliacaoRepository.deleteAll(avaliacaoRepository.findByAvaliacaoAlunoId(id));

        // CascadeType.ALL: Ao remover matricula remove aluno.
        // CascadeType.REMOVE: Ao remover aluno remove  lista de Avaliações
//        matriculaRepository.delete(matriculaRepository.findByAlunoId(id));

        try{
            repository.deleteById(id);
        }catch (Exception e){
            throw new DatabaseException("Violação de integridade de dados! Aluno não pode ser removido" +
                    " porque tem uma matrícula já cadastrada para esse aluno." +
                    " Quantidade de Avaliações: "+ avaliacaoRepository.findByAvaliacaoAlunoId(id).size() +
                    ". Matrícula ID: "+ matriculaRepository.findByAlunoId(id).getId());
        }
    }
}
