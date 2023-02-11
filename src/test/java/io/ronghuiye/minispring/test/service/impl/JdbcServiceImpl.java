package io.ronghuiye.minispring.test.service.impl;

import io.ronghuiye.minispring.jdbc.support.JdbcTemplate;
import io.ronghuiye.minispring.test.service.JdbcService;
import io.ronghuiye.minispring.tx.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.sql.Statement;

public class JdbcServiceImpl implements JdbcService {
    private Statement statement;

    public JdbcServiceImpl() {
    }

    public JdbcServiceImpl(Statement statement) {
        this.statement = statement;
    }

    @Override
    public void saveDataWithTranslation() throws SQLException {
        statement.execute("insert into teacher(teacher_name) values ('Miss Zhao')");

        statement.execute("insert into user(id,username) values(1,'duplicate1')");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveData(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("insert into teacher(teacher_name) values ('Miss Li')");
        jdbcTemplate.execute("insert into user(id,username) values(1,'duplicate')");
    }
}
