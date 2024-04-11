
import java.util.Date;

public class Nv_launam implements Nv_interface {

	@Override
	public void HienThi() {
		System.out.println("Employee_Experience [nam_KinhNghiem=" + nam_KinhNghiem + ", ki_Nang=" + ki_Nang + ", iD="
				+ iD + ", full_Name=" + full_Name + ", birth_Day=" + birth_Day + ", phone=" + phone + ", email=" + email
				+ ", employee_Type=" + employee_Type + ", employee_count=" + employee_count + "]");
	}

	private int nam_KinhNghiem;
	private Date birth_Day;
	private int phone;
	protected String email;
	private String employee_Type;
	private int employee_count;
	private String ki_Nang;
	private int iD;
	private String full_Name;
	

	public Nv_launam() {
		super();
	}

	public Nv_launam(int nam_KinhNghiem, String ki_Nang, int iD, String full_Name, int phone,
			String email) {
		super();
		this.nam_KinhNghiem = nam_KinhNghiem;
		this.ki_Nang = ki_Nang;
		this.iD = iD;
		this.full_Name = full_Name;
		this.phone = phone;
		this.email = email;
	}

	public int getNam_KinhNghiem() {
		return nam_KinhNghiem;
	}

	public void setNam_KinhNghiem(int nam_KinhNghiem) {
		this.nam_KinhNghiem = nam_KinhNghiem;
	}

	public String getKi_Nang() {
		return ki_Nang;
	}

	public void setKi_Nang(String ki_Nang) {
		this.ki_Nang = ki_Nang;
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

	@Override
	public String toString() {
		return "Employee_Experience [nam_KinhNghiem=" + nam_KinhNghiem + ", ki_Nang=" + ki_Nang + ", iD=" + iD
				+ ", full_Name=" + full_Name + ", birth_Day=" + birth_Day + ", phone=" + phone + ", email=" + email
				+ ", employee_Type=" + employee_Type + ", employee_count=" + employee_count + "]";
	}

}
