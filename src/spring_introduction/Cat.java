package spring_introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
// по умолчанию будет cat, если в названии класса больше 1
// заглавной буквы в начале, то дефолтный будет таким же
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
