package eTicaret.entities.concretes;

import eTicaret.entities.abstracts.Entity;

public class User implements Entity{

	private String ad;
	private String soyad;
	private String ePosta;
	private String password;
	
	public User() {
		
	}
	
	public User(String ad, String soyad, String ePosta, String password) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ePosta = ePosta;
		this.password = password;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
