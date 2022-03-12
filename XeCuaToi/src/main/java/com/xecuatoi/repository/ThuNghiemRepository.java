package com.xecuatoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xecuatoi.entity.ThuNghiemEntity;

@Repository
public interface ThuNghiemRepository extends JpaRepository<ThuNghiemEntity, Integer>{

}
