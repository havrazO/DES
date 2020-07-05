package randomVariate;

import umontreal.ssj.randvar.*;
import umontreal.ssj.rng.*;

import java.util.ArrayList;
import java.util.List;

import umontreal.ssj.probdist.*;

public class PRandom {
	//http://umontreal-simul.github.io/ssj/docs/master/examples.html
	private RandomVariateGenInt genN;
	private double lambda;
	List<Integer> intPrandomList = new ArrayList<Integer>();
	
	public PRandom(double lambda) {
		this.lambda = lambda;
		RandomStream stream = new LFSR113("LFSR113");
		
		//http://umontreal-simul.github.io/ssj/docs/master/classumontreal_1_1ssj_1_1probdist_1_1PoissonDist.html
		genN = new RandomVariateGenInt(stream, new PoissonDist (lambda));
	}
	
	public List<Integer> generate(int size) {
			for (int i = 0; i < size ; i++) {
				intPrandomList.add(genN.nextInt());
			}
		 return intPrandomList;
	}
}
