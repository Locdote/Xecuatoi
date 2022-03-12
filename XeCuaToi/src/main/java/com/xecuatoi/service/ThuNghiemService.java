package com.xecuatoi.service;

import java.util.List;

import com.xecuatoi.entity.ThuNghiemEntity;

public interface ThuNghiemService {
	public ThuNghiemEntity save(ThuNghiemEntity thunghiem);
	public ThuNghiemEntity update(ThuNghiemEntity thunghiem);
	public void delete (ThuNghiemEntity thunghiem);
	public List<ThuNghiemEntity> getAll();
	public ThuNghiemEntity getById(Integer id);
}
