package renfe.train.domain;

import org.junit.jupiter.api.Test;
import renfe.train.mockups.TrainDataFull;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindAllTrainsUseCaseTest {
    TrainDataFull trainDataFull;
    FindAllTrainsUseCase findAllTrainsUseCase;

    @Test
    void ShouldReturnFirstTrain() {
        trainDataFull = new TrainDataFull();
        findAllTrainsUseCase = new FindAllTrainsUseCase(trainDataFull);

        ArrayList<Train> test = findAllTrainsUseCase.execute();

        assertEquals("1", test.get(0).getId());
    }
}