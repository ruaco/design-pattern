package cor.handler;

public abstract class Handler {
    protected Handler processor;

    public String handleRequest(String text) {
        String str;
        if(this.getProcessor() != null) {
            text = this.execute(text);
            str = this.processor.handleRequest(text);
        }else {
            str = this.execute(text);
        }
        return str;
    }

    public Handler getProcessor() {
        return processor;
    }

    public void setProcessor(Handler processor) {
        this.processor = processor;
    }

    protected abstract String execute(String text);
}
