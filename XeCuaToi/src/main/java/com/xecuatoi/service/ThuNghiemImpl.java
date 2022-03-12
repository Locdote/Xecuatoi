package com.xecuatoi.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.xecuatoi.entity.ThuNghiemEntity;
import com.xecuatoi.repository.ThuNghiemRepository;

@Service
public class ThuNghiemImpl implements ThuNghiemService {

	@Autowired
	public ThuNghiemRepository thunghiemRepo;
	{

	}

	@Override
	public ThuNghiemEntity save(ThuNghiemEntity thunghiem) {
		return thunghiemRepo.saveAndFlush(thunghiem);
	}

	@Override
	public ThuNghiemEntity update(ThuNghiemEntity thunghiem) {
		return thunghiemRepo.saveAndFlush(thunghiem);
	}

	@Override
	public void delete(ThuNghiemEntity thunghiem) {
		thunghiemRepo.delete(thunghiem);
	}

	@Override
	public List<ThuNghiemEntity> getAll() {
		return thunghiemRepo.findAll();
	}

	@Override
	public ThuNghiemEntity getById(Integer id) {
		return thunghiemRepo.getById(id);
	}
}