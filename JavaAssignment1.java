package firstpackage;

public class JavaAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Store marks of 3 subjects: Math, Science, and English
        int mathMarks = 83;
        int scienceMarks = 95;
        int englishMarks = 89;

        // 2. Calculate the total marks
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        // 3. Calculate the average marks using a suitable data type (double)
        
       double averageMarks = (double) totalMarks / 3;
        //float averageMarks =  (float)totalMarks / 3 ;

        // 4. Print both the total and average
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks (using double): " + averageMarks);

	}

}
