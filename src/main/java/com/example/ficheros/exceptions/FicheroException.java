package com.example.ficheros.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RestControllerAdvice
public class FicheroException {
    @ExceptionHandler(Exception.class)
    void badRequestsException(HttpServletResponse response, Exception ex) throws IOException {
        log.error("Excepción durante: {}", ex.toString());
        response.sendError(HttpStatus.METHOD_FAILURE.value());
    }
}
