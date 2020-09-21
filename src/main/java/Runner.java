public class Runner {


        public static void main(String[] args){
            Planet planet = new Planet("Jupiter",69.911);
            System.out.println(planet.getName() + "is "+ planet.getSize() + "km, in size");
            planet.explode();

        }
    }


