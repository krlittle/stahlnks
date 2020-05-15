package krlittle.stalnks.models;

public class Stalnks {

    private long numberOfTurnips;
    private long initialCostPerTurnip;
    private long totalInitialInvestmentInTurnips;
    private long currentBellsPerTurnip;
    private long totalIncome;
    private long totalProfit;

    public long getNumberOfTurnips() {
        return numberOfTurnips;
    }

    public void setNumberOfTurnips(long numberOfTurnips) {
        this.numberOfTurnips = numberOfTurnips;
    }

    public long getInitialCostPerTurnip() {
        return initialCostPerTurnip;
    }

    public void setInitialCostPerTurnip(long initialCostPerTurnip) {
        this.initialCostPerTurnip = initialCostPerTurnip;
    }

    public long getTotalInitialInvestmentInTurnips() {
        return totalInitialInvestmentInTurnips;
    }

    public void setTotalInitialInvestmentInTurnips(long totalInitialInvestmentInTurnips) {
        this.totalInitialInvestmentInTurnips = totalInitialInvestmentInTurnips;
    }

    public long getCurrentBellsPerTurnip() {
        return currentBellsPerTurnip;
    }

    public void setCurrentBellsPerTurnip(long currentBellsPerTurnip) {
        this.currentBellsPerTurnip = currentBellsPerTurnip;
    }

    public long getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(long totalIncome) {
        this.totalIncome = totalIncome;
    }

    public long getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(long totalProfit) {
        this.totalProfit = totalProfit;
    }
}
