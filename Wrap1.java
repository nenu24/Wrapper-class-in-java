public class Wrap1 {
    
    public static void main(String[] args) {
        
        String a= 20;
        String b= 30;

        int s=2;

    switch(s){
        case 1:
            int ans1 = Integer.parseInt(a)+Integer.parseInt(b);
            System.out.println("Ans = "+ans1); 
        case 2:
            int ans2 = Integer.parseInt(a)-Integer.parseInt(b);
            System.out.println("Ans = "+ans2); 
        case 3:
            int ans3 = Integer.parseInt(a)*Integer.parseInt(b);
            System.out.println("Ans = "+ans3); 
        case 4:
            double ans4 = Double.parseDouble(a)/Double.parseDouble(b);
            System.out.println("Ans = "+ans4); 
    }
    }
}
