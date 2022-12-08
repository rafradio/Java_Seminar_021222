import java.util.LinkedList;
import java.util.*;


public class Addclass {
    public String stringCalc;
    public Queue<String> qOpertors;
    public Deque<Integer> deqNum;

    public Addclass() {
        this.stringCalc = "4 1 7 8 3 - + + -";
        this.qOpertors = new LinkedList<String>();
        this.deqNum = new ArrayDeque<Integer>();

    }

    public void initSets() {
        this.stringCalc = this.stringCalc.replaceAll("\\s", "");
    }

    public void findIntAndOper() {
        for (int i = 0; i < this.stringCalc.length(); i++) {
            String strCh = Character.toString(this.stringCalc.charAt(i));
            try {
                Integer num = Integer.parseInt(strCh);
                this.deqNum.add(num);
            } catch (NumberFormatException nfe) {
                this.qOpertors.add(strCh);
            }
        }
    }
    public void methodCalc() {
        int lengthQ = this.qOpertors.size();
        for (int i = 0; i < lengthQ; i++) {
            if (this.deqNum.size() > 1) {
                Integer int1 = this.deqNum.removeLast();
                Integer int2 = this.deqNum.removeLast();
                String oper = this.qOpertors.remove();
                Integer result = this.calculation(int1, int2, oper);
                this.deqNum.add(result);
            }
        }
    }

    public Integer calculation(Integer int1, Integer int2, String oper) {
        System.out.println(int1 + " " + int2 + oper);
 
        Integer result = 0;
        if (oper.equals("+")) result = int1 + int2;
        if (oper.equals("-")) result = int2 - int1;
        return result;
    }

    public String findAnswer() {
        String otvet = "Ответ не найден";
        if (this.deqNum.size() == 1) otvet = "" + this.deqNum.getLast();
        return otvet;

    }
}
