
public class wrapduplicex1 {

}
final class Wrap {			//good

	  private char[] dataArray;

	  public Wrap() {

	    dataArray = new char[10];

	    // Initialize

	  }

	  public CharBuffer getBufferCopy() {

	    return CharBuffer.wrap(dataArray).asReadOnlyBuffer();

	  }

	}

final class Wrap {			//bad

  private char[] dataArray;

  public Wrap() {

    dataArray = new char[10];

    // Initialize

  }

  public CharBuffer getBufferCopy() {

    return CharBuffer.wrap(dataArray);

  }

}




