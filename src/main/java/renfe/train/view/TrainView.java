package renfe.train.view;

import renfe.train.data.TrainDataSource;
import renfe.train.data.TrainMemLocalDataSource;
import renfe.train.domain.AddTrainUseCase;
import renfe.train.domain.DeleteTrainUseCase;
import renfe.train.domain.FindAllTrainsUseCase;
import renfe.train.domain.Train;

import java.util.ArrayList;

public class TrainView {

    public void AddTrainAndCheck(Train train){
        ArrayList<Train> result = new ArrayList<>();
        FindAllTrainsUseCase findAllTrainsUseCase = new FindAllTrainsUseCase(TrainDataSource.getInstance());
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(TrainDataSource.getInstance());

        result = findAllTrainsUseCase.execute();
        for (Train oTrain : result){
            System.out.println(oTrain.getId()+"\t"+oTrain.getCompañia()+"\t"+oTrain.getModelo()+"\t"+oTrain.getVagones()+"\t");
        }

        addTrainUseCase.execute(train);

        result = findAllTrainsUseCase.execute();
        for (Train oTrain : result){
            System.out.println(oTrain.getId()+"\t"+oTrain.getCompañia()+"\t"+oTrain.getModelo()+"\t"+oTrain.getVagones()+"\t");
        }
    }


}
