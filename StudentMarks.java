import java.util.*;
class StudentMarks{
	 float total_marks=0;
	int n;
	int[] marks;
	Scanner ss = new Scanner(System.in);
	void getdetails(){
		System.out.println("**Dear user,please enter the marks obtained in subjects out of (100)**");
		System.out.print("Enter no of subjects:");
		 n = ss.nextInt();
		 marks = new int[n];
		for(int i =0;i<n;i++){
		System.out.print("Enter marks obtained in sub"+(i+1)+":");
		marks[i] =  ss.nextInt();
	}
	}
		
	float get_total_marks(){
		 total_marks =0;
		System.out.println("Total marks obtained out of "+(n*100)+" is :");
		for(int i=0;i<n;i++){
			total_marks += marks[i];
		}
		return total_marks;
	}
	float get_average(){
		return n>0 ? total_marks/n :0;
	}
		String get_grade(){
			if(get_average()>40){
				System.out.print("**Passed...**");
			if(get_average()>=90)
				return "Ex";
				else if(get_average()>=80 && get_average()<90)
					return "A";
					else if (get_average()>=70 && get_average()<80)
						return "B";
					else if (get_average()>=60 && get_average()<70)
						return "C";
			}
				
					else
						System.out.println("**Fail..**");
					return "D";
		}
		
		void displayResults(){
			for(int i =0;i<n;i++){
		System.out.println(" Marks obtained in sub "+i+":" +marks[i]);
			}
		System.out.println("Total marks obtained: "+get_total_marks());
		System.out.println("Average marks obtained: "+get_average());
		System.out.println("Grade : "+get_grade());
		
	}
	public static void main(String args[]){
		StudentMarks m = new StudentMarks();
		m.getdetails();
		m.displayResults();
		m.ss.close();
	}
	}
			
			