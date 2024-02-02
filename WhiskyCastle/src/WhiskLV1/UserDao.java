package WhiskLV1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/whiskycastle";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Zxczxc123123@";

    public boolean loginUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // 결과가 존재하면 로그인 성공
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}