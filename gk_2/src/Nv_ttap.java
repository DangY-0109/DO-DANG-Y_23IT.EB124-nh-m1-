
import java.util.Date;

public class Nv_ttap implements Nv_interface {
	private Date thoiGian_TN;
	private String xepLoai;
	private String truong_TN;
	private int iD;
	private String full_Name;
	private Date birth_Day;
	private int phone;
	protected String email;
	private String employee_Type;
	private int employee_count;

	public Nv_ttap() {
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

	public Nv_ttap( String xepLoai, String truong_TN, int iD, String full_Name,
			 int phone, String email) {
		super();
		this.xepLoai = xepLoai;
		this.truong_TN = truong_TN;
		this.iD = iD;
		this.full_Name = full_Name;
		this.phone = phone;
		this.email = email;
		
	}

	public Date getThoiGian_TN() {
		return thoiGian_TN;
	}

	public void setThoiGian_TN(Date thoiGian_TN) {
		this.thoiGian_TN = thoiGian_TN;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	public String getTruong_TN() {
		return truong_TN;
	}

	public void setTruong_TN(String truong_TN) {
		this.truong_TN = truong_TN;
	}

	@Override
	public String toString() {
		return "Employee_Fresher [thoiGian_TN=" + thoiGian_TN + ", xepLoai=" + xepLoai + ", truong_TN=" + truong_TN
				+ ", iD=" + iD + ", full_Name=" + full_Name + ", birth_Day=" + birth_Day + ", phone=" + phone
				+ ", email=" + email + ", employee_Type=" + employee_Type + ", employee_count=" + employee_count
				 + "]";
	}

	@Override
	public void HienThi() {
		System.out.println("Employee_Fresher [thoiGian_TN=" + thoiGian_TN + ", xepLoai=" + xepLoai + ", truong_TN="
				+ truong_TN + ", iD=" + iD + ", full_Name=" + full_Name + ", birth_Day=" + birth_Day + ", phone="
				+ phone + ", email=" + email + ", employee_Type=" + employee_Type + ", employee_count=" + employee_count
				+ "]");
	}
}
