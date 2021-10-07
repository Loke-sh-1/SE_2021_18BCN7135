/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Game starts now");
		String[][] a=new String[5][5];
		System.out.println("Enter player1 arrangement");
	a[4][0]="A-P1";a[4][1]="A-P2";a[4][2]="A-P3";a[4][3]="A-P4";a[4][4]="A-P5";
	a[0][0]="B-P1";a[0][1]="B-P2";a[0][2]="B-P3";a[0][3]="B-P4";a[0][4]="B-P5";
 /*    for(int i=1;i<4;i++){
		    for(int j=0;j<5;j++){
		        a[i][j]="-";
		    }
		    
		}*/
		
	/*		for(int i=0;i<5;i++){
		   a[4][i]=sc.next();
		}
		System.out.println("Enter player2 arrangement");
		for(int i=0;i<5;i++){
		   a[0][i]=sc.next();
		}*/
		
		
		
		display(a);
		
		System.out.println("");
		
		int c=1;
		System.out.println("Player1 Input : ");
		String m="P1:F";
		int k=4,l=0;
		String[] m1=m.split(":");
		String m2="A-"+m1[0];
		for(int p=0;p<5;p++){
		    for(int q=0;q<5;q++){
		        
		    }
		}
	
		move(c,a,4,0,m);
		display(a);

		
	
	}
	
	
	
	
	
	static void display(String[][] a){
	    for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		        	System.out.print(a[i][j]+" ");
		    }
		    System.out.println(" ");
		}
	} 
	
	static void move(int c,String[][] a,int i,int j,String s){
	   // String s="P1:F";
	//	int i=4,j=2;
		
		
	    String p="A";	
    if(p=="A")	{	
		
    switch(s){
		   case "P1:F":if(i-1>=0){a[i-1][j]="A-P1";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		  case "P1:B":if(i+1<5){
		                a[i+1][j]="A-P1";
		                a[i][j]=null;} else {System.out.println("Invalid move");}break;
		  case "P1:L":a[i][j-1]="A-P1";
		                a[i][j]=null;break;
		  case "P1:R":a[i][j+1]="A-P1";
		                a[i][j]=null;break;
		  case "P2:F":a[i-1][j]="A-P2";
		                a[i][j]=null;break;
		  case "P2:B":if(i+1<5){
		                a[i+1][j]="A-P2";
		                a[i][j]=null;} else {System.out.println("Invalid move");}break;
		 case "P2:L":a[i][j-1]="A-P2";
		                a[i][j]=null;break;
		 case "P2:R":a[i][j+1]="A-P2";
		                a[i][j]=null;break;
		 case "P3:F":if(i-1>=0){a[i-1][j]="A-P3";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P3:B":if(i+1<5){a[i+1][j]="A-P3";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P3:L":if(j-1>=0){a[i][j-1]="A-P3";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		  case "P3:R":if(j+1<5){a[i][j+1]="A-P3";
		                a[i][j]=null;} else {System.out.println("Invalid move");}break;
		                
		   case "P4:F":if(i-1>=0){a[i-1][j]="A-P4";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P4:B":if(i+1<5){a[i+1][j]="A-P4";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P4:L":if(j-1>=0){a[i][j-1]="A-P4";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		  case "P4:R":if(j+1<5){a[i][j+1]="A-P4";
		                a[i][j]=null;} else {System.out.println("Invalid move");}break;
		                
		 case "P5:F":if(i-1>=0){a[i-1][j]="A-P5";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P5:B":if(i+1<5){a[i+1][j]="A-P5";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P5:L":if(j-1>=0){a[i][j-1]="A-P5";
		                a[i][j]=null;}else {System.out.println("Invalid move");}break;
		 case "P5:R":if(j+1<5){a[i][j+1]="A-P5";
		                a[i][j]=null;} else {System.out.println("Invalid move");}break;
		}
		
    }
	}
	
	
	
	
	
	
	
}
