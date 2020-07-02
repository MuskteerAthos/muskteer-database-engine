package com.data2.example;

import com.data2.salmon.DataBase;
import com.data2.salmon.Mapper;
import com.data2.salmon.Salmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.data2"})
public class ExampleApplication {

//    @Autowired(required = false)
//    @Mapper(file = "mapper1", database = DataBase.PARTITION, name = "salman_partition_dao")
//    public Salmon salmon;

    @Autowired(required = false)
    @Mapper(file = "mapper1", database = DataBase.JDBC, name = "salman_jdbc_dao")
    public Salmon salmon2;

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);

    }

    @RequestMapping("/")
    public void test(){
        System.out.println("test....");
//        Object obj = salmon.select("test")
//                .param(Collections.singletonMap("articleID","243992049376706560")).execute();
//        System.out.println(obj);

        Object obj2 = salmon2.select("test")
                .param(Collections.singletonMap("articleID","243992049376706560")).execute();
        System.out.println(obj2);
    }


}