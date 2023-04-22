package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.roleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<roleEntity, Integer> {
}
