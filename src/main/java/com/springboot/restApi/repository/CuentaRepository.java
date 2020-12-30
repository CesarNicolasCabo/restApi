package com.springboot.restApi.repository;

import com.springboot.restApi.domain.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaRepository extends CrudRepository<Cuenta, Long> {
}
