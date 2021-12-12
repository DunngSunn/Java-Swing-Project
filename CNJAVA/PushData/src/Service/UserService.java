package Service;

import DAO.UserDAO;

public class UserService {
    private UserDAO userDAO;
    
    public UserService() {
        userDAO = new UserDAO();
    }
    
    public boolean checkUser(String name, String pass){
        return userDAO.checkUserWithNamePass(name, pass);
    }
}
