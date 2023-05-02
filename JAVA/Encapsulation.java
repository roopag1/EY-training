
 class User{
 private int pwd;

 public int getpwd(){
    return pwd;
 }

 public void setpwd(int pwd){
    this.pwd=pwd;
 }
}
public class Encapsulation {
public static void main(String[] args){

    User m1=new User();
    m1.setpwd(5678);
    System.out.println(m1.getpwd());
   


}

}

