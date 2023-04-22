package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.categoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<categoryEntity,Integer> {
}
