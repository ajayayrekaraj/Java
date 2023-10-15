class Hospital{
	static int Checkup_Fee=100;
	String Patient_Name="Axay";
	String Disease_Name="Fever";

	void PatientInfo(){
		System.out.println("Checkup_Fee=" +Checkup_Fee);
		System.out.println("Patient_Name=" +Patient_Name);
		System.out.println("Disease_Name=" +Disease_Name);
	}
}
class Management{
	public static void main(String[]args){
		Hospital Patient1=new Hospital();
		Hospital Patient2=new Hospital();
		Patient1.PatientInfo();
		Patient2.PatientInfo();

		System.out.println("- - - - - - - ");

		Patient2.Checkup_Fee=150;
		Patient2.Patient_Name="Rahul";
		Patient2.Disease_Name="Maleria";

		Patient1.PatientInfo();
		Patient2.PatientInfo();
	}
}


