import java.util.Scanner;

public class ProofOfKnowledgePrinter {

    public void printProof(ProofOfKnowledge proofOfKnowledge){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < proofOfKnowledge.getNumberOfQuestions();i++){
            proofOfKnowledge.printQuestion(i);
            String userAnswerString = scan.next();
            char userAnswerChar = userAnswerString.charAt(0);
            if(!proofOfKnowledge.answerQuestion(i, userAnswerChar)){
                System.out.println("\n-----------------------------------------------------------------------\n");
                System.out.println("INVALID ANSWER!");
                System.out.println("You need to pay attention and answer only one of the available options!\n");
                System.out.println("-----------------------------------------------------------------------"+'\n');
                i--;
            }
        }
        scan.close();
        System.out.println("\n-----------------------------------------------------------------------\n");
        System.out.println("Test completed successfully!\n");
        System.out.println("-----------------------------------------------------------------------"+'\n');
    }
    public void printScore(
        ProofOfKnowledge proofOfKnowledge
    ){
        System.out.println("\n-----------------------------------------------------------------------\n");
            if(proofOfKnowledge.getStudentStatus()){
                System.out.printf("\n CONGRATULATIONS!!!\n You got %s%% and were approved.\n",
                    proofOfKnowledge.getScore()
                );
            }else{
                System.out.printf(
                    "Unfortunately you got %s%% and failed.\n",
                    proofOfKnowledge.getScore()
                );
            }
        System.out.println("\n-----------------------------------------------------------------------"+'\n');
    }
    
}
