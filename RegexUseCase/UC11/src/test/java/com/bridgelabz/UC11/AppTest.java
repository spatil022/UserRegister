package com.bridgelabz.UC11;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {

	@Test
	public void validateFirstNameTrueCase() 
	{
	boolean result= App.CheckFirstName();
	assertEquals(true, result);
	}
@Test
public void validateFirstNameFalseCase() 
	{
	boolean result= App.CheckFirstName();
	assertEquals(false, result);
	}

@Test
public void validateLastNameTrueCase() 
	{

	boolean result= App.CheckLastName();
	assertEquals(true, result);

	}


@Test
public void validateLastNameFalseCase() 
	{
	boolean result= App.CheckLastName();
	assertEquals(false, result);
	}

}
