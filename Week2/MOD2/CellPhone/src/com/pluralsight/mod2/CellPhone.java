package com.pluralsight.mod2;

public class CellPhone {
        private Integer serialNumber = 000000000;
        private String model = "unknown", carrier ="unknown", phoneNumber = "unknown", owner = "unknown";

        public CellPhone(Integer serialNumber, String model, String carrier, String phoneNumber, String owner){
            this.serialNumber = serialNumber;
            this.model = model.trim();
            this.carrier = carrier.trim();
            this.phoneNumber = phoneNumber.trim();
            this.owner = owner.trim();
        }

    public CellPhone() {

    }

    public Integer getSerialNumber(){
            return this.serialNumber;
        }

        public String getModel() {
            return this.model;
        }

        public void changePhone(Integer serialNumber, String model){
            this.serialNumber = serialNumber;
            this.model = model;
        }

        public String getCarrier() {
            return this.carrier;
        }

        public  void changeCarrier(String carrier){
            this.carrier = carrier;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void changeNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getOwner(){
            return this.owner;
        }
        public String dial(String phoneNumber){
            return this.owner + " is calling " + phoneNumber;
        }


        public void setOwner(String owner) {
                this.owner = owner;
        }

}
