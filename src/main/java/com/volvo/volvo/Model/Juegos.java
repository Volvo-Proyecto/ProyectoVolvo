package com.volvo.volvo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="juegos")
@AllArgsConstructor
@NoArgsConstructor
public class Juegos {
    @Id
    private Long id;
    @Column(nullable = false)
    private String titulo;
    @Column(length = 1000)
    private String descripcion;
    @Column(nullable = false)
    private Long generoid;
    @Column(nullable = false)
    private Long plataformaid;
    @Column(nullable = false)
    private Long estudioid;
}
