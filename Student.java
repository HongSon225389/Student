import java.util.Scanner;

public class Student {
private String hoVaten;
private String nganh;
private int mssv;
private double luongCoBan;
private double heSoLuong;
private double LUONGMAX;

public void sethoVaTen(String name){
    this.hoVaten = name;
}
public String gethoVaTen(){
    return this.hoVaten;
}
public void setnganh(String nganh){
    this.nganh = nganh;
}
public String getnganh(){
    return this.nganh;
}
public void setmssv(int mssv){
    this.mssv = mssv;
}
public int getmssv(){
    return this.mssv;
}
public void setluongCoBan(double luong){
    this.luongCoBan = luong;
}
public void setLUONGMAX(double luongmax){
    this.LUONGMAX = luongmax;
}
public double getLUONGMAX(){
    return this.LUONGMAX;
}
public double getLuongCoBan(){
    return this.luongCoBan;
}
public void setHeSoLuong(double heso){
    this.heSoLuong = heso;
}
public double getHeSoLuong(){
    return this.heSoLuong;
}
public double Tinhluong(){
    return heSoLuong*luongCoBan;
}
public boolean tangluong(double n){
    if(luongCoBan*(heSoLuong+n)>LUONGMAX) return false;
    else heSoLuong+=n; return true;
}
public void inTTin(){
    System.out.println("----------------");
    System.out.println("Ho va ten : "+hoVaten);
    System.out.println("Nganh hoc : "+nganh);
    System.out.println("Ma so sinh vien : "+mssv);
    System.out.println("Luong nhan duoc thuc te : "+Tinhluong());
//hello
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student st = new Student();
    System.out.print("Nhap ho va ten : ");
    st.sethoVaTen(sc.nextLine());
    System.out.print("Nhap nganh hoc : ");
    st.setnganh(sc.nextLine());
    System.out.print("Nhap ma so sinh vien : ");
    st.setmssv(sc.nextInt());
    System.out.print("Nhap luong co ban : ");
    st.setluongCoBan(sc.nextDouble());
    System.out.print("Nhap he so luong : ");
    st.setHeSoLuong(sc.nextDouble());
    System.out.print("Nhap luong max : ");
    st.setLUONGMAX(sc.nextDouble());
    System.out.print("Nhap he so tang luong : ");
    st.tangluong(sc.nextDouble());
    System.out.println("Tuan dan");
    st.inTTin();
    system outdsgfs
    èoyfesoysi
}
}