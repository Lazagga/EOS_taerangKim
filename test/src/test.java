class Developer{
    String name;
    int career;
    int salary;

    Developer(String name, int career){
        this.name = name;
        this.career = career;
        if (this.career < 3){
            this.salary = 2800 + 100 * this.career;
        }
        else if (this.career < 7){
            this.salary = 3500 + 100 * this.career;
        }
        else{
            this.salary = 4500 + 100 * this.career;
        }
    }

}

public class test {
    public static void main(String[] args) {
        Developer d1 = new Developer("박근원", 2);
        Developer d2 = new Developer("김희진", 5);
        Developer d3 = new Developer("박현준", 9);

        System.out.println(d1.name + "의 연봉은 " + d1.salary + "만원입니다.");
        System.out.println(d2.name + "의 연봉은 " + d2.salary + "만원입니다.");
        System.out.println(d3.name + "의 연봉은 " + d3.salary + "만원입니다.");
    }
}
