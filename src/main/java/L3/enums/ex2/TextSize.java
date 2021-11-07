package L3.enums.ex2;

public enum TextSize {
    UPPER_CASE {
        @Override
        public String setCorrectSize() {
            return text.toUpperCase();
        }
    },
    LOWER_CASE {
        @Override
        public String setCorrectSize() {
            return text.toLowerCase();
        }
    },
    NO_CHANGE {
        @Override
        public String setCorrectSize() {
            return text;
        }
    };

    public String text = " Be happy human!";

    public abstract String setCorrectSize();
}
