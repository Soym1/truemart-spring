package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.shopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<shopEntity, Long> {
}
