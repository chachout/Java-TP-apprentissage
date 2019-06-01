public class Ex3_2 {
	public static void main(String[] args) {
		char[]Endroit={'k','a','y','a','k'};
		char[]Envers=new char[Endroit.length];
		int p;
		p=0;
		for (int i=0;i<Endroit.length;i++){
			Envers[i]=Endroit[Endroit.length-i-1];
		}
		for (int j=0;j<Endroit.length;j++){
			System.out.print(Envers[j]+" ");
		}
		for (int k=0;k<Endroit.length;k++){
			if(Endroit[k]!=Envers[k]){
				System.out.println("Le mot n'est pas un palindrome");
				p=k;
				break;
			}
		}
		if(p==0){
			System.out.println("Le mot est un palindrome");
		}
	}
}
