class Developer{
    String name;
    int career;
    int salary;
    public Developer(String name, int career){
        this.name = name;
        this.career = career;
        if (career < 3) this.salary = 2800 + this.career * 100;
        else if (career < 7) this.salary = 3500 + this.career * 100;
        else this.salary = 4500 + this.career * 100;
    }
}

public class dev {
    public static void main(String[] args) {
        Developer d1= new Developer("박근원", 2);
        Developer d2 = new Developer("김희진", 5);
        Developer d3 = new Developer("박현준", 9);

        System.out.println(d1.name + "의 연봉은 " + d1.salary + "만원입니다.");
        System.out.println(d2.name + "의 연봉은 " + d2.salary + "만원입니다.");
        System.out.println(d3.name + "의 연봉은 " + d3.salary + "만원입니다.");

    }
}
