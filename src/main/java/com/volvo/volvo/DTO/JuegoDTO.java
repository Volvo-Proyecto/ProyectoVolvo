package com.volvo.volvo.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JuegoDTO {

    @NotBlank(message = "El nombre del juego no puede estar vacío")
    @Size(max = 255, message = "El nombre del juego no puede exceder los 255 caracteres")
    private String titulo;


    @Size(max = 1000, message = "La descripción del juego no puede exceder los 1000 caracteres")
    private String descripcion;

    @Min(value = 1950, message = "El año de lanzamiento debe ser mayor o igual a 1950")
    @Max(value = 2100, message = "El año de lanzamiento debe ser menor o igual a 2100")
    private Integer anioLanzamiento;

    @NotNull(message = "debes indicar un genero")
    @Positive(message = "el id del genero debe ser positivo")
    private Long generoid;


    @NotNull(message = "debes indicar una plataforma")
    @Positive(message = "la id de plataforma debe ser positivo")

    
}
