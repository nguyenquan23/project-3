package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")

public class Admin {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "tendangnhap")
	private String username;
	@Column(name = "matkhau")
	private String password;
	@Column(name = "ten")
	private String name;
	@Column(name = "sodienthoai")
	private String phone;
	@Column(name = "diachi")
	private String address;
	@Column(name = "machucvu")
	private String titleName;

	public Admin() {
		
	}

	public Admin(String id, String username, String password, String name, String phone, String address,
			String titleName) {

		this.id = id;
		this.username = username;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", phone="
				+ phone + ", address=" + address + ", titleName=" + titleName + "]";
	}

}
