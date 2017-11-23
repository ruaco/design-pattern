package cor;

import cor.handler.Handler;
import cor.handler.PrintHandler;
import cor.handler.TrimHandler;

/**
 * 责任链模式 chain of responsibility
 * 给多个对象处理一个请求的机会
 * 从而解耦发送者与接收者
 * ! 思考一下有没有替代方案?
 * */
public class Client {

    public static void main(String[] args) {
        Handler printHandler = new PrintHandler();
        Handler trimHandler = new TrimHandler();

        String text = "   Hello, world!   ";
        // trim -> print
        trimHandler.setProcessor(printHandler);
        trimHandler.handleRequest(text);
    }
}
