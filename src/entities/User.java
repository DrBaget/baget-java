package entities;

import utils.ConsolePrinter;
import utils.GeneralValidator;

public class User {
    public final String nickName;
    private String ip;
    private String skinUrl;

    public final Interface userIntarface = new Interface();

    public User( String nickName, String ip, String skinUrl){
        nickNameValidator(nickName);

        this.nickName = nickName;
        this.ip = ip;
        this.skinUrl = skinUrl;
    };

    private void nickNameValidator(String nickName){
        if(!GeneralValidator.checkCount(nickName.length(),3,15)){
            ConsolePrinter.errorPrint("Поправ нік");
        };
    };

    public static void isSameNickNames (String nickName, String nickName2){
        boolean isEquals = nickName.equals(nickName2);

        if(isEquals){
            ConsolePrinter.errorPrint("Ніки одинакові, брати акробати");
        };
    };

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    // Getter і Setter для skinUrl
    public String getSkinUrl() {
        return skinUrl;
    }

    public void setSkinUrl(String skinUrl) {
        this.skinUrl = skinUrl;
    }
}
