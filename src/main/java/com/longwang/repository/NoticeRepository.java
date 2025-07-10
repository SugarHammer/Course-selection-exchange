package com.longwang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.longwang.entity.Notice;

/**
 * 公告Repository接口
 * 
 *
 */
public interface NoticeRepository extends JpaRepository<Notice, Integer>,JpaSpecificationExecutor<Notice> {

	
}
