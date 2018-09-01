package org.ys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ys.model.CoreUser;

public interface UserDao extends JpaRepository<CoreUser,String>{

}
