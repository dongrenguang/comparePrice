package edu.nju.comparePrice.models;

// Generated 2014-3-19 22:36:57 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Navy generated by hbm2java
 */
@Entity
@Table(name = "navy", catalog = "comparepricedb")
public class Navy implements java.io.Serializable {

	private int id;
	private User user;

	public Navy() {
	}

	public Navy(int id, User user) {
		this.id = id;
		this.user = user;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}