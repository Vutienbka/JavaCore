package CaseStudy_EnglishVietNameseDictionary;

public class Main {
    public static void main(String[] args) {
        try {
            DictUI dicUI = new DictUI();
            dicUI.setLocation(200,100);
            dicUI.setVisible(true);
            dicUI.setResizable(false);
        }catch (Exception e){
            e.printStackTrace();
        }
        //dicManage.addNewWord(fac);
    }
}
