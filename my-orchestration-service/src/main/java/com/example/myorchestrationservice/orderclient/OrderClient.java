package com.example.myorchestrationservice.orderclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.myorchestrationservice.dto.OrderDTO;

@FeignClient("order-service")
public interface OrderClient {
	
	@GetMapping(value= "/orders/{orderId}")
	//public String getGreetings(@PathVariable(name= "localeId") String langCode);
	public OrderDTO getOrder(@PathVariable(name= "orderId") Integer orderId);

}
