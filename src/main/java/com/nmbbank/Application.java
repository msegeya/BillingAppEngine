package com.nmbbank;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.nmbbank.controllers.EchoITController;
import com.nmbbank.marshalling.model.Customer;
import com.nmbbank.marshalling.model.Employees;
import com.nmbbank.marshalling.xmlconvert.XmlConverter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Resource
    private XmlConverter xmlConverter;

    @Autowired
    private EchoITController echoITController;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        final String xmlFile = "customer.xml";
        Customer cust = new Customer(20, "Jack", "Smith");

        //Convert Customer Object to Xml!
        System.out.println("Convert Customer Object to Xml!");
        xmlConverter.convertFromObjectToXML(cust, xmlFile);
        System.out.println("Done \n");

        //from XML to Customer Object
        System.out.println("Convert Xml to Customer Object!");
        Customer cust2 = (Customer) xmlConverter.convertFromXMLToObject(xmlFile);
        System.out.println(cust2.toString());
        System.out.println("Done");

        ObjectMapper objectMapper = new XmlMapper();
        Employees employees = objectMapper.readValue(
                StringUtils.toEncodedString(Files.readAllBytes(Paths.get("src/main/resources/employees.xml")), StandardCharsets.UTF_8),
                Employees.class);
        System.out.println(employees);

    }
}
