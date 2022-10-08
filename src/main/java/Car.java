public class Car {

    private int door;
    private int wheels;
    private String model;
    private String color;

    public void setModel(String model){

        if (model.equals("toyota") || model.equals("honda")){
            this.model = model;
        } else {
            this.model = "Unknown model";
        }

    }

    public String getModel(){
        return model;
    }


}
