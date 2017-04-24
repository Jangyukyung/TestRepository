package ch07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child("±è","±æµ¿");
		System.out.println(child.lastName);
		System.out.println(child.firstName);
		child.sound();
		child.play();
	}

}
