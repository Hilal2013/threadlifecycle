package multithreading;

public class Multithreading {
    public static void main(String[] args) {
        MultithreadThing myThing=new MultithreadThing(1);
        myThing.run();//1 2 3 4 5//it will run the code but it wont do in a  seperate thread
        //lets create second thread
        MultithreadThing myThing2=new MultithreadThing(2);
myThing2.run();
//1 2 3 4 5 1 2 3 4 5
        // to kick off new thread
        //  myThing.start();
        //lets create 3 thread
        for (int i = 1; i <=3; i++) {
            MultithreadThing myThread=new MultithreadThing(i);
            myThread.start();
        }
//1 1 1 2 2 2 3 3 3 4 4 4 5 5 5

       //no gurantee which thread is going to be doing first
        //1 from thread 1
        //1 from thread 2
        //1 from thread 3
        //2 from thread 1
        //2 from thread 3
        //2 from thread 2
        //3 from thread 1
        //3 from thread 2
        //3 from thread 3
        //4 from thread 2
        //4 from thread 3
        //4 from thread 1
        //5 from thread 3
        //5 from thread 2
        //5 from thread 1

        // one of thread blows out with some kind of exception it doesnt impact any of the other ones
        //the others just keep going business as usual
    }
}
