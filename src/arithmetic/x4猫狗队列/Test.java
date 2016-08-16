package arithmetic.x4猫狗队列;

import arithmetic.x4猫狗队列.bean.Cat;
import arithmetic.x4猫狗队列.bean.Dog;

/**
 * Created by : yulongsun
 * Date on : 16/8/3
 * Desc :
 */
public class Test {

    public static void main(String args[]) {
        DogCatQueue dogCatQueue = new DogCatQueue();
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Cat());
        while (dogCatQueue.pollAll() != null) {
            System.out.println(dogCatQueue.pollAll().getType());
        }
    }
}
