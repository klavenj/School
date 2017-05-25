public class StudentRecord {

	private double mFinal, mMidterm, mQuiz1, mQuiz2, mQuiz3;
	private final double mFINAL_PERCENTAGE = .4, mMIDTERM_PERCENTAGE = .35, mQUIZ_PERCENTAGE = .25;
	private double mOverAllNumScore, mQuizTotal, mFinalTotal, mMidtermTotal, mOverAllPercentage;
	private String mLetterGrade;
	

		
	//Constructors 
	public StudentRecord()
	{
		this.mFinal = 0;
		this.mMidterm = 0;
		this.mQuiz1 = 0;
		this.mQuiz2 = 0;
		this.mQuiz3 = 0;
		this.mLetterGrade = "F";
	}
	
	
	//Mutator Methods
	//Set grades 
	public void setNumGrades(double quiz1, double quiz2, double quiz3, double midtermExam, double finalExam){
		
		
		this.mQuiz1 = quiz1;
		this.mQuiz2 = quiz2;
		this.mQuiz3 = quiz3;	
		this.mFinal = finalExam;
		this.mMidterm = midtermExam;
		
	}
	
	//Get methods
	//Accessor Methods
	
	public double getQuizOne(){
		return mQuiz1;
	}
	
	public double getQuizTwo(){
		return mQuiz2;
	}
	
	public double getQuizThree(){
		return mQuiz3;
	}

	public double getMidterm(){
		return mMidterm;
	}
	
	public double getFinal(){
		return mFinal;
	}
	
	//Get Total Numerical Score (percentage)
	public void getTotalPercentage()
	{
		
		
		
		mQuizTotal = (mQuiz1 + mQuiz2 + mQuiz3)/30 * mQUIZ_PERCENTAGE;
		mMidtermTotal = (mMidterm/100) * mMIDTERM_PERCENTAGE;
		mFinalTotal = (mFinal/100) * mFINAL_PERCENTAGE;
	    mOverAllPercentage = (mQuizTotal + mMidtermTotal + mFinalTotal) * 100;
		
		System.out.println("The overall weighted total grade of this student is " + String.format("%.1f", mOverAllPercentage) + "%");
	}
	
	public void getLetterGrade()
	{
		
		if(mOverAllPercentage > 90)
			this.mLetterGrade = "A";
		else if(mOverAllPercentage >= 80 && mOverAllPercentage <= 90)
			this.mLetterGrade = "B";
		else if(mOverAllPercentage >= 70 && mOverAllPercentage <= 80)
			this.mLetterGrade = "C";
		else if(mOverAllPercentage >= 60 && mOverAllPercentage < 70)
			this.mLetterGrade = "D";
		else if (mOverAllPercentage <= 60)
			this.mLetterGrade = "F";
		
		System.out.println("The final letter grade of the student is: " + mLetterGrade);
	}

	public void printGrade()
	{
		
		
		System.out.println();
		
		
		System.out.println("The first quiz score of this student was a/an: " + getQuizOne() + " out of 10");
		System.out.println("The second quiz score of this student was a/an: " + getQuizTwo() + " out of 10");
		System.out.println("The third quiz score of this student was a/an: " + getQuizThree() + " out of 10" );
		System.out.println("The midterm grade of this student was a/an " + getMidterm() + "%" );
		System.out.println("The final grade of this student was a/an " + getFinal() + " %" );
		getTotalPercentage();
		getLetterGrade();
		
		System.out.println();
		
		
		
	}

}
