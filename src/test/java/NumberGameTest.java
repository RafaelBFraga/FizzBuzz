import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumberGameTest {

    public NumberGame game = new NumberGame();

    @Test
    public void shouldBeDividedByThree() {
        int number = 9;
        assertThat(game.isDividedByThree(number), is(true));
    }

    @Test
    public void shouldBeDividedByFive() {
        int number = 10;
        assertThat(game.isDividedByFive(number), is(true));
    }

    @Test
    public void shouldBeDividedByFiveAndThree() {
        int number = 15;
        assertThat(game.isDividedByFiveAndThree(number),is(true));
    }

    @Test
    public void shouldSayFizz() {
        assertThat(game.sayFizz(), is("Fizz"));
    }

    @Test
    public void shouldSayBuzz() {
        assertThat(game.sayBuzz(), is("Buzz"));
    }

    @Test
    public void shouldSayFizzBuzz() {
        assertThat(game.sayFizzBuzz(),is("FizzBuzz"));
    }

    @Test
    public void shouldDecideFizzOrBuzz(){
        assertThat(game.decideFizzOrBuzz(14),is("14"));
        assertThat(game.decideFizzOrBuzz(3),is ("Fizz"));
        assertThat(game.decideFizzOrBuzz(5),is("Buzz"));
    }

    @Test
    public void shouldRunGame() {

    }
}