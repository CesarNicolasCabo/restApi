package com.springboot.restApi.service;

import com.springboot.restApi.domain.Cuenta;
import com.springboot.restApi.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {

    private final CuentaRepository cuentaRepository;

    private Cuenta cuenta;

    public CuentaServiceImpl(@Autowired CuentaRepository cuentaRepository, @Autowired Cuenta cuenta) {
        this.cuentaRepository = cuentaRepository;
        this.cuenta = cuenta;
    }

    public List<Cuenta> getCuentas() {
        return (List<Cuenta>) cuentaRepository.findAll();
    }

    public Cuenta addCuenta() {
        return cuentaRepository.save(Cuenta.builder()
                .status(Boolean.TRUE)
                .descripcion("Bitcoin wallet")
                .fechaAlta(Date.from(Instant.now()))
                .build());
    }
}
