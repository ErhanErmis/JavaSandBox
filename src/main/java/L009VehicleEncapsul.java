public class L009VehicleEncapsul {
    private String modelName;
    private double engineSize;
    private int doorNumber;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;//IMPORTANT: this word represent the variable at the top of this class. model name positioned after equal sign comes from setmodel methods variable place. from inside of the bracket.
        //if our variable names and name coming from user side would be different (like modelName and from the bracket (String speedyModel)) we would no need to use "this" word.
    }

    public double getEngineSize() {
        return engineSize;
    }
//According to our needs we can set some restrictions into our setter.
    public void setEngineSize(double engineSize) {
        if(engineSize<=0.9 &&engineSize>=10){
            System.out.println("You can enter a vehicle with engine size in between 0.9lt and 10lt. Enter a valid engine size, please.");
        }else {

        this.engineSize = engineSize;}
    }


    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        if(doorNumber<0){
            System.out.println("Enter a proper door number please.");
        }else{
        this.doorNumber = doorNumber;}
    }
}
