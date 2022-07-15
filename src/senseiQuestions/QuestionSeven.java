package senseiQuestions;

public class QuestionSeven {

    public static int solution(int X, int[] B, int Z){
        double sumOf_Z_Observations =  0;
        int totalOfObservations = 0;
        if (X > 0){
            for (int i = B.length-1; i >= 0; i--){
                if (i >= B.length-Z) {
                    sumOf_Z_Observations += B[i];
                }
                totalOfObservations += B[i];
            }
            double average =  sumOf_Z_Observations /Z;
            int sizeRemaining = X - totalOfObservations;
            return (int)Math.ceil(sizeRemaining/average);
        }
        return 0;
    }

    public static void main(String[] args) {
        int X = 100;
        int[] B = {10,6,6,8};
        int Z = 2;
        System.out.println(solution(X, B, Z));
    }
}
