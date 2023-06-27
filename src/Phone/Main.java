package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8888888", "Nokia", 0.3);
        Phone phone2 = new Phone("4444423", "Samsung");
        Phone phone3 = new Phone();

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight);
        phone1.receiveCall("Arseny");
        System.out.println();

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight);
        phone2.receiveCall("Alexey", "4321234");
        System.out.println();

        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight);
        phone3.receiveCall("Nicholas");
        System.out.println();
        phone1.sendMessage("1231313", "13232113");
    }
}
