public class TestOfL008 {
    public static void main(String[] args) {
        L08OOPConceptVehicles vehicles=new L08OOPConceptVehicles();
        vehicles.color="Red";//we could not assign a value to this variable when we you private access modifier.Then we change it to public.
        vehicles.doorNumber=3;
        vehicles.wheelNumber=4;//the issue in this point. We can give -4 too as a value and this will be not a logical value. To avoid a kind of issue like this at the following class we will use encapsulation.
        vehicles.brandName="Volkswagen";
        vehicles.modelName="Polo";
        System.out.println("Click yes if the details of your car is correct. " +
                        "\nBrand name:"+vehicles.brandName+
                        "\nModel name:" +vehicles.modelName+
                        "\nDoor number:"+vehicles.doorNumber+
                        "\nWheel number:"+vehicles.wheelNumber+
                        "\nVehicle color:"+vehicles.color);
    }
}
