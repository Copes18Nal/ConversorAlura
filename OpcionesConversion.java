package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMonedas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir!", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De PesosMx a Dólares", "De PesosMx a Euros", "De PesosMx a Libras Esterlinas", "De PesosMx a Yen Japonés", "De PesosMx a Won sur-coreano", 
            "De Dólares a PesosMx", "De Euros a PesosMx", "De Libras Esterlinas a PesosMx", "De Yen Japonés a PesosMx", "De Won sur-coreano a PesosMx"}, "Seleccion")).toString();

        switch (opcion) {
            case "De PesosMx a Dólares":
                monedas.ConvertirPesosMxDolares(valor); 
                break;

            case "De PesosMx a Euros":
                monedas.ConvertirPesosMxEuros(valor);
                break;

            case "De PesosMx a Libras Esterlinas":
                monedas.ConvertirPesosMxLibra(valor);
                break;

            case "De PesosMx a Yen Japonés":
                monedas.ConvertirPesosmxYen(valor);
                break;

            case "De PesosMx a Won sur-coreano":
                monedas.ConvertirPesosMxWon(valor);
                break;

            case "De Dólares a PesosMx":
                monedas.ConvertirDolaresPesosMx(valor);
                break;

            case "De Euros a PesosMx":
                monedas.ConvertirEurosPesosMx(valor);
                break;

            case "De Libras Esterlinas a PesosMx":
                monedas.ConvertirLibraPesosMx(valor);
                break;

            case "De Yen Japonés a PesosMx":
                monedas.ConvertirYenPesosMx(valor);
                break;

            case "De Won sur-coreano a PesosMx":
                monedas.ConvertirWonPesosMx(valor);
                break;
        }
    }

}
