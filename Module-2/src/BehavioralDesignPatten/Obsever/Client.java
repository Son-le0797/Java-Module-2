package BehavioralDesignPatten.Obsever;

public class Client {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer observer1 = new Observer() {

            public void update(String message) {

                System.out.println("Message 1 changed: " + message);

            }

        };

        subject.attach(observer1);

        Observer observer2 = new Observer() {

            public void update(String message) {

                System.out.println("Message 2 changed: " + message);

            }

        };

        Observer observer3 = new Observer() {

            public void update(String message) {

                System.out.println("Message 3 changed: " + message);

            }

        };

        subject.attach(observer2);

        subject.attach(observer3);


        subject.notifyChange("Test change state 1");

        subject.notifyChange("Test change state 3");



        subject.notifyChange("Test change state 2");

        subject.detach(observer3);

        subject.notifyChange("Test change state 3");

    }

}
