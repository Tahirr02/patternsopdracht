import com.company.Persoon;
import org.json.JSONObject;
public class Werknemer extends Persoon {

    private Maandsalaris maandsalaris;



    public Werknemer(String jsonString) {
        JSONObject jsonObject = new JSONObject(jsonString);
        this.naam = jsonObject.getString("Name");
        this.adres = jsonObject.getString("Adres");
        this.maandsalaris = new Maandsalaris(jsonObject.getString("Maand"), jsonObject.getDouble("Uurloon"), jsonObject.getDouble("Uren"));


    }

    



    public Maandsalaris getMaandsalaris(){
        return this.maandsalaris;
    }

}