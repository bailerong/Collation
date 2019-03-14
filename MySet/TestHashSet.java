package MySet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Person2 implements Comparable<Person2>{
    private String name;
    private int age;
    private Object object;
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
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

    @Override
    public int compareTo(Person2 o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else{
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
public class TestHashSet {
    public static void main(String[] args) {
        Set<Person2> set=new HashSet<>();
        set.add(new Person2("张三",19));
        set.add(new Person2("李四",19));
        set.add(new Person2("王麻子",19));
        set.add(new Person2("张三",19));
        set.add(new Person2("李丽",20));
        System.out.println(set);

    }
}
