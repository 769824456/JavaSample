package pattern.builder.builder;

import pattern.builder.model.BenzModel;
import pattern.builder.model.CarModel;

import java.util.ArrayList;

/**
 * Created by yulongsun on 2016/5/16.
 */
public abstract class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    CarModel getCarModel() {
        return this.benzModel;
    }


}
