package Regex;
//Viết phương thức để kiểm tra tính hợp lệ của tên tài khoản.
//Một tài khoản hợp lệ cần đạt các yêu cầu sau:
//Không chứa các ký tự đặc biệt
//Ít nhất là 6 ký tự
//Không chứa các ký tự viết hoa
//Cho phép dấu gạch dưới (_)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountRegex {
    private Pattern pattern;
    private Matcher matcher;

    final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountRegex() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean isValidAccount(String string){
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
