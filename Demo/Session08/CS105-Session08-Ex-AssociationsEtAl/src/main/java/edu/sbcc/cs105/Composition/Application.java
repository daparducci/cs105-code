package edu.sbcc.cs105.Composition;

public class Application {

    private final String name;
    private final int ficoScore;
    private final double initialDeposit;

    public Application(final String name, final int ficoScore, final double initialDeposit) {
        this.name = name;
        this.ficoScore = ficoScore;
        this.initialDeposit = initialDeposit;

    }

    public int getFicoScore() {
        return ficoScore;
    }

    public String getName() {
        return name;
    }

	public double getInitialDeposit() {
		return initialDeposit;
	}
}
