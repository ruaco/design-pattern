public class HttpResponse {
    private final String body;
    private final Integer responseCode;

    public String getBody() {
        return body;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    private HttpResponse(Builder builder) {
        this.body = builder.body;
        this.responseCode = builder.responseCode;
    }

    public static class Builder {
        private String body;
        private Integer responseCode;

        private Builder body(String body) {
            this.body = body;
            return this;
        }

        private Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        private Builder init() {
            return new Builder();
        }

        public HttpResponse build() {
            return new HttpResponse(this);
        }
    }
}
