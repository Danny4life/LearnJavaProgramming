public class Main {
    public static void main(String[] args) {

//        Car porshe = new Car();
//
//        porshe.setModel("honda");
//
//        System.out.println("model name is: " + porshe.getModel());


        BankAccount bob = new BankAccount(12345, 0.0, "bob", "bob@gmail.com",
                "(080) 1234");

        System.out.println(bob.getAccountBalance());
        bob.depositFunds(20000);
        bob.depositFunds(30000);

        bob.withdrawFunds(3000);
        bob.withdrawFunds(5000);


        }
    }

