import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AlgoJavaTest {


    @BeforeAll //exécutée une seule fois avant l'exécution du premier test de la classe
    static void initAll() {
        System.out.println("beforeAll");

    }

    @BeforeEach // Exécutée avant chaque méthode de tests
    void init() {
        System.out.println("beforeEach");
    }

    @AfterEach//exécutée après chaque méthode de tests
    void tearDown() {
        System.out.println("afterEach");
    }

    @AfterAll // exécutée une seule fois après l'exécution de tous les tests de la classe
    static void tearDownAll() {
        System.out.println("afterAll");
    }

    @Test
    void simpleTest() {
        Assertions.assertTrue(true,"Tester la methode inverser(string)");
        String attendu="OTOKAR";
        String actuel=AlgoJava.inverserChaineBoucle("RAKOTO");
        assertEquals(attendu, actuel);

    }
    @Test
    void testMultipleValeur(){
        //La méthode assertAll() vérifie que l'exécution de tous les Executable fournis ne lève aucune exception.
        String actuel=AlgoJava.inverserChaineBoucle("RAKOTO");
        Assertions.assertAll("Dimensions non conformes",
                () -> Assertions.assertTrue(actuel == "RAKOTO", "Valeur de st erronee"),
                () -> Assertions.assertTrue(actuel== "RAK", "Valeur de st erronee"));

    }



    boolean isValide() {
        return true;
    }
}
