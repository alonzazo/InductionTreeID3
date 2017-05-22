package decisiontree;

public class Pair<L,R> {

	  public L first;
	  public R second;

	  public Pair() {
		  }
	  
	  public Pair(L left, R right) {
	    this.first = left;
	    this.second = right;
	  }

	  public L getfirst() { return first; }
	  public R getsecond() { return second; }

	  @Override
	  public int hashCode() { return first.hashCode() ^ second.hashCode(); }

	  @Override
	  public boolean equals(Object o) {
	    if (!(o instanceof Pair)) return false;
	    Pair pairo = (Pair) o;
	    return this.first.equals(pairo.getfirst()) &&
	           this.second.equals(pairo.getsecond());
	  }

	}
