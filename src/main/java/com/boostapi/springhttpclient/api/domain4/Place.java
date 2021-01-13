
package com.boostapi.springhttpclient.api.domain4;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
public class Place implements Serializable
{

    public String placeName;
    public String longitude;
    public String state;
    public String stateAbbreviation;
    public String latitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4499785044086136447L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
