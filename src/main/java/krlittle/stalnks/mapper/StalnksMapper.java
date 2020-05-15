package krlittle.stalnks.mapper;

import krlittle.stalnks.models.Stalnks;
import org.springframework.stereotype.Component;

@Component
public class StalnksMapper {

    public Stalnks map(Stalnks stalnksRequest) {

        Stalnks stalnksResponse = new Stalnks();
        stalnksResponse.setNumberOfTurnips(stalnksRequest.getNumberOfTurnips());
        stalnksResponse.setInitialCostPerTurnip(stalnksRequest.getInitialCostPerTurnip());
        stalnksResponse.setCurrentBellsPerTurnip(stalnksRequest.getCurrentBellsPerTurnip());
        stalnksResponse.setTotalInitialInvestmentInTurnips(stalnksRequest.getNumberOfTurnips() * stalnksRequest.getInitialCostPerTurnip());
        stalnksResponse.setTotalIncome(stalnksRequest.getNumberOfTurnips() * stalnksRequest.getCurrentBellsPerTurnip());
        stalnksResponse.setTotalProfit(stalnksResponse.getTotalIncome() - stalnksResponse.getTotalInitialInvestmentInTurnips());

        return stalnksResponse;
    }
}
