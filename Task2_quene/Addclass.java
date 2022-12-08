import java.util.LinkedList;
import java.util.Queue;

public class Addclass {
    public Queue<Integer> q;

    public Addclass() {
        this.q = new LinkedList<Integer>();
    }

    public void initSets() {
        for (int i = 0; i < 5; i++) this.q.add(i);
    }

    public void printQuene(String note, Queue<Integer> qForPrint) {
        System.out.println(note + qForPrint);
                           
    }

    public Queue<Integer> enqueue(Integer addNumber, Queue<Integer> qForAdd) {
        qForAdd.add(addNumber);
        return qForAdd;
    }

    public Integer dequeue() {
        Integer removedele = this.q.remove();
        return removedele;
    }

    public ClassForMoving dequeueClass() {
        ClassForMoving tempClass = new ClassForMoving();
        tempClass.firstElement = this.q.remove();
        tempClass.qCopy = this.q;
        return tempClass;
    }

    public Integer first() {
        return this.q.peek();

    }
}
