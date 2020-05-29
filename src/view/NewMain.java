/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import model.Words;

	
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Daniel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, JSONException {
//        String path = "E:\\word.json";
//        //BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//    
//        JSONArray array = realizarPeticion();
//        for (int i = 0; i < array.length(); i++) {
//            JSONObject object = array.getJSONObject(i);
//            object.getString("word");
//            Gson gson = new Gson();
//            Words w = gson.fromJson(object.toString(), Words.class);
//            //modeloLista.addElement(p);
//            System.out.println(w);
//        }
//    }
//    
//public static JSONArray realizarPeticion() throws IOException, JSONException {
//        JSONArray array = null;
// 
//        //String url = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
//        String path = "E:\\word.json";
//       // URL obj = new URL(url);
//       // HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//        //BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
//        BufferedReader in = new BufferedReader(new FileReader(path));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//        System.out.println(response.toString());
//        JSONObject myResponse = new JSONObject(response.toString());
//        array = myResponse.getJSONArray("results");
//        return array;
    }
}