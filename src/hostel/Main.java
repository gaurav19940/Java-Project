package hostel;
import hostel.Student;

import java.util.*;

public class Main{

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt(); //No. of new registrations
	scan.nextLine();//for residual newline charecter 
	String[][] inputs = new String[n+1][4];//keeping reg number and index number same 
	int[] reg_nos = new int[n+1];
	for(int i=1;i<=n;i++){
		String temp = scan.nextLine();
		inputs[i] = temp.split(" ");
	}
	Student[] students = new Student[n+1];
	for(int i=1;i<=n;i++){
		students[i] = new Student(inputs[i][1],inputs[i][2],inputs[i][3]); 
	}
	
// 	for(int i=1; i<=n;i++){
// 	    System.out.print(students[i].reg_id);
// 	    System.out.print(students[i].class_val);
// 	    System.out.print(students[i].food_Preference);
// 	    System.out.print("\n");
	    
// 	}

	//Allotment utmost 3 in each 
	for(int i=1;i<=n;i++){
		int id = Integer.valueOf(students[i].reg_id);
		String food = students[i].food_Preference;
		String clas = students[i].class_val;
// 		System.out.println(id);
// 		System.out.println(food);
// 		System.out.println(clas);
		
		if(clas.equals("A")){
		 	if(food.equals("V")){
		 	    System.out.println("Match");
			if((HostelAllotment.get_av()).size() == 3 )
				HostelAllotment.nulll.add(id);
			else 
				HostelAllotment.a_v.add(id);
			}
			else if(food.equals("NV")){
				if((HostelAllotment.get_anv()).size() == 3 )
				HostelAllotment.nulll.add(id);
			else 
				HostelAllotment.a_nv.add(id);
			}
		}
		else if(clas.equals("B")){
			if(food.equals("V")){
			if((HostelAllotment.get_bv()).size() == 3 )
				HostelAllotment.nulll.add(id);
			else 
				HostelAllotment.b_v.add(id);
			}
			else if(food.equals("NV")){
				if((HostelAllotment.get_bnv()).size() == 3 )
				HostelAllotment.nulll.add(id);
			else 
				HostelAllotment.b_nv.add(id);
			}

		}

	}


	System.out.print("class B - preference V : ");
	System.out.println(HostelAllotment.get_bv());
	System.out.print("class A - preference V : ");
	System.out.println(HostelAllotment.get_av());
	System.out.print("class B - preference NV : ");
	System.out.println(HostelAllotment.get_bnv());
	System.out.print("class A - preference NV : ");
	System.out.println(HostelAllotment.get_anv());
	System.out.print("NULL");
	System.out.println(HostelAllotment.get_null());
	
}
}
