package com.shardingsphere.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

/*    @Resource
    private DataSource dataSource;

    @Test
    public void insert() throws SQLException {

        Connection connection = dataSource.getConnection();
        String sql = "INSERT INTO t_order(id,user_id) VALUES(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //id%1=1,因此该条数据会被分配到t_order_1表中
        preparedStatement.setInt(1, 1);
        //user_id%1=1,因此该条数据会被分配到db1库中
        preparedStatement.setInt(2, 1);

        //最终执行的结果是：这条数据被插入到db1.t_order_1中了

        System.out.println(preparedStatement.execute());
    }

    @Test
    public void query() throws SQLException {
        //"284015699737706496"
        Connection connection = dataSource.getConnection();
        String sql = "SELECT * FROM t_user WHERE user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setLong(1, 284015699737706496L);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            System.out.println(
                    "id:" + rs.getString(1)
                            + ",user_id:" + rs.getString(2)
                            + ",city_id:" + rs.getString(3)
                            + ",user_name:" + rs.getString(4)
                            + ",age:" + rs.getString(5)
                            + ",birth:" + rs.getString(6)
            );
        }
    }*/

}

