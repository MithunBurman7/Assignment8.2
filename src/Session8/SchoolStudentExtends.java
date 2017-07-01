package Session8;

public class SchoolStudentExtends {


		int roll=7;
		String name="mithun";
		
		public static void main(String[]args){
			Student s1= new Student();
			System.out.println();
			s1.display();
		}
	}

	class Student{
		int roll=7;
		String name="mithun";
		
		//final method declare
		final void display(){
			
			System.out.println("Roll : " + roll+", Name : " + name); 
		}
	
	}
