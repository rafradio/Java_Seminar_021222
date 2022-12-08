// import java.util.LinkedList;
// import java.util.Queue;

public class Progquene {
    public Addclass init;
    // public Integer firstElement;
    // public Queue<Integer> qCopy;

    static void printQuene(Integer removedelete) {
        System.out.println("Удаленное значение: " + removedelete);
    }
    public static void main(String[] args) {
        Progquene start = new Progquene();
        start.init = new Addclass();
        start.init.initSets();

        start.init.printQuene("Первоначальный массив: ", start.init.q);

        start.init.q = start.init.enqueue(10, start.init.q);
        start.init.printQuene("Массив после добавления: ", start.init.q);

        Integer removedelete = start.init.dequeue();
        System.out.println("Удаленное значение: " + removedelete);
        start.init.printQuene("Массив после удаления: ", start.init.q);

        ClassForMoving mainTemp = start.init.dequeueClass();
        printQuene(mainTemp.firstElement);
        start.init.printQuene("Массив после удаления: ", mainTemp.qCopy);
        
        Integer firstElement = start.init.first();
        System.out.println("Первый элемент: " + firstElement);
        start.init.printQuene("Массив после first: ", start.init.q);
    }
}
