package co.Qualitrix.api.bcd_service.request;

import com.google.gson.Gson;

public class pojoClass {
    /*
     * This class will contains all our pojo class details
     * */

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this, co.Qualitrix.api.abc_service.request.pojoClass.class);

    }
}

