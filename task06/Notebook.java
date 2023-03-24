package JavaTask.task06;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private int ram;
    private int rom;
    private String oS;


    public Notebook(String brand, String model, String color, double screenSize, String screenTechnology, int ram, int rom, String oS) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.ram = ram;
        this.rom = rom;
        this.oS = oS;
    }

    public String printInfo() {
        System.out.printf("Бренд: %s, Модель: %s, Цвет: %s, Диагональ экрана: %s, объем оперативной памяти: %s, объем HDD: %s, Операционная система: %s", brand, model, color, screenSize, ram, rom, oS);
        return ".";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }


    public String getOs() {
        return oS;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setOs(String oS) {
        this.oS = oS;
    }

}