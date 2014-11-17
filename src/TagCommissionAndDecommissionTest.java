import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TagCommissionAndDecommissionTest {

    private String _newIdNumber;
    private String _originalIdNumber;
    private MyReader _myReader;

    @Before
    public void setUp() throws Exception {
        //TODO: Override the tag memory for the tag with EPC:000000000000000000001691
        _originalIdNumber = "EPC:0000000000000000000016";
        _newIdNumber = "EPC:000000000000000000002222";

        _myReader = new MyReader();
        _myReader.WriteTag(_newIdNumber, _originalIdNumber);

    }

    @After
    public void tearDown() throws Exception {
        //TODO: Reset the tag memory for the tag with EPC:000000000000000000001691

    }

    @Test
    public void testOverridesTheRFIDTagNumber() throws Exception {


    }
}