import java.util.Scanner;

public class Student {
private String hoVaten;
private String nganh;
private double mssv;

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

public void inTTin(){
    System.out.println("----------------");
    System.out.println("Ho va ten : "+hoVaten);
    System.out.println("Nganh hoc : "+nganh);
    System.out.println("Ma so sinh vien : "+mssv);
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
    st.inTTin();
}
}