package com.xecuatoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "menu")

public class ThuNghiemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id")
	public int id;
	
	@Column(name= "name")
	public String name;
	
	@Column(name= "id_cha")
	public int id_cha;
	
	public int getId_cha() {
		return id_cha;
	}
	public void setId_cha(int id_cha) {
		this.id_cha = id_cha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
