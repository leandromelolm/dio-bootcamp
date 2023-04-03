package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.dto.AvaliacaoFisicaDTO;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.mapper.DozerMapper;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAlunoService;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import me.dio.academia.digital.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private IAlunoService alunoService;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        Aluno aluno = alunoService.get(form.getAlunoId());
        var entity = DozerMapper.parseObject(form, AvaliacaoFisica.class);
        entity.setAluno(aluno);
        return repository.save(entity);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Entity not found! Id: " + id ));
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return repository.findAll();
    }

    @Override
    public List<AvaliacaoFisicaDTO> getAllByUser(Long userId) {
//         var entity = repository.findByAlunoId(userId); //faz a mesma busca
         var entity = repository.findByAvaliacaoAlunoId(alunoService.get(userId).getId());
         return DozerMapper.parseListObjects(entity, AvaliacaoFisicaDTO.class);
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        AvaliacaoFisica avaliacaoFisica = get(id);
        var entity = DozerMapper.parseObject(formUpdate, AvaliacaoFisica.class);
        entity.setId(id);
        entity.setAluno(avaliacaoFisica.getAluno());
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(get(id));
    }

}