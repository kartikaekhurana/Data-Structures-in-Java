package com.JavaPractical;
public class AbstractClass {
    abstract static class Animal{
        abstract void Sound();
    }
    
    static class Dog extends Animal{
        public void Sound(){
            System.out.println("Dog do Bow Bow ");
        }
    }
    static class Cat extends Animal{
        public void Sound(){
            System.out.println("Cat do Meow Meow");
        }
    }
    public static void main(String[] args){
Dog dog = new Dog();
Cat cat = new Cat();
dog.Sound();
cat.Sound();

}
}

