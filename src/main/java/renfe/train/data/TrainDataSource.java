package renfe.train.data;

import renfe.train.domain.ITrainRepository;
import renfe.train.domain.Train;

import java.util.ArrayList;

public class TrainDataSource implements ITrainRepository {
    private ITrainRepository iTrainRepository;

    public TrainDataSource(ITrainRepository iTrainRepository) {
        this.iTrainRepository = iTrainRepository;
    }

    @Override
    public ArrayList<Train> findAll() {
        return iTrainRepository.findAll();
    }

    @Override
    public void save(Train train) {
        iTrainRepository.save(train);
    }

    @Override
    public void delete(String trainId) {
        iTrainRepository.delete(trainId);
    }
}
