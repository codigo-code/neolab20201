package api.net;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiNetMain {

    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "https://www.google.com/search?q=java+documentation&client=firefox-b-d&sxsrf=ALeKk010RXl4o284rDA3s_bqLrhlKKnuTg%3A1620511487543&ei=_wqXYKzOIMLJ1sQPoYGEmAs&oq=java+docu&gs_lcp=Cgdnd3Mtd2l6EAMYADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyBQgAEMsBMgUIABDLATIFCAAQywE6BwgAEEcQsAM6BAgjECc6CAgAELEDEIMBOgUILhCxAzoECC4QQzoECAAQQzoKCAAQhwIQsQMQFDoHCAAQsQMQQzoHCAAQhwIQFFDDnwFY6KsBYOi4AWgBcAJ4AIABbogBpAeSAQM5LjGYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz");
            System.out.println("Puerto:" + url.getDefaultPort());
            System.out.println("Query String:" + url.getQuery());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
