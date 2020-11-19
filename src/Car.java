public class Car {
    private double tankVolume;
    private double tankResidue;
    private double fuelConsumption;

    public Car(double tankVolume, double tankResidue, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.tankResidue = tankResidue;
        this.fuelConsumption = fuelConsumption;
        System.out.println("Объем бака - " + this.tankVolume + " л");
        System.out.println("Остаток топлива - " + this.tankResidue + " л");
        System.out.println("Расход топлива на 100 км - " + this.fuelConsumption + " л");
        System.out.println("===================================================");
    }

    public Car() {

    }

    public void refueling() {
        if(tankVolume==tankResidue){
            System.out.println("У вас полный бак !");
            return;
        }
        System.out.println("В вашем баке " + tankResidue + " л");
        System.out.println("До полного объема в баке вам нужно дозоправиться бензином на " + (tankVolume - tankResidue));
        System.out.println("Запаравляем ваш бак...");
        tankVolume = tankResidue + (tankVolume - tankResidue);
        System.out.println("Теперь ваш бак полон ! В нем : " + tankVolume + " л");
        System.out.println("=============================================");
    }

    public void fuelRemaining(double n) {
        System.out.println("У вас был полный бак : " + tankVolume + " л");
        double fuelLeft = tankVolume - (fuelConsumption / 100 * n);
        System.out.println("Вы проехали " + n + " км, теперь в вашем баке осталось " + fuelLeft + " л");
        System.out.println("=============================================");
    }

    public double refuelingAfterRide(double n) {
        double fuelLeft = tankVolume - (fuelConsumption / 100 * n);
        tankResidue = fuelLeft;
        System.out.println("В вашем баке осталось : " + fuelLeft + " л");
        System.out.println("Объем бака : " + tankVolume);
        System.out.println("Осталось дозаправить : " + (tankVolume - fuelLeft) + " л");
        System.out.println("=============================================");
        return (tankVolume-fuelLeft);
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getTankResidue() {
        return tankResidue;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setTankResidue(double tankResidue) {
        this.tankResidue = tankResidue;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
