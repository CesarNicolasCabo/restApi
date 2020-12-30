package com.springboot.restApi.controller;

import com.springboot.restApi.domain.Cuenta;
import com.springboot.restApi.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="todolist")
public class CuentaController {

    CuentaService cuentaService;

    public CuentaController(@Autowired CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping(value="tasks")
    public List<Cuenta> getTasks() {
        return cuentaService.getTask();
    }
}
