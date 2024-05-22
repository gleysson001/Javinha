import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendar {

    private int id;
    private String servico;
    private Date data;

    public Agendar(int id, String servico, Date data) {
        this.id = id;
        this.servico = servico;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy  HH:mm").parse(String.valueOf(data));
                }catch (ParseException ex){
            Logger.getLogger(Agendar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
