package com.example.demo;

import io.restassured.RestAssured;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class CarSystemTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }

    @Test
    void greet_shouldReturnHelloWorld() {
        given().port(8080)
                .when().get("/greeting")
                .then().body(equalTo("Hello, World!"));
    }
}