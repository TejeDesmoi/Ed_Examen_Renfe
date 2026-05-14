import renfe.train.domain.Train;
import renfe.train.view.TrainView;

public class Main {
    public static void main(String[] args) {
        TrainView trainView = new TrainView();

        trainView.AddTrainAndCheck(new Train("1","Modelo 1","Renfe","5"));

        trainView.SeeAllTrains();
    }
}
