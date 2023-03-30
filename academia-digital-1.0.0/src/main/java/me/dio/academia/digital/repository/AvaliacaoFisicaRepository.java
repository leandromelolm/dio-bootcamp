package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
    List<AvaliacaoFisica> findByAlunoId(Long id);

//    @Query(value = "SELECT * FROM tb_avaliacoes m " +
//            "INNER jOIN tb_alunos a ON m.aluno_id = a.id " +
//            "WHERE a.id = :userId", nativeQuery = true)
    @Query("FROM AvaliacaoFisica a WHERE a.aluno.id = :userId")
    List<AvaliacaoFisica> findByAvaliacaoAlunoId(Long userId);


}




















