package hostel;



public class Student{
		public int reg_id;
		public String class_val;
		public String food_Preference; 

		public Student(String reg_no, String clas,String food_Preference){
			this.reg_id = Integer.valueOf(reg_no);
			this.class_val=clas;
			this.food_Preference = food_Preference; 
		} 
	}