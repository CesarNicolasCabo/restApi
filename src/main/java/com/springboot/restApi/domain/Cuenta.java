package com.springboot.restApi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="cuentas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
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
