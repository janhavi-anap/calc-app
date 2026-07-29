package com.janhavi.example.calcapp.service;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.lang.reflect.Method;

public class CalculationTest {
    Calculation calc;
    Logger logger = LoggerFactory.getLogger(CalculationTest.class);
    @BeforeEach
    public void setUp(){
        logger.info("setup initiated and service instantiated ");
        calc=new Calculation();
    }
    @Test
    public void testAdd(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(9.0,calc.add(3.0,6.0));
    }
    @Test
    public void testSub(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(4.0,calc.sub(6.0,2.0));
    }
    @Test
    public void testMul(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(12.0,calc.mul(6.0,2.0));
    }
    @Test
    public void testDiv(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(3.0,calc.div(6.0,2.0));
    }
    @Test
    public void testPow(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(36.0,calc.pow(6.0,2.0));
    }
    @Test
    public void testAdd3(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(18.0,calc.add3(3.0,6.0,9.0));
    }
    @Test
    public void testAdd4(){
        Assertions.assertNotNull(calc, "service object is null");
        Assertions.assertEquals(19.0,calc.add4(3.0,6.0,9.0,1.0));
    }
    @AfterEach
    public  void  tearDown(){
        calc=null;
        logger.info("tear down:- initiated and service instance destroyed");
    }
}
