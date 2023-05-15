public class Car{
        private int Id;
        private String numberAuto;

        public Car() {
        }

        public Car(int id, String numberAuto) {
            Id = id;
            this.numberAuto = numberAuto;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getNumberAuto() {
            return numberAuto;
        }

        public void setNumberAuto(String numberAuto) {
            this.numberAuto = numberAuto;
        }

        @Override
        public String toString() {
            return "Car: " +
                    "Id: " + Id +
                    "numberAuto: " + numberAuto ;
        }
    }

