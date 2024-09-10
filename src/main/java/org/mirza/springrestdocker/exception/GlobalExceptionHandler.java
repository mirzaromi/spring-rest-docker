package org.mirza.springrestdocker.exception;

import lombok.extern.slf4j.Slf4j;
import org.mirza.springrestdocker.dto.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<BaseResponse<Object>> handleValidationException(NotFoundException ex) {
        log.warn("Exception API exception caught", ex);
        BaseResponse<Object> response = new BaseResponse<>();
        response.setStatus(ex.getResponseCode().code());
        response.setMessage(ex.getMessage());
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
