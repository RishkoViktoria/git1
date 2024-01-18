public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPerRubles = 20;
        int bonusMiles = ticketPrice / milesPerRubles;
        return bonusMiles;
    }
}
