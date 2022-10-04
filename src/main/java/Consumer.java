import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Test Name");
        jsonToSend.put("job", "Test Job");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);
        String postUrl = "https://reqres.in/api/users";
        String postResponse = restTemplate.postForObject(postUrl, request, String.class);
        System.out.println(postResponse);
        System.out.println();

        String getUrl = "https://reqres.in/api/users/2";
        String getResponse = restTemplate.getForObject(getUrl, String.class);
        System.out.println(getResponse);
    }
}
