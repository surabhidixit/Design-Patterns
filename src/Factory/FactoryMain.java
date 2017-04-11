package Factory;
import com.phone.*;
/**
 * Created by surabhi on 12/6/16.
 */
public class FactoryMain {
    public static void main(String[] args) {
        //traditional method where the client can see which class object is
        //created

        OS os=new Android();
        //os.spec();

        //factory design pattern where we create a class
        //where we return the object of the required class
        //based on the user input
        OperatingSystemFactory obj=new OperatingSystemFactory();
        OS os2=obj.getInstance("Closed");
        //the object returned above matches the user requirement
        //this object is then used to call the spec method in the
        //next step
        //thus the client does not know
        //which class object is created.
        os2.spec();

    }
}
