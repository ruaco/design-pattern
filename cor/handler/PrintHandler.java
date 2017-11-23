package cor.handler;

public class PrintHandler extends Handler {

    @Override
    protected String execute(String text) {
        String str = String.format("'%s'", text);
        System.out.println(str);
        return str;
    }
}
