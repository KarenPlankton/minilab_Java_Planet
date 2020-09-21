public class Planet {


        private String name;

        private double size;

        public Planet(String name,double size){
            this.name = name;
            this.size = size;
            Planet planet;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String newName){
            this.name = newName;
        }

        public double getSize(){
            return this.size;
        }

        public void setSize(Double newSize){
            this.size= newSize;
        }

        public  void explode(){
            System.out.println("Boom!" + this.name + " has exploded.");

        }
    }


