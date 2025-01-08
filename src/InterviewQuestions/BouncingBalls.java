package InterviewQuestions;

public class BouncingBalls {
    public static void main(String[] args) {
        int n = 19;

        int ans = getBouncingBucket(n);
        System.out.println(ans);
    }

    private static int getBouncingBucket(int n) {

        if(n % 6 == 1){
            return 1;
        }
       if(n % 6 == 4){
           return 4;
       }
       if(n % 2 == 1){
           return 3;
       }
       return 2;
    }
}
