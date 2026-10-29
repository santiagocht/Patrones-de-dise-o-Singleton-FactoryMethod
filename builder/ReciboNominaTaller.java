public class ReciboNomina {
    private Empleado empleado;
    private double horasExtra;
    private double bonificacion;
    private double auxilioTransporte;
    private double descuentoLibranza;

    public ReciboNomina(Empleado e) {
        this.empleado = e.empleado;
        this.horasExtra = e.horasExtra;
        this.bonificacion = e.bonificacion;
        this.auxilioTransporte = e.auxilioTransporte;
        this.descuentoLibranza = e.descuentoLibranza;
    }

    public static class Builder(){
        private Empleado empleado;
        private double horasExtra, bonificacion, auxilioTransporte, descuentoLibranza;

    
        public Builder horasExtra(double horasExtra){
        this.horasExtra=horasExtra;
        return this;

        };


    }

    public double totalPagar() {
        return empleado.calcularSalario() + horasExtra + bonificacion
                + auxilioTransporte - descuentoLibranza;
    }

    public String getNombreEmpleado() {
        return empleado.getNombre();
    }
}
