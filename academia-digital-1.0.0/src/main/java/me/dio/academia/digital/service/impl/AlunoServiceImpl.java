package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.mapper.DozerMapper;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        var entity = DozerMapper.parseObject(form, Aluno.class);
        return repository.save(entity);
    }

    @Override
    public Aluno get(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id de usuário não existe"));
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
        repository.deleteById(id);
    }
}
