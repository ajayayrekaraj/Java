class Marry{
	void add(int x){
		System.out.println(x);
	}
	void add(float y){
		System.out.println(y);
	}
	public static void main(String[]args){
		Marry obj=new Marry();
		obj.add(10);
		obj.add(10.5f);
	}

}

