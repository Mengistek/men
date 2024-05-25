package ProxyDesignPattern;

public class RealLight implements LightProxy {
    @Override
    public void turnProxyLightOff(){
        System.out.println("The light is OFF");
    }
    @Override
    public void turnProxyLightOn(){
        System.out.println("The light is ON");
    }
}
