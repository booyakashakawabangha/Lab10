import java.lang.reflect.Array;
import java.util.ArrayList;

public class MailBox {
    ArrayList<String> infos = new ArrayList<String>(1000);
    int counter = 0;

    void addMailInfo(String MailInfo){
        this.infos.add(counter, MailInfo);
    }

    void sendAll() {

    }
}
