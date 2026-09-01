package Jobsheet1;

public class SmartTv extends Televisi {
    private String sistem;

    public void Sistem(String sistem) {
        this.sistem = sistem;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Sistem tv: " + sistem);
    }
}
