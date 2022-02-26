package Removingwhitespacefromastring;

public class Removingwhitespacefromastring {

  public static void main(String[] args) {
  
    String str = " G O O D M O R N I N G";
    
   
    str = str.replaceAll("\\s", ""); 

       

        System.out.println(str); 

 
  }
}
