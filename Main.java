package ProxyDesignPattern;

public class Main {
    public static void main(String []args){
        LightProxy light= new RealLight();
        light.turnProxyLightOff();
        light.turnProxyLightOff();
        light.turnProxyLightOn();;

    }
}
