package HTTPnetworking.Networking;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://mostbet.com/api/v2/slider?section=bonus"))
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        //System.out.println(response.headers().map());
        System.out.println(response.statusCode());

        File file = new File("./Resources/response.json");

        try (PrintWriter fileWrite = new PrintWriter(file, StandardCharsets.UTF_8)) {
            fileWrite.print(response.body());
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
