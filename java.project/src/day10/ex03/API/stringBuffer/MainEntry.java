package day10.ex03.API.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println("lenght        /       capacity");
		System.out.println(sb.length() + "               /           " + sb.capacity());
		System.out.println();
		
		sb.append("encore");
		System.out.println(sb.length() + "               /           " + sb.capacity());
		System.out.println();
		sb.append("123412341256");
		System.out.println(sb.length() + "              /           " + sb.capacity());
		System.out.println();
		sb.append("123412343456 38472342847233289773383");
		System.out.println(sb.length() + "              /           " + sb.capacity());
		System.out.println();
		
		sb.trimToSize(); 	// 메모리 공가 사이즈에 맞게 재조정		
		System.out.println(sb.length() + "              /           " + sb.capacity());
		System.out.println();
		
		System.out.println(sb.hashCode());
	}
}
