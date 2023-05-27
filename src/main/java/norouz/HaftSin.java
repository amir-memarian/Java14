package norouz;

public class HaftSin {
    public String ayaJozeeAzAnAst(String sib) {
        return switch (sib) {
            case "Sib", "Sir", "Sabzeh", "Senjed", "Somag", "Samano", "Sekeh" -> "Ejbari";
            case "Mahi", "Shirini", "Shame", "Miveh" -> {
                // some code
                System.out.println("Momken ast barki ashya faramosh shodeh bashad");
                // some code
                yield "Ekhtiari";
            }
            default -> "jozi az hat sin nist";
        };
    }
}

