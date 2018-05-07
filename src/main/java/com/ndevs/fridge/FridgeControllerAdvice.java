package com.ndevs.fridge;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.ndevs.fridge.dto.ErrorResponse;
import com.ndevs.fridge.exception.NoItemFoundException;

/**
 * 
 * @author Nishanth Dharmaraju
 *
 */
@ControllerAdvice
public class FridgeControllerAdvice {

	/**
	 * Called when no handler defined for a corresponding exception
	 * 
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> globalException(Exception exception) {
		return ResponseEntity.unprocessableEntity().body(new ErrorResponse("serverError", "Internal server error"));
	}

	@ExceptionHandler(NoItemFoundException.class)
	public ResponseEntity<ErrorResponse> noItemFound(NoItemFoundException exception) {

		return ResponseEntity.ok(new ErrorResponse(exception.getErrorCode(), exception.getMessage()));

	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ErrorResponse> mismatch(MethodArgumentTypeMismatchException exception) {

		return ResponseEntity.badRequest()
				.body(new ErrorResponse(exception.getErrorCode(), exception.getLocalizedMessage()));

	}

}
