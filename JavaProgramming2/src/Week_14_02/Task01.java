package Week_14_02;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

	public static void main(String[] args) {
		List<Board> list = new ArrayList< >();
		
		list.add(new Board("제목1", "제목1", "글쓴이1"));
		list.add(new Board("제목2", "제목2", "글쓴이2"));
		list.add(new Board("제목3", "제목3", "글쓴이3"));
		list.add(new Board("제목4", "제목4", "글쓴이4"));
		list.add(new Board("제목5", "제목5", "글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + 
				"\t" + board.getWriter());
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
					"\t" + b.getWriter());
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + 
					"\t" + b.getWriter());
		}
	}

}
