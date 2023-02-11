package io.ronghuiye.minispring.test.service;

import io.ronghuiye.minispring.jdbc.support.JdbcTemplate;

import java.sql.SQLException;

public interface JdbcService {
    void saveDataWithTranslation() throws SQLException;
    void saveData(JdbcTemplate jdbcTemplate) ;
}
