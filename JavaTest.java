import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person{
    private String name;
    private Integer age;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class JavaTest {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",20));
        list.add(new Person("王五",16));
        list.remove(new Person("张三",18));
        System.out.println(list.contains(new Person("李四",20)));
        for(Person person:list){
            System.out.println(person);
        }
    }
}
