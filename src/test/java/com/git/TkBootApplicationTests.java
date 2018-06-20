package com.git;

import com.example.TkBootApplication;
import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TkBootApplication.class)
public class TkBootApplicationTests {

    @Autowired
    private CustomerService customerService;

    @Test
    public void contextLoads() {

        Customer customer = customerService.findByPrimaryKey(1L);
        System.out.println(customer);

    }

}
