/**
 * builder 生成器模式
 * 1. 便于可选参数构造的构造
 * 2. 便于校验&设置参数的默认值
 * 3. 可以将生成的目标类设置为不可变对象，并且便于阅读
 * */
public class Query {

    private final Integer status;
    private final String nick;
    private final Long id;

    private Query() {
        throw new AssertionError();
    }

    private Query(QueryBuilder builder) {
        this.status = builder.status;
        this.nick = builder.nick;
        this.id = builder.id;
    }

    public Integer getStatus() {
        return status;
    }

    public String getNick() {
        return nick;
    }

    public Long getId() {
        return id;
    }

    static class QueryBuilder {
        private Integer status;
        private String nick;
        private Long id;

        public QueryBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public QueryBuilder nick(String nick) {
            this.status = status;
            return this;
        }

        public QueryBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public static QueryBuilder init() {
            return new QueryBuilder();
        }

        public Query build() {
            return new Query(this);
        }
    }

    public static void main(String[] args) {
        Query query = QueryBuilder.init().status(1).nick("Tom").id(9527L).build();
    }
}
