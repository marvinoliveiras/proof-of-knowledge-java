import java.util.HashMap;
import java.util.Map;

public class Question {
    private String statementOfQuestion;
    private Map<Character, String> possibleAnswers = new HashMap<>();
    private Character correctAnswer;
    private Character userAnswer;
    public Question(
        String statementOfQuestion
    ){
        this.statementOfQuestion = statementOfQuestion;
    }
    public void setPossibleAnswers(
        Character[] keys, String[] values
    ){
        for(int i = 0; i < keys.length &&  i < keys.length;i++){
            possibleAnswers.put(keys[i], values[i]);
        }
    }
    public boolean setCorrectAnswer(
        Character correctAnswer
    ){
        if(this.validatingIfTheAnswerExists(correctAnswer)){
            this.correctAnswer = correctAnswer;
            return true;
        }
        return false;
    }
    public Character getCorrectAnswer()
    {
        return this.correctAnswer;
    }
    public boolean validatingIfTheAnswerExists(
        Character userAnswer
    ){
        return this.possibleAnswers.containsKey(userAnswer);
    }
    public void printStatementOfQuestion()
    {
        System.out.println(this.statementOfQuestion);
    }
    public void printPossibleAnswers()
    {
        for(Map.Entry<Character, String> answers : this.possibleAnswers.entrySet()){
            System.out.println(answers);
        }
    }
    public boolean setStudentAnswer(
        Character userAnswer
    ){
        if(this.validatingIfTheAnswerExists(userAnswer)){
            this.userAnswer = userAnswer;
            return true;
        }
        return false;
    }
    public Character getUserAnswer()
    {
        return this.userAnswer;
    }
    public boolean evaluateQuestion()
    {
        return this.userAnswer.equals(
            this.correctAnswer
        );
    }
}
