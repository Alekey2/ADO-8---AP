import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static int []vetor(int a [], int b[]){
        int soma[]= new int[a.length+b.length];
	    for(int i=0,j=0; i<soma.length; i+=2,j++){
	       soma[i]=a[j]+b[j];
	      
	    }
	    return soma;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a[]={2};
	    int b[]={2};
	    
	    int c[] = vetor(a,b);
	    System.out.println(Arrays.toString(c));
	    
		
	}
}


