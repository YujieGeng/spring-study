package demo01;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
