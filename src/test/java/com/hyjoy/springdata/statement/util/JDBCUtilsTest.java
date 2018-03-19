package com.hyjoy.springdata.statement.util;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by hyjoy on 2018/3/19.
 */
public class JDBCUtilsTest {

    @Test
    public void getConnection() {

        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            Assert.assertNotNull(connection);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
