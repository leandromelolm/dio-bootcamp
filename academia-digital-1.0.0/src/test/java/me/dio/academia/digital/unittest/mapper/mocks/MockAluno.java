package me.dio.academia.digital.unittest.mapper.mocks;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;

import java.util.ArrayList;
import java.util.List;

public class MockAluno {

    public Aluno mockEntity() {
        return mockEntity(0);
    }

    public AlunoForm mockVO() {
        return mockVO(0);
    }

    public List<Aluno> mockEntityList() {
        List<Aluno> Alunos = new ArrayList<Aluno>();
        for (int i = 0; i < 14; i++) {
            Alunos.add(mockEntity(i));
        }
        return Alunos;
    }

    public List<AlunoForm> mockVOList() {
        List<AlunoForm> Alunos = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            Alunos.add(mockVO(i));
        }
        return Alunos;
    }

    public Aluno mockEntity(Integer number) {
        Aluno Aluno = new Aluno();
        Aluno.setNome("Nome Test" + number);
        Aluno.setCpf("111111111" + number);
        Aluno.setId(number.longValue());
        Aluno.setBairro("Bairro Test" + number);
        return Aluno;
    }

    public AlunoForm mockVO(Integer number) {
        AlunoForm Aluno = new AlunoForm();
        Aluno.setNome("Nome Test" + number);
        Aluno.setCpf("222222222" + number);
        Aluno.setBairro("Bairro Test" + number);
        return Aluno;
    }

}
