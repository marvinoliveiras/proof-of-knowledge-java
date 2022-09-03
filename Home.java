public class Home{
    public static void main(String[] args) {
        ProofOfKnowledgeFactory ProofOfKnowledgeFactory = new ProofOfKnowledgeFactory();
        ProofOfKnowledge proofOfKnowledge = ProofOfKnowledgeFactory
            .createProofOfKnowledge();

        ProofOfKnowledgePrinter proofOfKnowledgePrinter = new ProofOfKnowledgePrinter();
        proofOfKnowledgePrinter.printProof(
            proofOfKnowledge
        );
        proofOfKnowledge.finishTheProof();
        proofOfKnowledgePrinter.printScore(proofOfKnowledge);


    }
}