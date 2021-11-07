package L3.enums.ex3;
 ///COMMAND+SHIFT+U
public class Main {

    public static void main(String[] args) {
    }

    public void clickOnFont(Font font) {
     //   getElement().byAttributes("value", font.name);
    }

    private enum Font {
        HELVETICA_BOLT("Helvetica bolt"),
        JURA("Jura"),
        GARAMOND("Garamond"),
        TIMES_NEW_ROMAN("Times New Roman"),
        ARIAL("Arial");

        final String name;

        Font(String name) {
            this.name = name;
        }

        public String getFontName() {
            return name;
        }
    }
}
