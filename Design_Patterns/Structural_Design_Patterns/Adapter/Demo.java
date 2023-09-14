package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter;

import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.adapters.SquarePegAdapter;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.round.RoundHole;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.round.RoundPeg;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)){
            System.out.println("Round peg fits round hole");
        }
        RoundPeg rpeg2 = new RoundPeg(2);
        if(hole.fits(rpeg2)){
            System.out.println("Round peg fits round hole");
        }
        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largePeg);
        if(hole.fits(smallSquarePegAdapter)){
            System.out.println("small  Square peg will fit round hole");
        }
        if(!hole.fits(largeSquarePegAdapter)){
            System.out.println("large Square peg will not fit round hole");
        }





    }
}
