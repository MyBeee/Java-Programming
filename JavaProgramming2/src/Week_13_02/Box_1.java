package Week_13_02;

public class Box_1<T> {
	public T content;
	
	public boolean compare(Box_1<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}
