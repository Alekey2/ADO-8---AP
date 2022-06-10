import java.util.Arrays;
public class Ex3
{
	public static void main(String[] args) {
	    
	    int a[]={2,4};
	    
	    int b[]={6,8};
	    
	    int uni[]=juncao(a,b);
	    
	    System.out.println(Arrays.toString(uni));
		
	}
	public static int [] juncao(int a[], int b[]){
	    int []uni = new int [a.length + b.length];
		int x = 0;
		
		for(int i = 0; i < a.length; i++){
			uni[x++] = a[i];
			
		}
		for(int i = 0; i < b.length; i++){
			uni[x++] = b[i];
		}
		return uni;
}

}



