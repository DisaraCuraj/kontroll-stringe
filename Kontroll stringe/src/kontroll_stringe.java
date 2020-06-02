import java.util.Scanner;
public class kontroll_stringe {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1;
		boolean u_gjet=false;
		System.out.println("Jepni nje stringe");
		s1=input.next();
		for(int i=0;i<s1.length();i++) {
			if((s1.charAt(i)=='\\')&&(s1.charAt(i+1)=='n'))
				u_gjet=true;
		}
		if(u_gjet)
			System.out.println("Kombinimi \\n gjendet ne txt");
		else
			System.out.println("Kombinimi \\n nuk gjendet ne txt");
			

	}

}
