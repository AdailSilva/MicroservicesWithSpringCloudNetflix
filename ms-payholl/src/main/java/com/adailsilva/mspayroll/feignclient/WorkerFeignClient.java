package com.adailsilva.mspayroll.feignclient;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.adailsilva.mspayroll.entities.Worker;

@Component
//@FeignClient(name = "ms-worker", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/names")
	List<String> allNames();

	@GetMapping(value = "/workers")
	ResponseEntity<List<Worker>> findAll();

	@GetMapping(value = "/worker/{id}")
	ResponseEntity<Worker> findById(@PathVariable(value = "id") Long id);

	@GetMapping(value = "/search")
	ResponseEntity<Worker> findByName(@RequestParam String name);

}