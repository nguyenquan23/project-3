package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="thanhtra")
public class Inspect {
	@Id
	@Column(name ="id")
	private String id;
	@Column(name ="taikhoan")
	private String userName;
	@Column(name ="matkhau")
	private String password;
	@Column(name ="ten")
	private String name;
	@Column(name="sodienthoai")
	private int phone;
	@Column(name ="diachi")
	private String address;
	@Column(name ="machucvu")
	private  String titleName;
	
public Inspect() {
	
}

public Inspect(String id, String userName, String password, String name, int phone, String address, String titleName) {
	
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.name = name;
	this.phone = phone;
	this.address = address;
	this.titleName = titleName;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getTitleName() {
	return titleName;
}

public void setTitleName(String titleName) {
	this.titleName = titleName;
}

@Override
public String toString() {
	return "Inspect [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name + ", phone="
			+ phone + ", address=" + address + ", titleName=" + titleName + "]";
}

}

