package renfe.train.domain;

public class AddTrainUseCase {
    private ITrainRepository iTrainRepository;

    public AddTrainUseCase(ITrainRepository iTrainRepository) {
        this.iTrainRepository = iTrainRepository;
    }

    public void execute(Train train){
        iTrainRepository.save(train);
    }
}
