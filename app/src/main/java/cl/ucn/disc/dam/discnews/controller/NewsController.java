package cl.ucn.disc.dam.discnews.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import cl.ucn.disc.dam.discnews.model.Article;
import cl.ucn.disc.dam.discnews.model.NewsApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by jeanc on 26-10-2017.
 */

public final class NewsController {

    /**
     * Des-Serializador GSON
     */
    private static final Gson gson = new GsonBuilder()
            .serializeNulls()
            .setPrettyPrinting() // TODO: Eliminar en modo produccion
            .create();

    /**
     * URL
     */
    final String url = "https://newsapi.org/v1/articles?source=usa-today&sortBy=latest&apiKey=6d5d1779d0a94758b0fdecbaeeca2265";

    /**
     * Cliente OkHttp
     */
    private final OkHttpClient okHttpClient = new OkHttpClient();

    /**
     *  Obtencion de {@link Article}s desde Internet.
     *
     *  @return the {@link List} of {@link Article}
     */
    public List<Article> getArticles() throws IOException {

        //Peticion
        final Request request = new Request.Builder()
                .url(url)
                .build();

        //Respuesta
        final Response response = okHttpClient.newCall(request).execute();
        final String json = response.body().string();

        final NewsApi newsApi = gson.fromJson(json, NewsApi.class);

        return newsApi.getArticles();
    }


}
