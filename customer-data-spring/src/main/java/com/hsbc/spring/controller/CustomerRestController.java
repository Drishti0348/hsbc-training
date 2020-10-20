package com.hsbc.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hsbc.spring.entity.Customer;
import com.hsbc.spring.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(path = "/customer/find/{id}",produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getEmpDetails(@PathVariable("id") int id) {
		try {
				return ResponseEntity.ok(service.getById(id));
			} catch(RuntimeException e){
				e.printStackTrace();
				return ResponseEntity.ok("Customer Not Found");
			}
		}
	
	@GetMapping(path = "/customer",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> listAll() {
		
		return ResponseEntity.ok(service.getDetails());
		
	
	}
	
	@PostMapping(path="/customer/save",produces=MediaType.TEXT_PLAIN_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Customer c)
	{
		if(service.addCustomer(c))
		{
			return ResponseEntity.ok("Customer exist");
		}else
		{
			return ResponseEntity.ok("Emp saved Successfully");
		}
	}
		
	
	

}
