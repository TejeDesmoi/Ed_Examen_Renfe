package renfe.train.domain;

import org.junit.jupiter.api.Test;
import renfe.train.mockups.TrainDataFull;

import static org.junit.jupiter.api.Assertions.*;

class AddTrainUseCaseTest {
    TrainDataFull trainDataFull;
    AddTrainUseCase addTrainUseCase;

    @Test
    void shouldAddOneTrain() {
        trainDataFull = new TrainDataFull();
        addTrainUseCase = new AddTrainUseCase(trainDataFull);

        addTrainUseCase.execute(new Train("6","Modelo 1","Renfe","5"));

        assertEquals(1, trainDataFull.added);
    }


}