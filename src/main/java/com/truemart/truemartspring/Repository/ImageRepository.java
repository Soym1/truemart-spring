package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.imageProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<imageProductEntity,Long> {
    @Query("SELECT i FROM imageProductEntity i WHERE i.product.id = ?1")
    List<imageProductEntity> findAllByProductId(Long id);
    @Query("SELECT i FROM imageProductEntity i WHERE i.product.id=?1")
    List<imageProductEntity> findOneByProductID(Long id, Pageable pageable);
}
