package edu.nju.comparePrice.models;

// Generated 2014-3-26 7:32:39 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CrawlerWebsite generated by hbm2java
 */
@Entity
@Table(name = "crawler_website", catalog = "comparepricedb")
public class CrawlerWebsite implements java.io.Serializable {

	private Integer id;
	private String name;
	private String link;

	public CrawlerWebsite() {
	}

	public CrawlerWebsite(String name, String link) {
		this.name = name;
		this.link = link;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "link", length = 32)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}