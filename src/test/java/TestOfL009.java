public class TestOfL009 {
    public static void main(String[] args) {
        L009VehicleEncapsul vehicle1=new L009VehicleEncapsul();
        vehicle1.setModelName("Jaguar");
        vehicle1.setDoorNumber(-2);
        vehicle1.setEngineSize(0);
        System.out.println(vehicle1.getDoorNumber()+vehicle1.getModelName()+vehicle1.getEngineSize());

        L009VehicleEncapsul vehicle2=new L009VehicleEncapsul();
        vehicle2.setModelName("Range Rover");
        vehicle2.setDoorNumber(3);
        vehicle2.setEngineSize(1.5);
        System.out.println(vehicle2.getDoorNumber()+vehicle2.getModelName()+vehicle2.getEngineSize());

        L009VehicleEncapsul vehicle3=null;
        vehicle3.setModelName("aaa");
        vehicle3.setDoorNumber(3);
        vehicle3.setEngineSize(1.5);
        System.out.println(vehicle3.getDoorNumber()+vehicle3.getModelName()+vehicle3.getEngineSize());
        System.out.println("hello world");

    }
}
