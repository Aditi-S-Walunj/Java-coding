package TY;

public class TyMark {
	 public int theory;
	    public int practicals;

	    public TyMark(int th, int pr) {
	        theory = th;
	        practicals = pr;
	    }

	    @Override
	    public String toString() {
	        return theory + "\t\t" + practicals;
	    }
	}