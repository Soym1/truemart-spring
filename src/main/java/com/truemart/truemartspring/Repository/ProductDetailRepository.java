package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.categoryEntity;
import com.truemart.truemartspring.Entity.productDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends JpaRepository<productDetailEntity,Long> {
}
