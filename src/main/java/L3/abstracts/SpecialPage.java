package L3.abstracts;

public class SpecialPage extends PageBase {

    @Override
    public SpecialPage navigateToPage(String name) {
        System.out.println("SpecialPage " +  name);
        return new SpecialPage();
    }

    @Override
    public String pageName(String name) {
        return null;
    }

    public boolean isSold() {
        return true;
    }
}
