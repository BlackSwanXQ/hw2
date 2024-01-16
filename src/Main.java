public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // task2
        dog = dog+4;
        System.out.println(dog);
        cat = cat+4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);

        //task3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);
        friend= friend +2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        //task6
        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var totalWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println(totalWeight);
        var differWeight = boxerWeightOne - boxerWeightTwo;
        System.out.println(differWeight);

        //task7
        var differWeight2 = boxerWeightTwo - boxerWeightOne;
        System.out.println(differWeight2);
        var differWeight3 = boxerWeightTwo % boxerWeightOne;
        System.out.println(differWeight3);

        //task8
        var allTime = 640;
        var everyTime = 8;
        var employeeCount = allTime/everyTime;
        System.out.println("Всего работников в компании - "+ employeeCount + " человек");

        employeeCount = employeeCount + 94;
        System.out.println(employeeCount);
//        var everyTime2 = allTime / employeeCount -not;
        var allTime2 = employeeCount * everyTime;
        System.out.println("Если в кaмпании работает " + employeeCount + " человека, то всего " + allTime2 + " часа работы может быть поделено между сотрудниками");


    }
}