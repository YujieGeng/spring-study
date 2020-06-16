package demo01;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/16
 */
public class Proxy implements Rent{

    private Host host;
    public Proxy(){};

    public Proxy(Host host){
        this.host = host;
    }

    @Override
    public void rent() {
        CheckRoom();
        host.rent();
    }

    public void CheckRoom(){
        System.out.println("中介带你去看房");
    }
}
