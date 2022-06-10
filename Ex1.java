import java.util.Arrays;
public class Ex1
{
    public static void main(String[] args) {
        int vetor[] = {87};
        int copy[]=copia(vetor);
        
        System.out.println(Arrays.toString(copy));
    }
    
    public static int []copia(int vetor[]){
        int copy[] = new int[vetor.length];
        int x = 0;
        
	    for(int i=0;i<copy.length;i++){
		copy[x++] = vetor[i];
		
    }
    return copy;
    }
}
	
	   
		


