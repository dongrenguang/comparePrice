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
 * Comment generated by hbm2java
 */
@Entity
@Table(name = "comment", catalog = "comparepricedb")
public class Comment implements java.io.Serializable {

	private int id;
	private Commodity commodity;
	private User user;
	private String details;
	private int state;

	public Comment() {
	}

	public Comment(int id, Commodity commodity, User user, String details,
			int state) {
		this.id = id;
		this.commodity = commodity;
		this.user = user;
		this.details = details;
		this.state = state;
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
	@JoinColumn(name = "cid", nullable = false)
	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "details", nullable = false)
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Column(name = "state", nullable = false)
	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

}