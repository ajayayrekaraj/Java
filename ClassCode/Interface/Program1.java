interface Parent{
	void Property();
	void marry();
	void Education();
	void University();
} 
class Child implements Parent{
	public void Property(){
		System.out.println("Home,Gold");
	}
	public void marry(){
		System.out.println("Disha");
	}
	public void Education(){
		System.out.println("Engineering");
	}
	public void University(){
		System.out.println("SPPU");
	}
}

class Client{
	public static void main(String[]args){
		Parent obj=new Child();
		obj.Property();
		obj.marry();
		obj.Education();
		obj.University();
	}
}


