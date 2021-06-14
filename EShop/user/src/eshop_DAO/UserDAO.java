package eshop_DAO;

import eshop_common.dao.BaseDAO;
import eshop_entity.User;

import java.util.List;

public interface UserDAO extends BaseDAO {
    List<User> getEntityList() throws Exception;
}
