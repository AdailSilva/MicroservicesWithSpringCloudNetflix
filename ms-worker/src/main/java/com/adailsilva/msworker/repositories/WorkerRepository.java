package com.adailsilva.msworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adailsilva.msworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	Worker findByName(String name);

}