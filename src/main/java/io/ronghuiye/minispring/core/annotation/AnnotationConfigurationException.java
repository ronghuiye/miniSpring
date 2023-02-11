package io.ronghuiye.minispring.core.annotation;

public class AnnotationConfigurationException extends RuntimeException{
    public AnnotationConfigurationException(String message) {
        super(message);
    }

    public AnnotationConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
