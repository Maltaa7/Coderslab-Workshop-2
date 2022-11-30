
package pl_coderslab.entity;

public class MainDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Ancna");
        user.setEmail("annca@gmail.com");
        user.setPassword("Annca123");
        System.out.println("userDao.create(user).getId() = " + userDao.create(user).getId());


    }
}