package L3.abstracts;

public class OrdinaryPage extends PageBase{

    @Override
    public OrdinaryPage navigateToPage(String name) {
        return null;
    }

    @Override
    public String pageName(String name) {
        return name;
    }

    public boolean isSold() {
        return true;
    }

}
