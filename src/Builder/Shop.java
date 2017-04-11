package Builder;

/**
 * Created by surabhi on 12/6/16.
 */
public class Shop {
    public static void main(String[] args) {
        //we created the getPhone method in PhoneBuilder which
        //allows us to return the phone object
        //the key here is that we have the same fields in both
        //Phone and PhoneBuilder classes
        // :)
        Phone p=new PhoneBuilder().setOs("Android").setRam(16).getPhone();
        System.out.println(p);

    }
}
