public abstract class InsuranceAgent {
    String agentName;
    double agentSalary;

    public InsuranceAgent(String name, double salary) {
        this.agentName = name;
        this.agentSalary = salary;
    }

    abstract void calculatePremium();
    abstract void calculateReturns();
}

public class Bank extends InsuranceAgent {

    public Bank(String name, double salary) {
        super(name, salary);
    }

    void calculatePremium() {
        System.out.println("Calculating premium for agent: " + agentName);
        double premium = agentSalary * 0.1;
        System.out.println("Premium: " + premium);
    }

    void calculateReturns() {
        System.out.println("Calculating returns for agent: " + agentName);
        double returns = agentSalary * 0.05;
        System.out.println("Returns: " + returns);
    }

    public static void main(String[] args) {
        Bank bankAgent = new Bank("Harish", 50000);
        bankAgent.calculatePremium();
        bankAgent.calculateReturns();
    }
} 
