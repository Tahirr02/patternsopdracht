import org.json.JSONObject;

import java.util.ArrayList;

public class Werknemer extends Persoon implements IWerknemer{

    ArrayList<Maandsalaris> maandsalarissen = new ArrayList<Maandsalaris>();





    public Werknemer(String jsonString) {
        JSONObject jsonObject = new JSONObject(jsonString);
        this.naam = jsonObject.getString("Name");
        this.adres = jsonObject.getString("Adres");
        this.maandsalarissen.add(new Maandsalaris(jsonObject.getString("Maand"), jsonObject.getDouble("Uurloon"), jsonObject.getDouble("Uren")));



    }



    



    public Maandsalaris getLaatsteMaandsalaris(){

        return this.maandsalarissen.get(this.maandsalarissen.size()- 1);
    }

}