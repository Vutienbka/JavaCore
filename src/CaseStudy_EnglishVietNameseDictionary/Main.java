package CaseStudy_EnglishVietNameseDictionary;

import java.awt.Font;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            DictGui dg = new DictGui();
            dg.setLocation(200,100);
            dg.setVisible(true);
            dg.setResizable(false);
            dg.showTime();
        }catch (Exception e){
            e.printStackTrace();
        }

        //MakeJFrame jFrame = new MakeJFrame();
        //jFrame.DictGui();
        //DicManage dicManage = new DicManage();
        //FileIO fileIO = new FileIO();
        //dicManage.putMapFromFile();
        //dicManage.displayMap();
        //dicManage.deleteWord("appear");
       // dicManage.addNewWord("ebala","/i ba: la/","* danh tu\n- xin chao\n* Dong tu\n- chao moi nguoi");
        //System.out.println(dicManage.searchFullMeaning("ebala"));
       // System.out.println(dicManage.searchFullMeaning("appear"));
        //System.out.println(dicManage.searchFullMeaning("abandon"));
        //System.out.println(dicManage.searchVerbMean("snap-hook"));
        //System.out.println(dicManage.searchVerbMean("assist"));
        //System.out.println(dicManage.searchVerbMean("scintillate"));
       // System.out.println(dicManage.searchVerbMean("scold"));


        //dicManage.addNewWord(fac);
    }
}
