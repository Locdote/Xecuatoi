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

import com.xecuatoi.entity.XecuatoiEntity;
import com.xecuatoi.repository.XecuatoiRepository;

@Service
public class XecuatoiImpl implements XecuatoiService {

	@Autowired
	public XecuatoiRepository xecuatoiRepo;
	{

	}

	@Override
	public XecuatoiEntity save(XecuatoiEntity xecuatoi) {
		return xecuatoiRepo.saveAndFlush(xecuatoi);
	}

	@Override
	public XecuatoiEntity update(XecuatoiEntity xecuatoi) {
		return xecuatoiRepo.saveAndFlush(xecuatoi);
	}

	@Override
	public void delete(XecuatoiEntity xecuatoi) {
		xecuatoiRepo.delete(xecuatoi);
	}

	@Override
	public List<XecuatoiEntity> getAll() {
		return xecuatoiRepo.findAll();
	}

	@Override
	public XecuatoiEntity getById(Integer id) {
		return xecuatoiRepo.getById(id);
	}
}