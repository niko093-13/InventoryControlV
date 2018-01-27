package jp.springboot.example.to;

/*
+-----------+------------+------+-----+---------+-------+
| Field     | Type       | Null | Key | Default | Extra |
+-----------+------------+------+-----+---------+-------+
| user_id   | char(6)    | NO   | PRI | NULL    |       |
| user_name | varchar(8) | YES  |     | NULL    |       |
| password  | char(8)    | YES  |     | NULL    |       |
+-----------+------------+------+-----+---------+-------+
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	private String id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="password")
	private String password;
	
	public User() {
		
	}
	
	public User(String id, String password) {
		super();
		this.id = id;
//		this.user_name = user_name;
		this.password = password;
	}

	public User(String id, String user_name, String password) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
