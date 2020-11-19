
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(75, 75, 8);
        double gasPrice = 23.4D;
        double literCount = 0;
        System.out.println("Маршрут Одесса - Киев (479 км)");
        System.out.println("Цена бензина А-95 за 1 л в среднем - " + gasPrice + " грн");
        double firstDistance = 177.7D;//Расстояние от Одессы до первой остановки(Кривое Озеро)
        double secondDistance = 327.4D - firstDistance;//Расстояние от первой остановки(Кривое Озеро) до второй(Жашков)
        double thirdDistance = 479.0D - (firstDistance + secondDistance);//Расстояние от второй остановки до Киева
        car.refueling();
        System.out.println("После первой остановки :");
        car.fuelRemaining(firstDistance);
        literCount += car.refuelingAfterRide(firstDistance);
        car.refueling();
        System.out.println("После второй остановки :");
        car.fuelRemaining(secondDistance);
        literCount += car.refuelingAfterRide(secondDistance);
        car.refueling();
        System.out.println("Пункт назначения :");
        car.fuelRemaining(thirdDistance);
        literCount += car.refuelingAfterRide(thirdDistance);
        System.out.println("В пункте назначение с учетом двух дозаправок топлива осталось " + car.getTankResidue() + " л");
        System.out.println("Всего на поездку вы потратили - " + literCount + " л бензина");
        System.out.println("Стоймость затраченного бензина - " + (literCount * gasPrice) + " грн");
    }
}
