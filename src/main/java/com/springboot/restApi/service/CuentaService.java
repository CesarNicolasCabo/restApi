package com.springboot.restApi.service;

import com.springboot.restApi.domain.Cuenta;

import java.util.List;

public interface CuentaService {

    List<Cuenta> getCuentas();

    Cuenta addCuenta();
}
