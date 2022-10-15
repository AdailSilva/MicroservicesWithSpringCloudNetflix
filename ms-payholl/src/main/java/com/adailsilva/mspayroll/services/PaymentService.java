package com.adailsilva.mspayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adailsilva.mspayroll.entities.Payment;
import com.adailsilva.mspayroll.entities.Worker;

@Service
public class PaymentService {

	private static Logger logger = LoggerFactory.getLogger(PaymentService.class);

	private static final String URI = "http://192.168.1.101:8001/workers/worker/{id}";

	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private WorkerFeignClient workerFeignClient;

	public ResponseEntity<Payment> getPayment(Long workerId, Integer days) throws IllegalAccessException {

		try {
			// Call with RestTemplate
			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put("id", "" + workerId);
			// URI, Tipo do objeto buscado e Parâmetros.
			Worker worker = restTemplate.getForObject(URI, Worker.class, uriVariables);
			
//			Worker worker = workerFeignClient.findById(workerId).getBody();
			if (worker == null) {
				logger.error("Worker not found: " + worker);
				throw new IllegalAccessException("Worker not found");
			}
			
			Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
			logger.info("Worker found: " + worker);
			return ResponseEntity.ok(payment);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}

	}
}