package io.ronghuiye.minispring.jdbc;

import java.sql.SQLException;

public class CannotGetJdbcConnectionException extends RuntimeException {
    public CannotGetJdbcConnectionException(String message) {
        super(message);
    }

    public CannotGetJdbcConnectionException(String message, SQLException ex) {
        super(message, ex);
    }
}
