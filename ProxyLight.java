package ProxyDesignPattern;

public class ProxyLight implements LightProxy {
    private RealLight realLight;
    private boolean isOn;
    public ProxyLight(){
        this.realLight=realLight;
        this.isOn=false;
    }
    @Override
    public void turnProxyLightOn(){
        if (!isOn){
            realLight.turnProxyLightOn();
            isOn=true;
            System.out.println("The light is on");
        }else {
            System.out.println("the light is already On");
        }
    }
    @Override
    public void turnProxyLightOff(){
        if(isOn){
            realLight.turnProxyLightOff();
            isOn=false;
            System.out.println("The light is Off");
        }else{
            System.out.println("The light is already Off");
        }
    }
}
