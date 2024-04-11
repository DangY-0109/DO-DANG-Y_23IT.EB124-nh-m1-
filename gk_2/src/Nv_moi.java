
import java.util.Date;

public class Nv_moi implements Nv_interface {
	private String nganhDangHoc;
	private String hkDangHoc;
	private String ten_Truong;
	private int iD;
	private String full_Name;
	private Date birth_Day;
	private int phone;
	protected String email;
	private String employee_Type;
	private int employee_count;

	public Nv_moi() {
		super();
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getFull_Name() {
		return full_Name;
	}

	public void setFull_Name(String full_Name) {
		this.full_Name = full_Name;
	}

	public Date getBirth_Day() {
		return birth_Day;
	}

	public void setBirth_Day(Date birth_Day) {
		this.birth_Day = birth_Day;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployee_Type() {
		return employee_Type;
	}

	public void setEmployee_Type(String employee_Type) {
		this.employee_Type = employee_Type;
	}

	public int getEmployee_count() {
		return employee_count;
	}

	public void setEmployee_count(int employee_count) {
		this.employee_count = employee_count;
	}

	public Nv_moi(String nganhDangHoc, String hkDangHoc, String ten_Truong, int iD, String full_Name,
			 int phone, String email) {
		super();
		this.nganhDangHoc = nganhDangHoc;
		this.hkDangHoc = hkDangHoc;
		this.ten_Truong = ten_Truong;
		this.iD = iD;
		this.full_Name = full_Name;
		this.phone = phone;
		this.email = email;

	}

	public String getNganhDangHoc() {
		return nganhDangHoc;
	}

	public void setNganhDangHoc(String nganhDangHoc) {
		this.nganhDangHoc = nganhDangHoc;
	}

	public String getHkDangHoc() {
		return hkDangHoc;
	}

	public void setHkDangHoc(String hkDangHoc) {
		this.hkDangHoc = hkDangHoc;
	}

	public String getTen_Truong() {
		return ten_Truong;
	}

	public void setTen_Truong(String ten_Truong) {
		this.ten_Truong = ten_Truong;
	}


	@Override
	public void HienThi() {
		System.out.println("Employee_Intern [nganhDangHoc=" + nganhDangHoc + ", hkDangHoc=" + hkDangHoc
				+ ", ten_Truong=" + ten_Truong + ", iD=" + iD + ", full_Name=" + full_Name + ", birth_Day=" + birth_Day
				+ ", phone=" + phone + ", email=" + email + ", employee_Type=" + employee_Type + ", employee_count="
				+ employee_count +"]");
	}
}
