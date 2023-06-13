package codegym.service;

import codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();
    Customer findCustomerById(long idCustomer);
}
