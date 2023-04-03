package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/matriculas")
public class MatriculaController {

    @Autowired
    IMatriculaService service;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid MatriculaForm form){
//        if (service.existMatriculaToAluno(form.getAlunoId())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("Matrícula já existe para usuário");
//        }
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(form));
    }

    @GetMapping
    public List<Matricula> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Matricula getOne(@PathVariable Long id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
