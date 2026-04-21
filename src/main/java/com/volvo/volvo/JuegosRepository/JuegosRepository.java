package com.volvo.volvo.JuegosRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.volvo.volvo.Model.Juegos;
import java.util.List;


@Repository
public interface JuegosRepository extends JpaRepository<Juegos,Long>{
    List<Juegos> findByGeneroId(Long generoid);
    List<Juegos> findByEstudioId(Long estudioid);
    List<Juegos> findByPlataformaid(Long plataformaid);
    List<Juegos> findByTitulo(String titulo);

}
