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
	@Column
	private long sup_code;
	
	@Column(length = 50, nullable = false)
	private String sup_name;
	
	@Column(nullable = false)
	private Integer price;
	
	@Column(length = 3, nullable = false)
	private String group_code;

	public long getSup_code() {
		return sup_code;
	}

	public void setSup_code(long sup_code) {
		this.sup_code = sup_code;
	}

	public String getSup_name() {
		return sup_name;
	}

	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getGroup_code() {
		return group_code;
	}

	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}
}
