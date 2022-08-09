package ChildClassesInMethodParameters;

class NoodleRestaurant {
    String name;

    public NoodleRestaurant(String customerName){
        name = customerName;
    }

    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        Noodle ramen, pho;
        ramen = new Ramen();
        pho = new Pho();

        NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
        NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");
        // call the order() method on customer1 with pho as an argument
        customer1.order(pho);
        //call the order() method on customer2 with ramen as an argument.
        customer2.order(ramen);




    }
}
