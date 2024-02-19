package com.uis.aprendizaje.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class PersonDTO implements Serializable {


    private static final long serialVersionUID = 8516297332077699608L;

    private Long id;

    @NotNull(message = "El nombre no puede ser nulo")
    private String nombre;

    private String direccion;
}
