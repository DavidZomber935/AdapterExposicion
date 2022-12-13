package ec.edu.itsqmet.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ec.edu.itsqmet.Square.SquarePeg;
import ec.edu.itsqmet.adapters.SquarePegAdapter;
import ec.edu.itsqmet.Round.RoundPeg;
import ec.edu.itsqmet.Round.RoundHole;

@SpringBootTest
class AdapterApplicationTests {

	@Test
	void testingAdapter() {
		RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);


        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
	}

}
