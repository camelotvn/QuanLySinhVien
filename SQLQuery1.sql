create database HeThongQuanLy
use HeThongQuanLy

create table students(
MASV nvarchar(50) primary key ,
HoTen nvarchar(50),
Email nvarchar(50),
SoDT nvarchar(15),
GioiTinh bit,
DiaChi nvarchar(50),
Hinh nvarchar(50)
)

create table grade (
ID int primary key identity,
MASV nvarchar(50),
TiengAnh int,
TinHoc int,
GDTC int
FOREIGN KEY (MASV)
  REFERENCES students(MASV)
)


create table users(
Username nvarchar(50) primary key,
Password nvarchar(50),
role nvarchar(50),
Email nvarchar(50),
isActive bit
)
 
 create table Admin(
 id int identity primary key,
 Username nvarchar(50),
 Password nvarchar(50)
 )

 select * from Admin
 insert into Admin values(N'admin','admin')
select * from users
insert into users values('vinh','123','Admin','hihi@gmail.com');

INSERT INTO students
VALUES
    ('SV001', N'Nguyễn Thị Thu Hương', 'nguyenthithuhuong@fpt.edu.vn', '0987123456', 1, 'Ha Noi', 'null')
    INSERT INTO students
VALUES('SV002', 'Trần Minh Đức', 'tranminhduc@fpt.edu.vn', '0912345678', 0, 'Ho Chi Minh', 'null')
    INSERT INTO students
VALUES('SV003', 'Lê Quang Anh', 'lequanganh@fpt.edu.vn', '0943210987', 1, 'Da Nang', 'null')
    INSERT INTO students
VALUES('SV004', 'Vũ Thị Mai Linh', 'vuthimailinh@fpt.edu.vn', '0943210987', 0, 'Hai Phong', 'null')
    INSERT INTO students
VALUES('SV005', 'Phạm Văn Tuấn', 'phamvantuan@fpt.edu.vn', '0976543210', 1, 'Ninh Thuan', 'null');
	go
CREATE TRIGGER deletegrade
ON students
INSTEAD OF DELETE
AS
BEGIN
    -- Xóa các bản ghi trong bảng grade liên quan đến hàng trong bảng students
    DELETE FROM grade
    WHERE MASV IN (SELECT MASV FROM deleted);

    -- Xóa hàng trong bảng students
    DELETE FROM students
    WHERE MASV IN (SELECT MASV FROM deleted);
END;

delete from students where MASV = 'SV002'

go
create trigger insert_students 
on students
after insert 
as begin
	declare @masv nvarchar(10)
	select @masv = MaSV from inserted
	insert into grade values(@masv,0,0,0);
end

select * from grade
select * from students
select * from users

-- test

SELECT g.MASV, s.HoTen, g.TiengAnh, g.TinHoc, g.GDTC FROM grade g JOIN students s ON g.MASV = s.MASV

