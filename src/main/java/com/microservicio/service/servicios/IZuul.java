package com.microservicio.service.servicios;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microservicio.service.entity.Tarjeta;

//@FeignClient(name = "apiZuul", url = "http://apizuul.netflix.svc:8080")
public interface IZuul {
	
	//@RequestMapping(method = RequestMethod.GET, value = "/tarjetacontroller/tarjeta/{id}")
	//public Tarjeta getTarjeta(@PathVariable (value = "id")long id);

}
