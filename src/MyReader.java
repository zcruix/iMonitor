import com.thingmagic.Gen2;
import com.thingmagic.Reader;
import com.thingmagic.ReaderException;
import samples.demo;

import java.util.Iterator;

/**
 * Created by Anil on 11/16/14.
 */
public class MyReader {

    private String _url;

    public boolean Read() throws ReaderException {

        demo d = new demo();
        _url = "tmr://matrix-211b47/";
        String[] args = {_url, "read"};

        d.main(args);

        return true;
    }

    public void WriteTag(String newIdNumber, String originalIdNumber) throws ReaderException {

        Reader reader = Reader.create(_url);
        reader.connect();
        Gen2.TagData epc = new Gen2.TagData(new byte[] {
                (byte)0x01, (byte)0x23, (byte)0x45, (byte)0x67, (byte)0x89, (byte)0xAB,
                (byte)0xCD, (byte)0xEF, (byte)0x01, (byte)0x23, (byte)0x45, (byte)0x67,
        });
        Gen2.WriteTag tagop = new Gen2.WriteTag(epc);
        reader.executeTagOp(tagop, target);


        reader.destroy();
    }
}
