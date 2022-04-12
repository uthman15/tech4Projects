package operator.logicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = true;

        // Send me InterviewQuestions or JavaHomework
        System.out.println("The student is okay (OR): " +
                (isInterviewQuestionsSent || isJavaHomeworkSent));
        // if there is a single True for OR is True

        //Send me InterviewQuestions and JavaHomework
        System.out.println("The student is okay (AND): " +
                (isInterviewQuestionsSent && isJavaHomeworkSent));
        // if there is a single False for AND it is False


        System.out.println("The student did send the homework" + isInterviewQuestionsSent);
    }
}
