package threads;

import collection.dto.Student;
import collection.predicates.StudentScoreAndAgePredicate;
import collection.suppliers.NameFromArraySupplier;
import collection.suppliers.StudentFakeSupplier;
import threads.job.AddToCollectionWithCountRunnable;
import threads.job.FilterFromCollectionToCollectionWitForRunnable;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyThreadMain8 {
    public static void main(String[] args) {
        Supplier<Student> supplier = new StudentFakeSupplier(new NameFromArraySupplier());
        List<Student> students = Collections.synchronizedList(new ArrayList<>());

        Runnable job1 = new AddToCollectionWithCountRunnable(students, supplier, 10_000);

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(job1);
            thread.start();
            threads.add(thread);
        }

        Predicate<Student> predicate = new StudentScoreAndAgePredicate();

        List<Student> filtered = Collections.synchronizedList(new ArrayList<>());

        int partSize = 100_000;

        Set<Thread> handledThreads = new HashSet<>();

        while (handledThreads.size() != threads.size()){
            for (Thread thread : threads) {
                if(!thread.isAlive()){
                    if(!handledThreads.contains(thread)){

                        int fromIndex = partSize * handledThreads.size();
                        int toIndex = fromIndex + partSize;

                        List<Student> copyOfStudent = new ArrayList<>(students);

                        Runnable job2 = new FilterFromCollectionToCollectionWitForRunnable(
                                copyOfStudent, filtered, predicate
                        );

                        Thread threadJob2 = new Thread(job2);
                        threadJob2.start();

                        handledThreads.add(thread);
                    }
                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Что-то пошло не так");
            }
        }



        System.out.println(filtered.size());
        System.out.println(students.size());
    }
}
