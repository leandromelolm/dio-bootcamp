package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;
import me.dio.academia.digital.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository repository;

    @Autowired
    private AlunoServiceImpl alunoService;

    public boolean existMatriculaToAluno(Long id){
        return repository.existsByAlunoId(id);
    }

    @Override
    public Matricula create(MatriculaForm form) {
        var entityAluno = alunoService.get(form.getAlunoId());
        Matricula m = new Matricula();
        m.setAluno(entityAluno);
        return repository.save(m);
    }

    @Override
    public Matricula get(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Id Not Found! Id: " + id));
    }

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.delete(get(id));
    }
}
