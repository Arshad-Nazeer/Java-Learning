public class L24_BreakContinue {
    public static void main(String[] args) {
        // Break:- break out of a loop (STOP)
        // continue:- skip current iteration of a loop (SKIP)

        for(int i=0; i<10; i++){
            if(i==5) break;
            System.out.println(i);
        }

        for(int i=0; i<10; i++){
            if(i==5) continue;
            System.out.println(i);
        }
    }
}
