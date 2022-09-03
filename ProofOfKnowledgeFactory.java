public class ProofOfKnowledgeFactory {
    /*public static void main(String[] args){
        ProofOfKnowledge proof = createProofOfKnowledge();
    }*/
    public ProofOfKnowledge createProofOfKnowledge(){
        ProofOfKnowledge proofOfKnowledge = new ProofOfKnowledge(60);
        String statementOfQuestion = "what's the capital of Brasil?";
        Character[] keysToPossibleAnswers = {'a', 'b', 'c', 'd'};
        String[] valuesToPossibleAnswers = {"Brasília", "São Paulo",
            "Rio de Janeiro", "Buenos Ayres"};
        Character correctAnswer = 'a';
        proofOfKnowledge.createQuestion(
            statementOfQuestion,
            keysToPossibleAnswers,
            valuesToPossibleAnswers,
            correctAnswer
        );
        String statementOfQuestion1 = "what's the capital of USA?";
        Character[] keysToPossibleAnswers1 = {'a', 'b', 'c', 'd'};
        String[] valuesToPossibleAnswers1 = {"New York", "Philadelphia",
            "Detroit", "Washington"};
        Character correctAnswer1 = 'd';

        proofOfKnowledge.createQuestion(
            statementOfQuestion1,
            keysToPossibleAnswers1,
            valuesToPossibleAnswers1,
            correctAnswer1
        );
        String statementOfQuestion2 = "what's the capital of Germany?";
        Character[] keysToPossibleAnswers2 = {'a', 'b', 'c'};
        String[] valuesToPossibleAnswers2 = {"Hamburg", "Berlin",
            "Munich"};
        Character correctAnswer2 = 'b';

        proofOfKnowledge.createQuestion(
            statementOfQuestion2,
            keysToPossibleAnswers2,
            valuesToPossibleAnswers2,
            correctAnswer2
        );
        return proofOfKnowledge;
    }
}
