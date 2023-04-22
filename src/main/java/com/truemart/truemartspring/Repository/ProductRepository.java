package com.truemart.truemartspring.Repository;

import com.truemart.truemartspring.Entity.productEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<productEntity, Long> {
    @Query("SELECT i.id,i.name,i.beginPrice,i.discountPrice FROM productEntity i WHERE i.category.category = ?1")
    List<Object[]> getproductEntitiesByCategoryAndNew(String category, Pageable pageable);
    @Query("SELECT i.id,i.name,i.beginPrice,i.discountPrice FROM productEntity i WHERE i.category.category = ?1")
    List<Object[]> getproductEntitiesByCategoryAndTopSelling(String category, Pageable pageable);
    @Query("SELECT i.id,i.name,i.beginPrice,i.discountPrice FROM productEntity i WHERE i.category.category = ?1")
    List<Object[]> getproductEntitiesByCategoryAndSuggestion(String category, Pageable pageable);
}

