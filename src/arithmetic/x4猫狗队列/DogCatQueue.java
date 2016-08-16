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
public class DogCatQueue {

    private final LinkedList<PetEnterQueue> catQ;
    private final LinkedList<PetEnterQueue> dogQ;
    private       long                      count;


    public DogCatQueue() {
        catQ = new LinkedList<PetEnterQueue>();
        dogQ = new LinkedList<PetEnterQueue>();
        count = 0;
    }

    public void add(Pet pet) {
        if (pet.getType().equals("cat")) {//cat
            catQ.add(new PetEnterQueue(pet, count++));
            System.out.println("add Cat");
        } else if (pet.getType().equals("dog")) {//dog
            dogQ.add(new PetEnterQueue(pet, count++));
            System.out.println("add Dog");
        } else {
            throw new RuntimeException("what are you add???");
        }
    }


    public Pet pollAll() {
        //1.如果猫狗队列都不为空
        if (!dogQ.isEmpty() && !catQ.isEmpty()) {
            if (dogQ.peek().getCount() < catQ.peek().getCount()) {
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!dogQ.isEmpty()) {
            return dogQ.poll().getPet();
        } else if (!catQ.isEmpty()) {
            return catQ.poll().getPet();
        } else {
            throw new RuntimeException("both cat and dog empty");
        }

    }

    public Cat pollCat() {
        if (!isCatEmpty()) {
            return (Cat) catQ.poll().getPet();
        } else {
            throw new RuntimeException("cat is empty");
        }

    }


    public Dog pollDog() {
        if (!isDogEmpty()) {
            return (Dog) dogQ.poll().getPet();
        } else {
            throw new RuntimeException("dog is empty");
        }

    }

    public boolean isEmpty() {
        return dogQ.isEmpty() && catQ.isEmpty();
    }


    public boolean isDogEmpty() {
        return dogQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQ.isEmpty();
    }

}

