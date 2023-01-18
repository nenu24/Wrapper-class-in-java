public class Wrap2 {
    
    public static void main(String[] args) {
        
        int a[]= {10,20,30,40,50};
        int b[]= {60,70,80,90,100};
        int c[]= new int[20];

        for (int i =0 ; i<a.length ; i++) {
            c[i]=a[i]+b[i];
        }

        for (int i =0 ; i<a.length ; i++){
            System.out.println("C= "+c[i]);
        }


        

    }
}
