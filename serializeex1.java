
public class serializeex1 {

}

public class OuterSer implements Serializable {		//bad

  private int rank;

  class InnerSer implements Serializable {

    protected String name;

    // ...

  }

}

public class OuterSer implements Serializable {		//good 

  private int rank;

  class InnerSer {

    protected String name;

    // ...

  }
}
