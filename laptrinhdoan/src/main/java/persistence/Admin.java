package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin")

public class Admin {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "tai_khoan")
	private String username;
	@Column(name = "mat_khau")
	private String password;
	@Column(name = "ten")
	private String name;
	@Column(name = "sodienthoai")
	private Integer phone;
	@Column(name = "diachi")
	private String address;
	
	
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="machucvu", referencedColumnName = "machucvu")
	private Position position;


	
	public Admin() {
		
	}

	

	public Admin(String id, String username, String password, String name, Integer phone, String address,
			Position position) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.position = position;
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", phone="
				+ phone + ", address=" + address + ", position=" + position + "]";
	}

}
