package renfe.train.domain;

import java.util.ArrayList;

public interface ITrainRepository {
    ArrayList<Train> findAll();
    void save(Train train);
    void delete(String trainId);
}
