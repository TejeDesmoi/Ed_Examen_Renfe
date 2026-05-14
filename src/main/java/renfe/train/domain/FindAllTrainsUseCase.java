package renfe.train.domain;

import java.util.ArrayList;

public class FindAllTrainsUseCase {
    private ITrainRepository iTrainRepository;

    public FindAllTrainsUseCase(ITrainRepository iTrainRepository) {
        this.iTrainRepository = iTrainRepository;
    }

    public ArrayList<Train> execute(){
        return  iTrainRepository.findAll();
    }
}
