
import java.util.Scanner;

public class Test_main {
	public static void main(String[] args) {
		QL_NV em = new QL_NV();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int chon = 0;
		while (check == true) {
			System.out.println(
					"1.Thêm nhân viên kinh nghiệm lâu năm\n2.Thêm nhân viên mới thực tập\n3.Số lượng nhân viên đã làm lâu năm\n4.Số lượng nhân viên mới\n5.Số lượng nhân viên thực tập\n6.Thêm số lượng nv mới\n7.Hiển thị sv lâu năm\n8.Hiển thị sinh viên mới\n9.Hiển thị nhân viên thực tập\n10.Xóa toàn bộ danh sách nhân viên\n11.Thoát ra");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				sc.nextLine();
				System.out.println("Năm kinh nghiệm: ");
				int namkinhnghiem = sc.nextInt();
				System.out.println("Kĩ năng: ");
				String kinang = sc.nextLine();
				sc.nextLine();
				System.out.println("Nhập ID: ");
				int id = sc.nextInt();
				System.out.println("Nhập họ và tên: ");
				String ten = sc.nextLine();
				sc.nextLine();
				System.out.println("Nhập sdt: ");
				int phone = sc.nextInt();
				System.out.println("Nhập địa chỉ email: ");
				String email = sc.nextLine();
				sc.nextLine();
				System.out.println("Đã thêm vào thành công!");
				Nv_launam ex = new Nv_launam(namkinhnghiem, kinang, id, ten, phone, email);
				em.themdanhsach(ex);
				break;
			}
			case 2: {
				sc.nextLine();
				System.out.println("Nhập ngành học: ");
				String nganhhoc = sc.nextLine();
				System.out.println("Nhập học kì đang học: ");
				String hocki = sc.nextLine();
				sc.nextLine();
				System.out.println("Nhập tên trường: ");
				String tentruong = sc.nextLine();
				System.out.println("Nhập ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập họ và tên: ");
				String ten = sc.nextLine();
				System.out.println("Nhập sđt: ");
				int phone = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập địa chỉ email: ");
				String email = sc.nextLine();
				System.out.println("Đã thêm vào thành công!");
				Nv_moi ex = new Nv_moi(nganhhoc, hocki, tentruong, id, ten, phone, email);
				em.themdanhsach1(ex);
				break;
			}
			case 3: {
				System.out.println("Số lượng nhân viên lâu năm: " + em.laysldanhsach());
				break;
			}

			case 4: {
				System.out.println("Số lượng nhân viên mới: " + em.laysldanhsach2());
				break;
			}
			case 5: {
				System.out.println("Số lượng nhân viên thực tập: " + em.laysldanhsach3());
				break;
			}
			case 6: {
				sc.nextLine();
				System.out.println("Xếp loại: ");
				String xeploai = sc.nextLine();
				System.out.println("Tên trường: ");
				String tentruong = sc.nextLine();
				sc.nextLine();
				System.out.println("Nhập ID: ");
				int id = sc.nextInt();
				System.out.println("Nhập họ và tên: ");
				String ten = sc.nextLine();
				sc.nextLine();
				System.out.println("Nhập sđt: ");
				int phone = sc.nextInt();
				System.out.println("Nhập địa chỉ email: ");
				String email = sc.nextLine();
				sc.nextLine();
				System.out.println("Đã thêm thành công!");
				Nv_ttap ex = new Nv_ttap(xeploai, tentruong, id, ten, phone, email);
				em.themdanhsach2(ex);
				break;
			}
			
			
			
			case 7:
				em.hienthi();
				break;
			case 8:
				em.hienthi2();
				break;
			case 9:
				em.hienthi3();
				break;
			case 10:
				em.lamrongdanhsach();
				em.lamrongdanhsach2();
				em.lamrongdanhsach3();
				break;
			
			case 11:
				check = false;
				System.out.println("Đã thoát thành công!");
				break;
			}

		}
	}
}
