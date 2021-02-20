package Conexao;

import java.util.Calendar;
public class Hora {
    public String getHora(){

String hora=(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"/"+Calendar.getInstance().get(Calendar.MONTH)+"/"+Calendar.getInstance().get(Calendar.YEAR)+" - "+Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+":"+Calendar.getInstance().get(Calendar.MINUTE));
    
    return hora;
    }
}
