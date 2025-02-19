package MyFrame2; // Đặt class này vào package MyFrame2

public class SinhVien {
    public String ht, tenlop, masv;
    public float dtb;

    public SinhVien(String masv, String ht, String tenlop, float dtb) {
        this.masv = masv;
        this.ht = ht;
        this.tenlop = tenlop;
        this.dtb = dtb;
    }

    public void DoiTen(String ht) { // Đổi lại họ tên sinh viên
        this.ht = ht;
    }

    public void DoiDtb(float dtb) { // Thay đổi điểm trung bình
        this.dtb = dtb;
    }

    public void DoiLop(String tenlop) { // Thay đổi tên lớp
        this.tenlop = tenlop;
    }
}
