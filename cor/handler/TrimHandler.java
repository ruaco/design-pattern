package cor.handler;

public class TrimHandler extends Handler {

    @Override
    protected String execute(String text) {
        return text.trim();
    }
}
