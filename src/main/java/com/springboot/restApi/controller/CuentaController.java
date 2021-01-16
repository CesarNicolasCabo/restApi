package com.springboot.restApi.controller;

import com.springboot.restApi.domain.Cuenta;
import com.springboot.restApi.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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
    public List<Cuenta> getCuentas(HttpServletResponse servletResponse) {
        servletResponse.addHeader("nombre_del_header_devuelto", "valor_del_header_devuelto");
        return cuentaService.getCuentas();
    }

    @RequestMapping(value = "/crear_nueva_cuenta", method = RequestMethod.POST)
    public ResponseEntity<Cuenta> addCuenta(@RequestBody Cuenta cuenta) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("nombre_del_header_devuelo", "valor_del_header_devuelto");
        return ResponseEntity.status(201)
                .header(String.valueOf(responseHeaders))
                .body(cuentaService.addCuenta());
    }
}
