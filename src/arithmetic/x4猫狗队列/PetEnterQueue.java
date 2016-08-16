package arithmetic.x4猫狗队列;

import arithmetic.x4猫狗队列.bean.Pet;

/**
 * Created by : yulongsun
 * Date on : 16/8/3
 * Desc :
 */
public class PetEnterQueue {
    private Pet  mPet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        mPet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return mPet;
    }

    public void setPet(Pet pet) {
        mPet = pet;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
