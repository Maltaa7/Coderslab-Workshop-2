package pl_coderslab.entity;

public class MainDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Ancna");
        user.setEmail("annca@gmail.com");
        user.setPassword("Annca123");
        System.out.println("userDao.create(user).getId() = " + userDao.create(user).getId());

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
