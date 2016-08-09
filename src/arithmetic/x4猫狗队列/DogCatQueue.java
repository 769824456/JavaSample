package arithmetic.x4猫狗队列;

import java.util.LinkedList;

import arithmetic.x4猫狗队列.bean.Cat;
import arithmetic.x4猫狗队列.bean.Dog;
import arithmetic.x4猫狗队列.bean.Pet;

/**
 * Created by : yulongsun
 * Date on : 16/8/3
 * Desc : 猫狗队列
 */
public class PetEnterQueue {

    private final LinkedList<Cat> catQ;
    private final LinkedList<Dog> dogQ;

    public PetEnterQueue() {
        catQ = new LinkedList<Cat>();
        dogQ = new LinkedList<Dog>();
    }

    public void add(Pet pet) {
        if (pet.getType().equals("cat")) {//cat
            catQ.add((Cat) pet);
        } else if (pet.getType().equals("dog")) {//dog
            dogQ.add((Dog) pet);
        } else {
            throw new RuntimeException("what are you add???");
        }
    }


    public Pet pollPet() {

    }

    public Cat pollCat() {

    }


    public Dog pollDog() {
    }

    public void isEmpty() {

    }


    public void isDogEmpty() {

    }

    public void isCatEmpty() {

    }

}

