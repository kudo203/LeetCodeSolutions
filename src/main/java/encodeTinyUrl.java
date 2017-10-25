import java.util.HashMap;

public class encodeTinyUrl {

    public HashMap<String,String> map = new HashMap<String,String>();
    public static int counter = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        counter+=1;
        String finalStringkey = "http://tinyurl.com/" + counter;
        map.put(finalStringkey,longUrl);
        return finalStringkey;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
