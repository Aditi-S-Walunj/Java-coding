package SY;

public class SyMark {
	  public int computerTotal;
	    public int mathTotal;
	    public int electTotal;

	    public SyMark(int c, int m, int e) {
	        computerTotal = c;
	        mathTotal = m;
	        electTotal = e;
	    }

	    @Override
	    public String toString() {
	        return computerTotal + "\t\t" + mathTotal + "\t\t" + electTotal+"\t";
	    }
	}