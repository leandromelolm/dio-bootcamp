package me.dio.academia.digital.unittest.mapper;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.mapper.DozerMapper;
import me.dio.academia.digital.unittest.mapper.mocks.MockAluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DozerConverterTest {
    MockAluno inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockAluno();
    }

    @Test
    public void parseEntityToVOTest() {
        AlunoForm output = DozerMapper.parseObject(inputObject.mockEntity(), AlunoForm.class);
        assertEquals("Nome Test0", output.getNome());
        assertEquals("Bairro Test0", output.getBairro());
        assertEquals("1111111110", output.getCpf());
    }

    @Test
    public void parseVOToEntityTest() {
        Aluno output = DozerMapper.parseObject(inputObject.mockVO(), Aluno.class);
        assertEquals("Nome Test0", output.getNome());
        assertEquals("Bairro Test0", output.getBairro());
        assertEquals("2222222220", output.getCpf());
    }

}
