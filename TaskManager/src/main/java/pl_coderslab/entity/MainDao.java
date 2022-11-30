package pl_coderslab.entity;

public class MainDao {

    public static void main(String[] args) {
        UserDao userDao1 = new UserDao();
        User user1 = new User();
        user1 = userDao1.read(4);
        System.out.println(user1.getUserName());
        System.out.println(user1.getPassword());
        System.out.println(user1.getEmail());

        UserDao userDao2 = new UserDao();
        User user2 = new User();
        user2 = userDao2.read(18);
        if (userDao2.read(18) == null) {
            System.out.println("Nie istnieje user o id 18");
        }

    }
}
