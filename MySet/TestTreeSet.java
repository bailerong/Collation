package MySet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else{
            return this.name.compareTo(o.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class TestTreeSet {
    public static void main(String[] args) {
        Set<Person> set=new TreeSet<>();
        set.add(new Person("张三",18));
        set.add(new Person("李四",18));
        set.add(new Person("王麻子",20));
        set.add(new Person("一一",18));
        System.out.println(set);

    }
}
