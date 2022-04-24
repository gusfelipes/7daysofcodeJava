package day01;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final String API_KEY = "k_hei87obn";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("https://imdb-api.com/en/API/Top250Movies/" + API_KEY)).build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();
		System.out.println(json);

	}

}
