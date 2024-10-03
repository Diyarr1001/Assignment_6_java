package assignment6;

public class Person {

	final  String name;
	final int age;
	public Person()
	{
		name="diya";
		age=22;
	}
	public void display()
	{
		System.out.println("name is "+name+" and age is "+age);
	}
	
	public static void main(String[] args) {
		Person person=new Person();
		person.display();

	}

}
