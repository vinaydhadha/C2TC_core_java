package javaproject;
public class student{
	   public static void main(String[] args) {  
		   System.out.println("name:deepali");
	      int score = 35;
	      String grade = null;
	      switch(score/10) {
	        case 10:   	
	        case 9:  ////90
	           grade = "A";
	           break;  
	         case 8:   /////80
	           grade = "B";
	           break;  
	        case 7:    ///////70
	           grade = "C";
	           break;
	        case 6:    ///////60
	           grade = "D";
	           break;
	        case 5:    //////<50
	           grade = "E";
	           break;
	        default:
	           grade = "F";
	           break;
	      }
	      System.out.println("Grade = " + grade);
	   }

	}