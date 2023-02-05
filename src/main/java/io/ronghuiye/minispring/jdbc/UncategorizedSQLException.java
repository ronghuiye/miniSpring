package io.ronghuiye.minispring.jdbc;

import java.sql.SQLException;

public class UncategorizedSQLException extends RuntimeException {
    public UncategorizedSQLException(String message) {
        super(message);
    }

    public UncategorizedSQLException(String task, String message, SQLException ex) {
        super(message, ex);
    }
}
