
public class studentRecordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentRecord student = new StudentRecord();
		StudentRecord student2 = new StudentRecord();
		StudentRecord student3 = new StudentRecord();
		
		
		
		
		student.setNumGrades(9, 9, 9, 90, 90);
		student.printGrade();
		
		student.setNumGrades(7, 7, 7, 70, 88);
		student.printGrade();
		
		student.setNumGrades(3, 3, 4, 70, 70);
		student.printGrade();
		
		
	}

}
