package org.global;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class PokemonResourceTest {

    @Test
    public void testPokemonEndpointReturnsPokemon() {

        given()
                .when().get("/pokemon")
                .then()
                .statusCode(200)
                .body(is(getExpectedBody()));

    }

    private String getExpectedBody() {

        return "[{\"id\":3,\"attack\":\"Hydro Cannon\",\"height\":\"1.6m\",\"name\":\"Blastoise\",\"type\":\"Water\",\"typeColour\":\"blue\",\"weight\":\"88.5kg\"}," +
                "{\"id\":2,\"attack\":\"Flamethrower\",\"height\":\"1.7m\",\"name\":\"Charizard\",\"type\":\"Fire/Dragon\",\"typeColour\":\"red\",\"weight\":\"90.5kg\"}," +
                "{\"id\":6,\"attack\":\"Quick attack\",\"height\":\"0.3m\",\"name\":\"Eevee\",\"type\":\"Normal\",\"typeColour\":\"grey\",\"weight\":\"6.5kg\"}," +
                "{\"id\":5,\"attack\":\"Splash\",\"height\":\"0.9m\",\"name\":\"Magikarp\",\"type\":\"Water\",\"typeColour\":\"blue\",\"weight\":\"10kg\"}," +
                "{\"id\":8,\"attack\":\"Psychic\",\"height\":\"0.4m\",\"name\":\"Mew\",\"type\":\"Psychic\",\"typeColour\":\"purple\",\"weight\":\"4.0kg\"}," +
                "{\"id\":1,\"attack\":\"Thunderbolt\",\"height\":\"0.4m\",\"name\":\"Pikachu\",\"type\":\"Electric\",\"typeColour\":\"yellow\",\"weight\":\"6.0kg\"}," +
                "{\"id\":7,\"attack\":\"Hyper Beam\",\"height\":\"2.1m\",\"name\":\"Snorlax\",\"type\":\"Normal\",\"typeColour\":\"grey\",\"weight\":\"460kg\"}," +
                "{\"id\":4,\"attack\":\"Solar Beam\",\"height\":\"2.0m\",\"name\":\"Venusaur\",\"type\":\"Grass/Poison\",\"typeColour\":\"green\",\"weight\":\"100kg\"}]";
    }
}