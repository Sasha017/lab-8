/*package ua.lviv.iot.tableware.rest.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.tableware.rest.model.DisponsableTableWare;
import ua.lviv.iot.tableware.rest.model.SortType;

public class DisponsableTableWareManagerUtils {

	//new static country comparator
    private static final MatherialComparator SONG_BY_MATHERIAL = new DisponsableTableWareManagerUtils().newMatherialComparator();

    public static void sortByMatherial(List<DisponsableTableWare> exerciseMachine, SortType sortType) {
        exerciseMachine.sort(sortType == SortType.ASC ? SONG_BY_MATHERIAL : SONG_BY_MATHERIAL.reversed());
    }

//static inner class
    private static final PricePerHourComparator SONG_BY_MATHERIAL = new PricePerHourComparator();

    private static class PricePerHourComparator implements Comparator<AbstractExerciseMachine> {

        @Override
        public int compare(AbstractExerciseMachine exerciseMachineFirst,
                AbstractExerciseMachine exerciseMachineSecond) {
            return (int) (exerciseMachineFirst.getPricePerHour() - exerciseMachineSecond.getPricePerHour());
        }
    }

    public static void sortExerciseMachinesByPriceDes(List<AbstractExerciseMachine> exerciseMachine,
            SortType sortType) {

        exerciseMachine.sort(sortType == SortType.DESCENDING ? PRICE_COMPARATOR : PRICE_COMPARATOR.reversed());
    }

//inner class
    // Should be static to not create an instance of an external class
    private class ProducingCountryComparator implements Comparator<AbstractExerciseMachine> {

        @Override
        public int compare(AbstractExerciseMachine exerciseMachineFirst,
                AbstractExerciseMachine exerciseMachineSecond) {
            return (int) exerciseMachineFirst.getProducingCountry()
                    .compareTo(exerciseMachineSecond.getProducingCountry());
        }

    }

    public static void sortByProducingCountryAsc(List<AbstractExerciseMachine> exerciseMachines, SortType sortType) {
        exerciseMachines.sort(sortType == SortType.ASCENDING ? new GymManagerUtils().new ProducingCountryComparator()
                : new GymManagerUtils().new ProducingCountryComparator().reversed());
    }

    // anonymous inner class
    public static void sortByModelAsc(List<AbstractExerciseMachine> exerciseMachine, SortType sortType) {
        Comparator<AbstractExerciseMachine> modelComparator = new Comparator<AbstractExerciseMachine>() {

            @Override
            public int compare(AbstractExerciseMachine exerciseMachineFirst,
                    AbstractExerciseMachine exerciseMachineSecond) {
                return (int) (exerciseMachineFirst.getModel().compareTo(exerciseMachineSecond.getModel()));
            }

        };

        exerciseMachine.sort(sortType == SortType.ASCENDING ? modelComparator : modelComparator.reversed());
    }

    // lambda
    public static void sortExerciseMachinesByDurationDes(List<AbstractExerciseMachine> exerciseMachines,
            SortType sortType) {
        if (sortType == SortType.DESCENDING) {
            exerciseMachines.sort((exerciseMachineFirst, exerciseMachineSecond) -> Double.compare(
                    exerciseMachineFirst.getDurationInMinutes(), exerciseMachineSecond.getDurationInMinutes()));
        } else {
            exerciseMachines.sort((exerciseMachineFirst, exerciseMachineSecond) -> Double.compare(
                    exerciseMachineSecond.getDurationInMinutes(), exerciseMachineFirst.getDurationInMinutes()));
        }

    }

}*/