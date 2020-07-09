package com.data2.salmon.example;

import com.data2.salmon.core.Salmon;
import com.data2.salmon.core.engine.enums.DataBase;
import com.data2.salmon.core.engine.inter.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @author leewow
 */
@SpringBootApplication(scanBasePackages = "com.data2")
@RestController
public class SalmonExampleApplication {

    @Autowired(required = false)
    @Mapper(file = "mapper", database = DataBase.JDBC, name = "salman_jdbc_dao")
    public Salmon salmon;

    public static void main(String[] args) {
        SpringApplication.run(SalmonExampleApplication.class, args);
    }

    @RequestMapping("/easy")
    public Object testEasy() {
        return salmon.select("easy").execute();
    }

    @RequestMapping("/single")
    public Object testSingle() {
        Map map = (Map) salmon.select("single").execute(Collections.singletonMap("articleID", "243992049376706560"));
        return map;
    }

    @RequestMapping("/single2")
    public Object testSingle2() {
        Map map = (Map) salmon.select("single2").execute("243992049376706560");
        return map;
    }



}
