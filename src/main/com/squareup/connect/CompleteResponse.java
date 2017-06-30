package com.squareup.connect;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MultivaluedMap;
import org.glassfish.jersey.uri.UriComponent;

public class CompleteResponse<T> {
    private T data;
    private Response response;

    public CompleteResponse(T data, Response response) {
        this.data = data;
        this.response = response;
    }

    public T getData() {
        return this.data;
    }

    public Response getResponse() {
        return this.response;
    }

    public String getBatchToken() {
        Link link = this.response.getLink("next");

        if (link != null) {
            MultivaluedMap<String, String> parameters = UriComponent.decodeQuery(link.getUri(), true);
            if (parameters.containsKey("batch_token")) {
                return parameters.getFirst("batch_token");
            }
        }

        return null;
    }
}
