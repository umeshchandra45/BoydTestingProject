package com.Boyd.Exceptions;

public class DriverNotCreatedException extends
RuntimeException{
	
	 public DriverNotCreatedException() {
	        super("The driver is null. Please pass a valid driver to webautil.");
	    }

}
