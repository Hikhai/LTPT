Tuyệt! Bạn sẽ dùng **một repository duy nhất** để lưu tất cả project và đồng bộ giữa **máy bàn** và **máy trường**. Dưới đây là hướng dẫn chi tiết:  

---

## **I. Tạo một repository trên GitHub**  
1. Vào [https://github.com/](https://github.com/) và **đăng nhập**.  
2. Nhấn **New repository**.  
3. Đặt tên repository, ví dụ: `MyProjects`.  
4. Chọn **Public** hoặc **Private**.  
5. **Không chọn** "Add README", "Add .gitignore" vì ta sẽ khởi tạo trên máy.  
6. Nhấn **Create repository** và sao chép URL repository (dạng `https://github.com/user/MyProjects.git`).  

---

## **II. Khởi tạo Git trên máy bàn (tại nhà)**
1. **Mở Terminal (Git Bash hoặc CMD) trong thư mục chứa các project**  
   - Ví dụ: Nếu bạn lưu project trong `D:\MyProjects`, mở Terminal tại đó.  

2. **Khởi tạo Git và liên kết với repository GitHub**  
   ```bash
   git init
   git remote add origin https://github.com/user/MyProjects.git
   ```

3. **Thêm project vào repository**  
   - Giả sử bạn có nhiều project trong thư mục `MyProjects/`:
     ```
     MyProjects/
     ├── Project1/
     ├── Project2/
     ├── Project3/
     ```
   - Thêm tất cả file vào Git:
     ```bash
     git add .
     ```
   - Commit lần đầu:
     ```bash
     git commit -m "Initial commit with multiple projects"
     ```
   - Push code lên GitHub:
     ```bash
     git branch -M main
     git push -u origin main
     ```

---

## **III. Đồng bộ code trên máy trường**
1. **Clone repository về máy trường**  
   ```bash
   git clone https://github.com/user/MyProjects.git
   ```
   - Khi clone về, bạn sẽ có toàn bộ project trong thư mục `MyProjects`.

2. **Làm việc với project trên máy trường**  
   - Nếu sửa hoặc thêm file, chạy:  
     ```bash
     git add .
     git commit -m "Cập nhật code từ máy trường"
     git push origin main
     ```

---

## **IV. Đồng bộ lại trên máy bàn (khi về nhà)**
1. **Mở Terminal tại thư mục `MyProjects/`**  
2. **Kéo code mới nhất từ GitHub**  
   ```bash
   git pull origin main
   ```
   → Máy bàn sẽ nhận được code mới nhất từ máy trường.

---

## **V. Quy trình làm việc hàng ngày**
🔹 **Trước khi bắt đầu làm việc**:  
   - Chạy `git pull origin main` để lấy code mới nhất.  

🔹 **Sau khi hoàn thành công việc**:  
   - Chạy:  
     ```bash
     git add .
     git commit -m "Mô tả thay đổi"
     git push origin main
     ```
   - Máy nào cũng có thể cập nhật code mới nhất.

---

💡 **Lưu ý quan trọng**  
- **Luôn pull (`git pull`) trước khi làm để tránh xung đột code.**  
- Nếu có xung đột khi pull, Git sẽ yêu cầu bạn sửa, sau đó:  
  ```bash
  git add .
  git commit -m "Resolve conflict"
  git push origin main
  ```

Bây giờ bạn có thể làm việc liền mạch giữa **máy bàn** và **máy trường** với GitHub! 🚀
