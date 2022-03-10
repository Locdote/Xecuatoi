package com.xecuatoi.service;

import java.util.List;

import com.xecuatoi.entity.XecuatoiEntity;

public interface XecuatoiService {
	public XecuatoiEntity save(XecuatoiEntity xecuatoi) ;
	public XecuatoiEntity update(XecuatoiEntity xecuatoi);
	public void delete(XecuatoiEntity xecuatoi);
	public List<XecuatoiEntity> getAll();
	public XecuatoiEntity getById(Integer id);

}
