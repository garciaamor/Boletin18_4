package boletin18_4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Clase18_4 {
    Scanner obx=new Scanner(System.in);
  String [] letra={"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
  int [] num={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
  public int pedirdni(){
        int result;
      
       System.out.println("Introduce el DNI");
      result = obx.nextInt();
      
      
      
      
      return result;
  }
  public int darLetra(){
      int div=pedirdni();
      int aa=div%23;
      return aa;
  }
  public void visualizar(){
      int aa=darLetra();
      for (int i=0;i<num.length;i++){
          if (num[i]==aa){
              System.out.println("La letra del dni es : "+ letra[i] );
          }
      }
  }
  
  
}
