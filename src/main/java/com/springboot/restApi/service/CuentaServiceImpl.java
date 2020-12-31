package com.springboot.restApi.service;

import com.springboot.restApi.domain.Cuenta;
import com.springboot.restApi.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> getCuentas() {
        return (List<Cuenta>) cuentaRepository.findAll();
    }
}
