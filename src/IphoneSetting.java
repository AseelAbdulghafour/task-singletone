public class IphoneSetting {
private static IphoneSetting instance;
private int brightness;
private boolean isWifiEnable;

public static IphoneSetting getInstance;



public static IphoneSetting getInstance() {
    if (instance == null){
    instance = new IphoneSetting();
    }
    return instance;
}

public void setBrightness(int myBrightness){
    this.brightness = myBrightness;
    
}

public int getBrightness(){
    return brightness;
}

public void setisWifiEnable(boolean myWifi){
    this.isWifiEnable = myWifi;
}

public void setWifi(){
    this.isWifiEnable = true;
}

public void setDisable( ){
    this.isWifiEnable = false;
}

public boolean getWifiEnable(){
    return isWifiEnable;
}


}