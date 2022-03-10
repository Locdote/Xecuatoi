package com.xecuatoi.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")

public class XecuatoiEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name= "trangchu")
	private String trangchu;
	
	@Column(name= "mauxe")
	private String mauxe;
	
	@Column(name= "giaxe")
	private String giaxe;
	
	@Column(name= "tragop")
	private String tragop;
	
	@Column(name= "tintuc")
	private String tintuc;
	
	@Column(name= "lienhe")
	private String lienhe;
	
	public int getId() {
		return id;
	}

	public String getTrangchu() {
		return trangchu;
	}

	public void setTrangchu(String trangchu) {
		this.trangchu = trangchu;
	}

	public String getMauxe() {
		return mauxe;
	}

	public void setMauxe(String mauxe) {
		this.mauxe = mauxe;
	}

	public String getGiaxe() {
		return giaxe;
	}

	public void setGiaxe(String giaxe) {
		this.giaxe = giaxe;
	}

	public String getTragop() {
		return tragop;
	}

	public void setTragop(String tragop) {
		this.tragop = tragop;
	}

	public String getTintuc() {
		return tintuc;
	}

	public void setTintuc(String tintuc) {
		this.tintuc = tintuc;
	}

	public String getLienhe() {
		return lienhe;
	}

	public void setLienhe(String lienhe) {
		this.lienhe = lienhe;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}