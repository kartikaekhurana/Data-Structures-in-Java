package com.JavaPractical;

public class Constructor { 
    public static class student {
        private int Phone;
        private int RollNumber;
        private String Email;
        private int ServiceId;

        public student(int Phone, int RollNumber, String Email) {
            this.Phone = Phone;
            this.RollNumber = RollNumber;
            this.Email = Email;
        }
        public int getPhone() {
            return Phone;
        }
        public int getRollNumber() {
            return RollNumber;
        }
        public String getEmail() {
            return Email;
        }
        public student(int ServiceId) {
            this.ServiceId = ServiceId;
         }
        public int getServiceId(){
        return  ServiceId;
    }
    }  
    
    public static void main(String[] args) {
        student detail = new student(91, 652, "kartikaekhurana002@gmail.com");
        System.out.println("Email: " + detail.getEmail());
        System.out.println("Phone Number Code: " + detail.getPhone());
        System.out.println("Roll Number: " + detail.getRollNumber());
        student detailsecond = new student(123);
        System.out.println("SId: " + detailsecond.getServiceId());
    }
}
