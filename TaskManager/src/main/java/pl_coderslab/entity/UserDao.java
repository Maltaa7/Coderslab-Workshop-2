package pl_coderslab.entity;


import org.mindrot.jbcrypt.BCrypt;
import pl_coderslab.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private static final String UPDATE_USER_QUERY = "UPDATE users SET email = ?, username =?, password =? WHERE id = ?";


    public void update(User user) {
        try (Connection connection = DbUtil.connect();
             PreparedStatement statement = connection.prepareStatement(UPDATE_USER_QUERY)) {
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getUserName());
            statement.setString(3, hashPassword(user.getPassword()));
            statement.setInt(4, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
