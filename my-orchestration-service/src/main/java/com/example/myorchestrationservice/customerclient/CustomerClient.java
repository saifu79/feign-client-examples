package com.example.myorchestrationservice.customerclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.myorchestrationservice.dto.CustomerDTO;

@FeignClient("customer-service")
public interface CustomerClient {
	
	@GetMapping(value= "/customers/{customerId}")
	public CustomerDTO getCustomer(@PathVariable(name= "customerId") Integer customerId);
	
}
