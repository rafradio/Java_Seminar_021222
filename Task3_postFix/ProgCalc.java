public class ProgCalc {
    public static void main(String[] args) {
        Addclass obj = new Addclass();
        obj.initSets();
        System.out.println(obj.stringCalc);
        obj.findIntAndOper();
        System.out.println(obj.deqNum);
        System.out.println(obj.qOpertors);
        obj.methodCalc();
        System.out.println(obj.deqNum);
        System.out.println("Ответ равен: " + obj.findAnswer());
    }
}
