package entities;

import utils.ConsolePrinter;

public class User {
    public final String nickName;
    private String ip;
    private String skinUrl;

    public User( String nickName, String ip, String skinUrl){
        nickNameValidator(nickName);

        this.nickName = nickName;
        this.ip = ip;
        this.skinUrl = skinUrl;
    };

    private void nickNameValidator(String nickName){
        boolean isCorrect = nickName != null && nickName.length() >= 3 && nickName.length() <= 15;

        if(!isCorrect){
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
