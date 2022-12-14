package com.tpt.model.hibernate;
// default package
// Generated Dec 5, 2022, 10:49:34 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Quanhuyen generated by hbm2java
 */
@Entity
@Table(name = "quanhuyen", catalog = "timphong")
public class Quanhuyen implements java.io.Serializable {

	private Long id;
	private Tinhthanhpho tinhthanhpho;
	private String tenQuanHuyen;
	private Set<Xaphuong> xaphuongs = new HashSet<Xaphuong>(0);

	public Quanhuyen() {
	}

	public Quanhuyen(Tinhthanhpho tinhthanhpho, String tenQuanHuyen) {
		this.tinhthanhpho = tinhthanhpho;
		this.tenQuanHuyen = tenQuanHuyen;
	}

	public Quanhuyen(Tinhthanhpho tinhthanhpho, String tenQuanHuyen, Set<Xaphuong> xaphuongs) {
		this.tinhthanhpho = tinhthanhpho;
		this.tenQuanHuyen = tenQuanHuyen;
		this.xaphuongs = xaphuongs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tinhThanhPhoId", nullable = false)
	public Tinhthanhpho getTinhthanhpho() {
		return this.tinhthanhpho;
	}

	public void setTinhthanhpho(Tinhthanhpho tinhthanhpho) {
		this.tinhthanhpho = tinhthanhpho;
	}

	@Column(name = "tenQuanHuyen", nullable = false, length = 200)
	public String getTenQuanHuyen() {
		return this.tenQuanHuyen;
	}

	public void setTenQuanHuyen(String tenQuanHuyen) {
		this.tenQuanHuyen = tenQuanHuyen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quanhuyen")
	public Set<Xaphuong> getXaphuongs() {
		return this.xaphuongs;
	}

	public void setXaphuongs(Set<Xaphuong> xaphuongs) {
		this.xaphuongs = xaphuongs;
	}

}
