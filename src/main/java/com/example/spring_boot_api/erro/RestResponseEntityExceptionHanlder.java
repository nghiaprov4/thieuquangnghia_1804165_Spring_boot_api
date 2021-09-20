package com.example.spring_boot_api.erro;

import com.example.spring_boot_api.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

public class RestResponseEntityExceptionHanlder extends StudentNotFoundException {

    public ResponseEntity<ErrorMessage> departmentNotFoundException(
            StudentNotFoundException exception, WebRequest request) {
        ErrorMessage message =
                new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}


