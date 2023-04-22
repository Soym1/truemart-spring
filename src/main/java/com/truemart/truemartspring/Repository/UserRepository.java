package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<userEntity, Long> {
    Optional<userEntity> findUserByUsername(String username);
    Optional<userEntity> findUserByEmail(String email);


}
