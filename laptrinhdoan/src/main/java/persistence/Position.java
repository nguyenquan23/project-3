package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "chucvu")
public class Position {
	
	@Id
	@Column(name = "machucvu")
	private String titleCode;
	@Column(name ="tenchucvu")
	private String titleName;
	public Position() {
		// TODO Auto-generated constructor stub
	}
	
	public Position(String titleCode, String titleName) {
		
		this.titleCode = titleCode;
		this.titleName = titleName;
	}

	public String getTitleCode() {
		return titleCode;
	}
	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	@Override
	public String toString() {
		return "Position [titleCode=" + titleCode + ", titleName=" + titleName + "]";
	}
	
}