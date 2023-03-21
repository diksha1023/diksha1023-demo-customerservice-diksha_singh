package edu.iu.p565.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")

public class CustomerController {

    @GetMapping
    public List<Customer> findAll(){
        
        return repository.findAll();
    }

    @PostMapping
    public int create(@RequestBody Customer customer){
        return repository
    }
    
}
