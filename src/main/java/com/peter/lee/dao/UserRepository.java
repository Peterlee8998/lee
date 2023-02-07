package com.peter.lee.dao;

import com.peter.lee.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: lee
 * @description: 用户信息集
 * @author: Peter
 * @date: 2023/2/6 10:16
 **/
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByNameAndPasswd(String name, String passwd);
}
