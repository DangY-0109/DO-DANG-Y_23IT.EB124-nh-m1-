
import java.util.ArrayList;

public class QL_NV {
	ArrayList<Nv_launam> nv_LauNam = new ArrayList<Nv_launam>();
	ArrayList<Nv_ttap> nv_Moi = new ArrayList<Nv_ttap>();
	ArrayList<Nv_moi> nv_ThucTap = new ArrayList<Nv_moi>();

	public QL_NV() {
		super();
	}

	public ArrayList<Nv_launam> getNv_LauNam() {
		return nv_LauNam;
	}

	public void setNv_LauNam(ArrayList<Nv_launam> nv_LauNam) {
		this.nv_LauNam = nv_LauNam;
	}

	public ArrayList<Nv_ttap> getNv_Moi() {
		return nv_Moi;
	}

	public void setNv_Moi(ArrayList<Nv_ttap> nv_Moi) {
		this.nv_Moi = nv_Moi;
	}

	public ArrayList<Nv_moi> getNv_ThucTap() {
		return nv_ThucTap;
	}

	public void setNv_ThucTap(ArrayList<Nv_moi> nv_ThucTap) {
		this.nv_ThucTap = nv_ThucTap;
	}

	public void themdanhsach(Nv_launam ex) {
		nv_LauNam.add(ex);
	}

	public void themdanhsach1(Nv_moi ex) {
		nv_ThucTap.add(ex);
	}

	public void themdanhsach2(Nv_ttap ex) {
		nv_Moi.add(ex);
	}

	public int laysldanhsach() {

		return this.nv_LauNam.size();
	}

	public int laysldanhsach2() {

		return this.nv_Moi.size();
	}

	public int laysldanhsach3() {

		return this.nv_ThucTap.size();
	}

	public void lamrongdanhsach() {
		this.nv_LauNam.clear();
	}

	public void lamrongdanhsach2() {
		this.nv_Moi.clear();
	}

	public void lamrongdanhsach3() {
		this.nv_ThucTap.clear();
	}

	public void hienthi() {
		for (Nv_launam launam : nv_LauNam) {
			System.out.println(launam.toString());
		}
	}

	public void hienthi2() {
		for (Nv_ttap moi : nv_Moi) {
			System.out.println(moi.toString());
		}
	}

	public void hienthi3() {
		for (Nv_moi thuctap : nv_ThucTap) {
			System.out.println(thuctap.toString());
		}
	}

	public boolean xoasinhvien(Nv_launam ln) {
		return this.nv_LauNam.remove(ln);
	}
}
