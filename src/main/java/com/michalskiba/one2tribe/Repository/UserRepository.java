package com.michalskiba.one2tribe.Repository;

import com.michalskiba.one2tribe.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

}
