package Regex;
//Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//Không chứa các ký tự đặc biệt
//Theo sau ký tự bắt đầu là 4 ký tự số
//Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassroomName {
    private Pattern pattern;
    private Matcher matcher;

    public ValidateClassroomName() {
        pattern = Pattern.compile(CLASSROOM_NAME_REGEX);
    }

    final String CLASSROOM_NAME_REGEX = "^[ACP][^\\.{(*+?^$|]*[0-9]{4}[GHIKLM]$";


    public boolean isClassRoomRegex(String string){
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
