package jp.springboot.example.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class Sup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sup_code")
	private long scode;
	
	@Column(name="sup_name", length = 50, nullable = false)
	private String sname;
	
	@Column(nullable = false)
	private Integer price;
	
	@Column(name="group_code", length = 3, nullable = false)
	private String gcode;

	public long getScode() {
		return scode;
	}

	public void setScode(long scode) {
		this.scode = scode;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getGcode() {
		return gcode;
	}

	public void setGcode(String gcode) {
		this.gcode = gcode;
	}

}
