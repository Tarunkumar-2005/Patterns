public class patterns {
    public static void main(String[] args) {
        System.out.println("Square Pattern:");
        int g=4; //square pattern 
        char h='a'; //to keep track for a
            for(int i=0;i<g;i++){
            for(int j=0;j<g;j++){
                System.out.print(h+" ");
                h+=1;
                
            }
            System.out.println();
        }
        System.out.println("\nReverse Right angle Triangle Pattern:");
        int d=5; //right triangle reverse
        for(int i=0;i<d;i++){
            for(int j=0;j<d-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\nRight angle Triangle Pattern");
        int z=5; //right triangle
        char ch='a';
        for(int i=0;i<z;i++){
            for(int j=0;j<i+1;j++){
                int res=ch+i;
                char s=(char) res; //type casting
                System.out.print(s+" ");
                
            }
            System.out.println();
        }
        System.out.println("\ninverted right angle triangle:");
        int c=5;
        for(int i=0;i<c;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<c-i;k++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println("\nTraingle Pattern");
        int y=4; //Triangle pattern 
        for(int i=0;i<y;i++){
            for(int j=0;j<y-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\nHollow Diamond Pattern:");
        int x=4; //hollow diamond 
        for(int i=0;i<x;i++){
            for(int j=0;j<x-i-1;j++){
                System.err.print("  ");
            }
            System.err.print("* ");
            if(i>0){
            for(int j=0;j<2*i-1;j++){
                System.out.print("  ");
            }
            System.err.print("* ");
            }
            System.err.println();
        }
        for (int i = x - 2; i >= 0; i--) { 
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        int n=5;
        System.out.println("\nButter Fly Pattern:");
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
                
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<2*i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
