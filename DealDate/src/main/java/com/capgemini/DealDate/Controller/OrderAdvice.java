package com.capgemini.DealDate.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.capgemini.DealDate.Exception.ErrorInfo;
import com.capgemini.DealDate.Exception.OrderException;



public class OrderAdvice {

	@ExceptionHandler(value= {OrderException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ErrorInfo handleException(Exception ex) {
		return new ErrorInfo(ex.getMessage());
	}
}
