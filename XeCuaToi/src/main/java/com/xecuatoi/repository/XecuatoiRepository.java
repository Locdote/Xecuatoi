package com.xecuatoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xecuatoi.entity.XecuatoiEntity;

@Repository
public interface XecuatoiRepository extends JpaRepository<XecuatoiEntity, Integer>{

}
