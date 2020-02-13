package Regex;
//Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.
//Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//x là ký tự số
//Không chứa các ký tự đặc biệt
////Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
//Ví dụ tên lớp không hợp lệ: (a8)-(22222222)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private Pattern pattern;
    private Matcher matcher;
    final String PHONE_NUMBER_REGEX = "^\\((84)\\)-\\((0)[1-9]{9}\\)$";

    public ValidatePhoneNumber(){
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }
    public boolean isValidatePhoneNumber(String string){
        matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        String[] phoneNumberString = {"(84)-(0978489648)", "a8)-(22222222)","(84)-(1978489648)","(84)-(0978489648","(48)-(1978489648)"};

        for (String str: phoneNumberString){
            System.out.println("Phone Number "+ str + " is :" + (validatePhoneNumber.isValidatePhoneNumber(str) ? " valid": " invalid"));
        }
    }
}
