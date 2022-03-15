package threads;

import collection.dto.Student;
import collection.predicates.StudentScoreAndAgePredicate;
import collection.suppliers.NameFromFileSupplier;
import collection.suppliers.NameFromRandomRussianCharacterSupplier;
import collection.suppliers.StudentFakeSupplier;
import threads.job.AddToCollectionWithCountRunnable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyThreadsMain {
    public static void main(String[] args) {
        Supplier<collection.dto.Student> supplier = new StudentFakeSupplier(new NameFromFileSupplier());
        Predicate<Student> predicate = new StudentScoreAndAgePredicate();

        List<Student> list = new ArrayList<>();
        Runnable job1 = new AddToCollectionWithCountRunnable(list, supplier, 100);

        Object lock = new Object();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Thread thJob1 = new Thread(job1);
            synchronized (lock){
                thJob1.start();
                threads.add(thJob1);
            }
        }

        List<Student> filtered = new ArrayList<>();

        Set<Thread> handledThreads = new HashSet<>();
        for (Thread thread : threads) {

        }


    }
}
