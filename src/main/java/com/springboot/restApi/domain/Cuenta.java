package com.springboot.restApi.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="cuentas")
@Data
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCuenta;

    private Boolean status;

    private String descripcion;

    @Column(name="fecha_alta")
    private Date fechaAlta;
}
