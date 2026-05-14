package renfe.train.domain;

import org.junit.jupiter.api.Test;
import renfe.train.mockups.TrainDataFull;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTrainUseCaseTest {
    TrainDataFull trainDataFull;
    DeleteTrainUseCase deleteTrainUseCase;

    @Test
    void ShouldDeleteOneTrain() {
        trainDataFull = new TrainDataFull();
        deleteTrainUseCase = new DeleteTrainUseCase(trainDataFull);

        deleteTrainUseCase.execute("1");

        assertEquals(1,trainDataFull.deleted);
    }
}