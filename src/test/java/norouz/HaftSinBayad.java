package norouz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HaftSinBayad {
    @Test
    void taeen_konad_kodam_shee_as_an_ast() {
        assertHaftSinAshya("Sib", "Ejbari");
        assertHaftSinAshya("Sir", "Ejbari");
        assertHaftSinAshya("Sabzeh", "Ejbari");
        assertHaftSinAshya("Senjed", "Ejbari");
        assertHaftSinAshya("Somag", "Ejbari");
        assertHaftSinAshya("Samano", "Ejbari");
        assertHaftSinAshya("Sekeh", "Ejbari");

        assertHaftSinAshya("Mahi", "Ekhtiari");
        assertHaftSinAshya("Shirini", "Ekhtiari");
        assertHaftSinAshya("Shame", "Ekhtiari");
        assertHaftSinAshya("Miveh", "Ekhtiari");

        assertHaftSinAshya("har chizi", "jozi az hat sin nist");

    }

    private static void assertHaftSinAshya(String shey, String result) {
        HaftSin haftSin = new HaftSin();

        String natijeh = haftSin.ayaJozeeAzAnAst(shey);

        assertThat(natijeh).isEqualTo(result);
    }
}
