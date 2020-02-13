package Regex;

import java.io.*;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z"); //quet toan bo trang --> \\Z se tim dau xuong dong\n cuoi cung
            String content = scanner.next();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            // Liet ke duong dan cac bai hat
            //Pattern p = Pattern.compile("box_song_action(.*?)><a\\shref=\"(.*?)\"\\sclass(.*?)\"></a>");
            // Liet ke danh sach bai hat trong trang
            Pattern p = Pattern.compile("button_new_window\"\\stitle=\"Nghe bài hát (.*?)\\s-\\s(.*?)\"></a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
// close scanner
            scanner.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
