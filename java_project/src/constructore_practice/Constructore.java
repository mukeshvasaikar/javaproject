package constructore_practice;

public class Constructore {

	
	/*
	public Constructore() {
		System.out.println("user define 0-args constr");
	}
	public static void main(String[] args) {
		System.out.println("main method logic");
	}
	*/
	
	/*  after creating a object the constructore logic will get executed
	public Constructore() {
		
		System.out.println("user define 0-args constructore");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		new Constructore();
		System.out.println("main method ended");
	}
	*/
	
	/* the number of times you are creating the objects that number of times constructor will executed
	public  Constructore() {
		System.out.println("user define 0-args const");
	}
	public  Constructore(int a) {
		System.out.println("user define 1-args connstructor");
	}
	public  Constructore(int a, int b ) {
		System.out.println("user define 2-args const");	
	}
	public Constructore(int a, int b, int c ) {
		
		System.out.println("user define 3-args"); 
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		new Constructore();
		new Constructore(10);
		new Constructore(10,20);
		new Constructore(10,20,30);
		System.out.println("main method ended");
	}
	*/
	
	/*  if we keep retrn keyword within the constructore then it should be last statement within that constructore
	public Constructore() {
		System.out.println("user define 0-args const");
		return;
	}
	public  void Constructore() {
		
		System.out.println("non-static test method");
		return;
	}
	public static void main(String[] args) {
		Constructore t =new Constructore();
		t.Constructore();
	}
	*/
	
	/*  if you try to return any premitive or non- premitive type within the constructore then it will get compile time error
	public Constructore() {
		System.out.println("user define o-args const");
		return 10;
	}
	public void Constructore() {
		System.out.println("non static method called");
	}
	public static void main(String[] args) {
		new Constructore();
	}
	*/
	/*  If we change the return type of the  constructore , then it will treated as method not constructore
	public int Constructore() {
		System.out.println("int Constructore() method");
		return 20;
	}
	public int Constructore1() {
		System.out.println("int Constructore1() method");
		return 30;
	}
	
	public static void main(String[] args) {
		Constructore m=	new Constructore();
		m.Constructore();
		m.Constructore1();
	}
	*/
	
	
	// Default constructore
	/*
	public static void main(String[] args) {
		new Constructore();
	}
	*/
	
	/* If we should have at least 1 user define constructore within the class 
	 * then explicitly we should have create constructore for   0-args object to execute the constructore 
	 * otherwise you will get compile time error
	public Constructore() {
		System.out.println("user define 0-args");
	}
	public Constructore(int a) {
		System.out.println("user define 1-args");
	}
	public static void main(String[] args) {
		new Constructore(10);
		new Constructore();
	}
	*/
	
}
