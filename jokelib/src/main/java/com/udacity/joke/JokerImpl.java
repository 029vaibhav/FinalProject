package com.udacity.joke;

import java.util.Random;

public class JokerImpl implements Joker {

    String[] joke = {"The original draft of The Lord of the Rings featured Chuck Norris instead of Frodo Baggins. It was only 5 pages long, as Chuck roundhouse-kicked Sauron's ass halfway through the first chapter.",
            "Hellen Keller's favorite color is Chuck Norris.", "A diff between your code and Chuck Norris's is infinite.", "It is better to give than to receive. This is especially true of a Chuck Norris roundhouse kick.",
            "Chuck Norris can be unlocked on the hardest level of Tekken. But only Chuck Norris is skilled enough to unlock himself. Then he roundhouse kicks the Playstation back to Japan."};


    @Override
    public String getJoke() {

        Random rn = new Random();
        int maximum = 4;
        int minimum = 0;
        int range = maximum - minimum + 1;
        int randomNum = rn.nextInt(range) + minimum;
        return joke[randomNum];

    }
}
