package com.academy.cic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import com.academy.cic.entity.Apartment;
import com.academy.cic.exception.BadRequestException;
import com.academy.cic.exception.EntityNotFoundException;

public class ServiceTest {
	
	private static Dao dao;
	
	private static Service service;
	
	@BeforeAll
	static void init() {

		dao = Mockito.mock(Dao.class);
		service = new Service(dao);
	}
	
	@Test
	void should_ReturnException_WhenApartmentIsNull() {
		Mockito.when(dao.findApartment(Mockito.anyInt())).thenReturn(null);
		Executable executable = () -> service.rateApartment(1);
		EntityNotFoundException ex = assertThrows(EntityNotFoundException.class, executable);
		
		assertEquals("Apartment with id 1 not found", ex.getMessage());
	}
	
	
	@ParameterizedTest
	@CsvSource(value = {"0.0,250000.0,-1","72.0,250000.0,0","48.0,350000.0,1","30.0,600000.0,2"})
	void should_ReturnCorrectRating_ForEachCase(double area, BigDecimal price, int expectedRating) throws EntityNotFoundException {
		Apartment apartment = new Apartment(area, price);
		
		Mockito.when(dao.findApartment(Mockito.anyInt())).thenReturn(apartment);
		
		Integer actualRating = service.rateApartment(0);
		
		assertEquals(expectedRating, actualRating);
	}
	
	@Test
	void should_ReturnException_WhenAreaAbove1000() {
		
		Executable executable = () -> service.updateArea(1, 1001);
		
		BadRequestException ex = assertThrows(BadRequestException.class, executable);
		
		assertEquals("Cannot update area to a value greater than 1000", ex.getMessage());
	}
	
	@Test
	void should_ReturnException_WhenApartmentIsNull_UpdateAreaMethod() {
		Mockito.when(dao.findApartment(Mockito.anyInt())).thenReturn(null);
		Executable executable = () -> service.updateArea(1,500);
		EntityNotFoundException ex = assertThrows(EntityNotFoundException.class, executable);
		
		assertEquals("Apartment with id 1 not found", ex.getMessage());
	}
	
	@Test
	void should_ReturnRating_WhenApartmentIsNotNull_UpdateAreaMethod() throws BadRequestException, EntityNotFoundException {
		Apartment apartment = new Apartment(0, new BigDecimal(350000.0));
		double newArea =48.0;
		
		Mockito.when(dao.findApartment(Mockito.anyInt())).thenReturn(apartment);
		Mockito.when(dao.updateApartment(Mockito.any())).thenReturn(apartment);
		
		int rating =service.updateArea(1, newArea);
		
		assertEquals(1,rating);
		
	}
}
