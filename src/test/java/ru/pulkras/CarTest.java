package ru.pulkras;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void createCar() {
//               car = new Car("", "", 2014, ""); // default
        car = Mockito.mock(Car.class); // by mockito
    }

    @Test
    void testGetManufacturerMethod() {
        assertEquals(null, car.getManufacturer());

    }

    @Test
    void testGetYearMethod() {
        assertEquals(0, car.getYear());
    }

}