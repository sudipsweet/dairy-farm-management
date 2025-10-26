package com.dairy.farm.user.exception;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dairy.farm.user.dto.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
		ApiResponse apiResponse = new ApiResponse(ex.getMessage(), Boolean.FALSE);
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(value = DuplicateUserException.class)
	public ResponseEntity<ApiResponse> handleDataIntegrity(DuplicateUserException ex) {
		ApiResponse apiResponse = new ApiResponse(ex.getMessage(), Boolean.FALSE);
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.CONFLICT);

	}

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ApiResponse> handleParametersValidationError(MethodArgumentNotValidException ex) {

		String errorMsg = ex.getBindingResult().getFieldErrors().stream()
				.map(error -> error.getField() + " : " + error.getDefaultMessage()).collect(Collectors.joining(", "));
		ApiResponse apiResponse = new ApiResponse(errorMsg, Boolean.FALSE);
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.BAD_REQUEST);

	}

}
