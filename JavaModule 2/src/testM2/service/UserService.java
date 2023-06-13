package testM2.service;

import testM2.utils.FileUtils;
import testM2.view.User;

import java.util.List;

public class UserService{
    private final String filename = "D:\\Module2\\JavaModule 2\\src\\testM2\\data\\dataUser.txt";
    public List<User> getAllUsers(){
        return FileUtils.readFile(filename);
    };
    public void addUser(User user){
        List<User> users = FileUtils.readFile(filename);
        users.add(user);

        FileUtils.writeFile(filename, users);
    }

}
