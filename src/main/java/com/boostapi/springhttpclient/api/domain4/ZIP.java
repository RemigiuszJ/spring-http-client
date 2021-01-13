
package com.boostapi.springhttpclient.api.domain4;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Getter
@Setter

public class ZIP implements Serializable
{

    public String postCode;
    public String country;
    public String countryAbbreviation;
    public List<Place> places = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2722017563193357628L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
