package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.adapters;

import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.round.RoundPeg;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    @Override
    public double getRadius(){
        double result;
        result = (Math.sqrt(Math.pow(peg.getWidth()/2, 2)) *2);
        return result;

    }

}
