package io.sebradloff.controller;

import org.junit.Test;

import static org.junit.Assert.*;


public class HelloControllerTest {
    @Test
    public void index() throws Exception {
        HelloController helloController = new HelloController();
        assertEquals(helloController.index(), "Greetings from Spring Boot!");
    }

}