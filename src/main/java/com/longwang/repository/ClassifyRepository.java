package com.longwang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.longwang.entity.Classify;

/**
 * 文章类别实体
 * 
 *
 */
public interface ClassifyRepository extends JpaRepository<Classify, Integer>,JpaSpecificationExecutor<Classify> {
	
}
