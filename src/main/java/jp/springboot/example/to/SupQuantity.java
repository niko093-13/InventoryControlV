package jp.springboot.example.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sup_quantity")
public class SupQuantity {
	
	@Id
	@Column(name="sup_code")
	private long scode;

	@Column(name="sup_value")
	private long svalue;
	
	public long getScode() {
		return scode;
	}

	public void setScode(long scode) {
		this.scode = scode;
	}
	
	public long getSvalue() {
		return svalue;
	}

	public void setSvalue(long svalue) {
		this.svalue = svalue;
	}


}
