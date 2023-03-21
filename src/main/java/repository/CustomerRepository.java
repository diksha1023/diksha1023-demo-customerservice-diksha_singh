package repository;

import java.util.List;

public class CustomerRepository {
    private List<Customer> customers = new ArrayList();
    public List<Customer> findAll(){
        return customers;
    }

    public int create(Customer customer){
        int id=customers.size()+1;
        customer.setId(id);
        customers.add(customer);
        return id;

    }

}
