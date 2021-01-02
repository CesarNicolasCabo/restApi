package com.springboot.restApi.controller;

import com.springboot.restApi.domain.Cuenta;
import com.springboot.restApi.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="cuentaBancaria")
public class CuentaController {

    CuentaService cuentaService;

    public CuentaController(@Autowired CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping(value="/obtener_todas_las_cuentas")
    @ResponseStatus(HttpStatus.OK)
    public List<Cuenta> getCuentas() {
        return cuentaService.getCuentas();
    }

    @RequestMapping(value = "/crear_nueva_cuenta", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Cuenta addCuenta(@RequestBody Cuenta cuenta) {
         return cuentaService.addCuenta();
    }
}
