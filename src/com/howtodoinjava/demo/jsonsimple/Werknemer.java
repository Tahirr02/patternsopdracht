//import org.json.JSONObject;

import org.json.simple.JSONObject;


public class Werknemer {
    JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");

    JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);
    private Maandsalaris maandsalaris;
    private String naam;
    private double uurloon;


    public Werknemer(String jsonString) {
        JSONObject jsonObject = new JSONObject (jsonString);
        this.naam = jsonObject.getString("Naam");
         this.maandsalaris = new Maandsalaris(jsonObject.getString("Uren"), jsonObject.getString("Uurloon"), jsonObject.getString("Maand"));
        this.uurloon = jsonObject.getString("Uurloon");
        this.uurloon = 7.50;
        this.naam = "Sevim Balcik";
        this.maandsalaris = new Maandsalaris("Februari", this.uurloon, 40);


    }

    public double getUurloon(){
        return this.uurloon;
    }

    public String getNaam(){
        return this.naam;
    }

    public Maandsalaris getMaandsalaris(){
        return this.maandsalaris;
    }
}
