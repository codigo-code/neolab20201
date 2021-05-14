package estructurasControl;

public class CondicionalesMain {

    public static void main(String args[]) {
        System.out.println("Mes seleccionado: " + devolverMes(2));
        System.out.println("Temporada seleccionada: " + devolverTemporada(2));
    }

    public static String devolverMes(int nroMes) {
        String mes = null;
        switch (nroMes) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Operación incorrecta";
                break;
        };
        return mes;
    }

    public static String devolverTemporada(int temporada) {
        if (temporada == 1) {
            return "Otoño";
        } else if (temporada == 2) {
            return "Invierno";
        } else if (temporada == 3) {
            return "Primavera";
        } else if (temporada == 4) {
            return "Verano";
        }
        return "Operación incorrecta";
    }

}
