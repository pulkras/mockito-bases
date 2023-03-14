package ru.pulkras;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CarTest {

    @Mock
    Car car;

    @BeforeEach
    void createCar() {
//               car = new Car("", "", 2014, ""); // default
//        car = Mockito.mock(Car.class); // by mockito
        MockitoAnnotations.initMocks(this); // with annotation @Mock we can do so
    }

    @Test
    void testGetManufacturerMethod() {
        assertEquals(null, car.getManufacturer());

    }

    @Test
    void testGetYearMethod() {
        assertEquals(0, car.getYear());
    }

    @Test
    void remoteServiceReturnIntValue() {
        when(car.testInt(4)).thenReturn(10);
        assertEquals(10, car.testInt(4));
    }

    @Test
    void testGetOwnerMethod() {
        when(car.getOwner()).thenReturn("Dmitrij");
        assertEquals("Dmitrij", car.getOwner());
    }

    @Test
    void verificationTest() {
        car.getOwner();
        car.testInt(4);

        verify(car).getOwner(); // is method called?
        verify(car).testInt(4);

        assertEquals(null, car.getManufacturer());

        verify(car).getManufacturer(); // it works with assertEquals
    }

}