public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    public Car(String brand,String model,int year,String country,String color,double engineVolume) {
        if(brand==null||brand.isEmpty()||brand.isBlank()){
            this.brand="default";
        }
        else {
            this.brand=brand;
        }
        if (model==null||model.isEmpty()||model.isBlank()){
            this.model="default";
        }
        else{
            this.model = model;
        }
        if (year<=0){
            this.year=2000;
        }
        else{
            this.year = year;
        }
        if (country==null||country.isEmpty()||country.isBlank()){
            this.country="default";
        }
        else{
            this.country = country;
        }
        if (color==null||color.isEmpty()||color.isBlank()){
            this.color=" белый ";
        }
        else{
            this.color = color;
        }
            if (engineVolume<=0){
            this.engineVolume=1.5;
        }
        else{
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return
                "" + brand  +
                " " + model  +
                "," + year+
                " год выпуска, сборка в " + country +" "+
                 color +" цвета "+
                ", объем двигателя- " + engineVolume + " л.";
    }
}

