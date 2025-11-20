package com.example.demo.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object)
            throws HibernateException {

        String prefix = "s";

        try (Connection connection = session.getJdbcConnectionAccess().obtainConnection();
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(
                    "SELECT Student_ID FROM student ORDER BY Student_ID DESC LIMIT 1" //remember to fix the statement
            );

            if (rs.next()) {
                String lastId = rs.getString(1);   // e.g., s1002
                int number = Integer.parseInt(lastId.substring(1)) + 1;
                return prefix + number;
            } else {
                return prefix + "1001";
            }

        } catch (SQLException e) {
            throw new HibernateException("Unable to generate Student ID", e);
        }
    }
}
