package Jobsheet1;

public class KomporTanam extends Kompor {
    private String material;

    public void Material(String material) {
        this.material = material;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Material kompor: " + material);
    }
}
