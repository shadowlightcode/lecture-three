package L3.enums.ex4;

public enum Parfums implements Product {

    Dolce_Gabbana("Dolce&Gabbana") {
        @Override
        public boolean inStock() {
            return false;
        }
    },
    MONTALE("Montale") {
        @Override
        public boolean inStock() {
            return true;
        }
    },
    PACO_RABANNE("Paco Rabanne") {
        @Override
        public boolean inStock() {
            return true;
        }
    },
    TOMMY_HILFIGER("Tommy Hilfiger") {
        @Override
        public boolean inStock() {
            return true;
        }
    },
    VERSACE("Versace") {
        @Override
        public boolean inStock() {
            return true;
        }
    },
    AEDES_DE_VENUSTAS("Aedes de Venustas") {
        @Override
        public boolean inStock() {
            return false;
        }
    };

    final String name;

    Parfums(String name) {
        this.name = name;
    }

    public String stockReview() {
        return inStock() ? String.format("We have some pieces left - %s", name) : String.format("Sold out and sent to customer - %s", name);
    }
}
