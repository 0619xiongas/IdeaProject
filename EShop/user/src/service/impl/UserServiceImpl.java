package service.impl;

import eshop_DAO.UserDAO;
import eshop_DAO.impl.UserDAOimpl;
import eshop_entity.User;
import service.UserService;

import java.util.List;

/**
 * 用户登录，根据用户名，密码获取对象
 * 1 调用UserDAO获取用户列表数据
 *   LIST<User> getEntityList()throws Exception
 * 2 遍历用户列表，逐个与给定的用户对象的用户名，密码进行匹配
 * 3 匹配成功则返回用户对象，密码的实体对象
 */
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;
    /**
     *
     * @param user 封装了用户名跟密码
     * @return   返回User对象，或者用户名、密码错误时返回null
     * @throws Exception
     */
    public User login(User user) throws Exception{
        //1 调用UserDAO获取用户数据
        userDAO = new UserDAOimpl();
        List<User> userList = userDAO.getEntityList();
        // 遍历列表
        if(userList != null){
            for (User u: userList) {
                if(u.getUserName().equals(user.getUserName()) && u.getPassWord().equals(user.getPassWord())){
                    return u; //匹配成功返回用户对象
                }
            }
        }
        return  null; //失败返回null
    }
}
