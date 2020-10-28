package madrigal.adriana.tarea02.ejercicio02.bl.entidades;

public class Motor {
    private String serialNumber;
    private String marcaMotor;
    private String type;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Motor(String serialNumber, String marca, String type) {
        this.serialNumber = serialNumber;
        this.setMarcaMotor(getMarcaMotor());
        this.type = type;
    }

    public Motor() {
    }

    @Override
    public String toString() {
        return "Motor{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marcaMotor='" + getMarcaMotor() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
