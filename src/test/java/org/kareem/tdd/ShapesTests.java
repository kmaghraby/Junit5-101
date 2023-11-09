package org.kareem.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTests {

    @BeforeAll
    static void beforeAll(){

        System.out.println("Before All tests");
        System.out.println("Example: generate token and start session");

    }

    @AfterAll
     static void afterAll(){

        System.out.println("After all tests");
        System.out.println("Example: close db connection");
    }
    Shapes shape;

    @BeforeEach
    void init(){

        shape  = new Shapes();
        System.out.println("init invoked Before each test!");

    }

    @Test
    void testCalculateSquareArea(){

        assertEquals(576, shape.calculateSquareArea(24), "Area of Square is not correct!");
        System.out.println("Test 1");
    }

    @Test
    void testCalculateCircleArea(){

        assertEquals(78.5, shape.calculateCircleArea(5), "Area of Circle is not correct!");
        System.out.println("Test 2");
    }

    @AfterEach
    void cleanUp() {
        System.out.println("After each test!");
    }
}
