package utils;

public class ToolsUtil {
    public static final void Log(String tag, String message){
        System.out.println(tag + ": " + message);
    }
    public static final String errorMessage(int code){
        switch(code){
            case 100: return "Driver MySQL tidak ditemukan!";
        }
        return "";
    }
}