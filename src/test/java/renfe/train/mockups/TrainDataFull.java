package renfe.train.mockups;

import renfe.train.domain.ITrainRepository;
import renfe.train.domain.Train;

import java.util.ArrayList;
import java.util.Objects;

public class TrainDataFull implements ITrainRepository {
    ArrayList<Train> result = new ArrayList<>();
    public int storage=0;
    public int added = 0;
    public int deleted = 0;

    @Override
    public ArrayList<Train> findAll() {

        result.add(new Train("1","Modelo 1","Renfe","5"));
        result.add(new Train("2","Modelo 1","Renfe","5"));
        result.add(new Train("3","Modelo 1","Renfe","5"));
        result.add(new Train("4","Modelo 1","Renfe","5"));
        result.add(new Train("5","Modelo 1","Renfe","5"));

        storage = result.toArray().length;
        return result;
    }

    @Override
    public void save(Train train) {
        result.add(train);
        storage ++;
        added ++;
    }

    @Override
    public void delete(String trainId) {
        result.removeIf(train -> Objects.equals(train.getId(), trainId));
        deleted ++;
    }
}
