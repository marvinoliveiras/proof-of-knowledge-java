import java.util.ArrayList;
import java.util.List;

public class ProofOfKnowledge {
    private List<Question> questions = new ArrayList<Question>();
    private int counterOfQuestions = 0;
    private int correctAnswers = 0;
    private double score = 0;
    private double requiredScore;
    private boolean studentStatus;
    public ProofOfKnowledge(
        double requiredScore
    ){
        this.requiredScore = requiredScore;
    }
    public void createQuestion(String statementOfQuestion,
        Character[] keysToPossibleAnswers,
        String[] valuesToPossibleAnswers, Character correctAnswer
    ){
        this.questions.add(new Question(
            statementOfQuestion
        ));
        this.questions.get(this.questions.size()-1)
            .setPossibleAnswers(
                keysToPossibleAnswers, valuesToPossibleAnswers
            );
        this.questions.get(this.questions.size()-1)
            .setCorrectAnswer(
                correctAnswer
            );
        this.counterOfQuestions = this.questions.size();
    }
    public int getNumberOfQuestions()
    {
        return this.counterOfQuestions;
    }
    public void printQuestion(
        int indexOfQuestion
    ){
        this.questions.get(indexOfQuestion)
            .printStatementOfQuestion();
            this.questions.get(indexOfQuestion)
            .printPossibleAnswers();
    }
    public boolean answerQuestion(
        int indexOfQuestion, Character answer
    ){
        return this.questions.get(indexOfQuestion)
            .setStudentAnswer(answer);
    }
    public void setCorrectAnswers()
    {
        for(int i = 0;i < this.questions.size();i++){
            this.correctAnswers += (
                this.questions.get(i).evaluateQuestion())
                    ? 1 : 0;
        }
    }
    public void setScore()
    {
        if(this.correctAnswers == this.getNumberOfQuestions()){
            this.score = 100.00;
            return;
        }
        this.score = Math.ceil(
            (100 / this.counterOfQuestions)
            *correctAnswers
        );
    }
    public double getScore()
    {
        return this.score;
    }
    public void setStudentStatus()
    {
        this.studentStatus = (
            this.score >= this.requiredScore)
                ? true: false;
    }
    public boolean getStudentStatus(){
        return studentStatus;
    }
    public void finishTheProof()
    {
        this.setCorrectAnswers();
        this.setScore();
        this.setStudentStatus();;
    }
}