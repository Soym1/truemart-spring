package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.productDetailEntity;
import com.truemart.truemartspring.Entity.reviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<reviewEntity,Long> {
}
