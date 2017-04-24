package ch06.exam12;

public class BoardExample {
	public static void main(String[] args){
		Board board=new Board();
		
	board.setBno(1);
	board.setTitle("이제 봄><");
	board.setContent("놀러가자");	
	board.setWriter("유경");
	board.setOpen(true);
	
	System.out.println(board.getBno());
	System.out.println(board.getTitle());
	System.out.println(board.getContent());
	System.out.println(board.getWriter());
	System.out.println(board.isOpen());

	}
}
