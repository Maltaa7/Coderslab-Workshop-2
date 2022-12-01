package pl_coderslab.entity;

import java.util.Arrays;

public class MainDao {

    public static void main(String[] args) {
        //create
        UserDao userDao = new UserDao();
        User user1 = new User();
        user1.setUserName("Karolina6");
        user1.setEmail("karo6@gmail.com");
        user1.setPassword("Karo123456");
        userDao.create(user1);

        User userRead = new User();
        userRead = userDao.read(3);
        System.out.println(userRead);


        User userRead2= new User();
        userRead2 = userDao.read(18);
        System.out.println(userRead2);

        User userToUpdate= new User();

        userToUpdate = userDao.read(1);
        userToUpdate.setEmail("marta@gmail.com");
        userToUpdate.setUserName("Marta");
        userToUpdate.setPassword("Marta123");
        userDao.update(userToUpdate);


        userDao.delete(9);

        User[] users = userDao.findAll();
        System.out.println("users.length = " + users.length);
        for (User user : users) {
            System.out.println(user);
        }

    }
}
