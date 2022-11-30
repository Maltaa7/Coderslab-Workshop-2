package pl_coderslab.entity;


import pl_coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static final String READ_USER_QUERY = "SELECT email, username, password FROM users WHERE id = ?";
    public User read(int userId) {
        User user = new User();
        user.setId(userId);
        try (Connection connection = DbUtil.connect();
             PreparedStatement preStmt = connection.prepareStatement(READ_USER_QUERY)) {
            preStmt.setInt(1, userId);
            ResultSet rs = preStmt.executeQuery();
            if (rs.next()) {
                user.setEmail(rs.getString("email"));
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
