package renfe.train.domain;

public class DeleteTrainUseCase {
    private ITrainRepository iTrainRepository;

    public DeleteTrainUseCase(ITrainRepository iTrainRepository) {
        this.iTrainRepository = iTrainRepository;
    }

    public void execute(String trainId){
        iTrainRepository.delete(trainId);
    }
}
