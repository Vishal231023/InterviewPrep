package InterviewQuestions;

public class Patternq {
    public static void main(String[] args) {

        // 22,333,4444,55555....n
        int n= 3;
        getPattern(n);
        System.out.println();
        getPattern2(n);

    }

    private static void getPattern2(int n) {
        for(int i =2;i<=n+1;i++){
            int pow = i -1;
            int ans = i;
            while(pow>0){
                ans = ans +(int) i * (int)Math.pow(10,pow);
                pow--;
            }
            System.out.print(ans + " ");

        }
    }

    private static void getPattern(int n) {
       for(int i = 2;i<=n+1;i++){
           for(int j = 0;j<i;j++){
               System.out.print(i);
           }
           System.out.print(" ");
       }
    }
}
