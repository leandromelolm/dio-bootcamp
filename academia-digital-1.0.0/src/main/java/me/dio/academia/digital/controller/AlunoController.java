package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoController {

    @Autowired
    private IAlunoService service;

    @GetMapping("/{id}")
    public Aluno getById(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm alunoForm){
        return service.create(alunoForm);
    }

    @PutMapping("/{id}")
    public Aluno update(
            @PathVariable Long id,
            @Valid @RequestBody AlunoUpdateForm aluno){
        return service.update(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
