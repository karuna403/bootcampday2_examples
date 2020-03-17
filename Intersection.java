package bootcampprograms2dayexamples;

public class Intersection {

	public static void main(String[] args) {
        int a[] = {10,4,5,8,6};
        int[] b = {9,5,4,7,11};
        int[] c = new int[(int)Math.min(a.length, b.length)];
        int i=0;
         for(int f=0;f<a.length;f++){
              for(int k=0;k<b.length;k++){
                    if(a[f]==b[k]){
                    c[i] = a[f];
                    i++;
            }
          }
        }
         System.out.print("{");
        for (int x=0; x<i; x++){
           System.out.print( c[x]+" ");
        }
        System.out.print("}");
       }
  }
	


