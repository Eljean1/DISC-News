package cl.ucn.disc.dam.discnews;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by jeanc on 26-10-2017.
 */

public class TestNewsWeb {

    @Test
    public void testConnection() throws IOException{

        final String url = "https://newsapi.org/v1/articles?source=usa-today&sortBy=latest&apiKey=6d5d1779d0a94758b0fdecbaeeca2265";

        final OkHttpClient client = new OkHttpClient();
        Assertions.assertThat(client).isNotNull();

        final Request request = new Request.Builder()
                .url(url)
                .build();

        Assertions.assertThat(request).isNotNull();

        Response response = client.newCall(request).execute();
        final String json = response.body().string();

        Assertions.assertThat(json).isNotBlank();
        System.out.println(json);
    }
}
