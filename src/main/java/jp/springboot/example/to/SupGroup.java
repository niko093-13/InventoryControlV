package jp.springboot.example.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SupGroup")
public class SupGroup {
	
	@Id
	@Column(name="group_code", length = 3, nullable = false)
	private String gcode;

	@Column(name="group_name", length = 50, nullable = false)
	private String gname;
	
	public String getGcode() {
		return gcode;
	}

	public void setGcode(String gcode) {
		this.gcode = gcode;
	}
	
	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

}
