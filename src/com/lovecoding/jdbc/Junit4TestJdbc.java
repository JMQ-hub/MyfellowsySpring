package com.lovecoding.jdbc;

import com.lovecoding.jdbc.bean.UmsUser;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Junit4TestJdbc {
    public static void main(String[] args) {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(comboPooledDataSource);
        jdbcTemplate.query("select * from ums_user",new RowMapper<UmsUser>(){
            @Override
            public UmsUser mapRow(ResultSet rs, int i) throws SQLException {
                UmsUser user = new UmsUser();
                user.setName(rs.getString("name"));
                user.setId(rs.getInt("id"));
                return user;
            }
        };
    }
}
