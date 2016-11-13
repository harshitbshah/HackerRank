class Student extends Person{
	private int[] testScores;
    
    Student(String firstName, String lastName, int identification, int []testScores){
        super(firstName,lastName,identification);
        this.testScores = testScores;	
	}
    
    public char calculate(){
         int sum = 0;
         char grade = 'Z';
		 for(int i = 0; i < testScores.length; i++){
             sum += testScores[i];
         }
        
        if(sum/testScores.length >= 90 && sum/testScores.length <= 100){
            grade = 'O';
        }
        else if(sum/testScores.length >= 80 && sum/testScores.length < 90){
            grade = 'E';
        }
        else if(sum/testScores.length >= 70 && sum/testScores.length < 80){
            grade = 'A';
        }
        else if(sum/testScores.length >= 55 && sum/testScores.length < 70){
            grade = 'P';
        }
        else if(sum/testScores.length >= 40 && sum/testScores.length < 55){
            grade = 'D';
        }
        else if (sum/testScores.length < 40){
            grade = 'T';
        }
        
        return grade;
	}
   
}