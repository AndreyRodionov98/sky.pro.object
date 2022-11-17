import java.util.Objects;

public class Human {
        private int yearOfBirth;
        private String name;
        private String town;
        private String jobTitle;


        public  Human(String name, String town, int yearOfBirth, String jobTitle ) {
            this.name = name;
            this.town = town;
            this.yearOfBirth = yearOfBirth;
            this.jobTitle=jobTitle;
            if(yearOfBirth>=0){
                this.yearOfBirth = yearOfBirth;
            }
            else {
                this.yearOfBirth = Math.abs(yearOfBirth);
            }
            if ( name==null || name.isEmpty()||name.isBlank() ){
                this.name = "Информация не указана";
            }
            else {
                this.name=name;
            }
            if (town==null||town.isBlank()||town.isEmpty()){
                this.town="Информация не указана";
            }
            else {
                this.town=town;
            }
            if (jobTitle==null||jobTitle.isBlank()||jobTitle.isEmpty()){
                this.jobTitle="Информация не указана";
            }
            else {
                this.jobTitle = jobTitle;
            }
    }
    @java.lang.Override
        public java.lang.String toString() {
            return "" +
                    "Привет меня зовут " + name  +
                    " Я из города " + town +
                    " Я родился в " + yearOfBirth + " году.Я работаю на должности  "+ jobTitle+" . Будем знакомы!";
        }
    }

