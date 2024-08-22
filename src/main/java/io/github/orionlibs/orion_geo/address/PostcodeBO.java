package io.github.orionlibs.orion_geo.address;

import java.util.regex.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

// @NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
//@Setter
public class PostcodeBO
{
    private String postcode;
    private String formattedPostcode;


    public static PostcodeBO of()
    {
        return PostcodeBO.builder().build();
    }


    public static PostcodeBO of(String postcode)
    {
        return PostcodeBO.builder().postcode(postcode).build();
    }


    public boolean isValidPostcode()
    {
        return postcode != null && !postcode.isEmpty();
    }


    public String getPostcodePrefixWithoutUsingGoogleMaps(String postcodeToCheck)
    {
        String[] tokens = postcodeToCheck.split("\\s+");
        if(tokens != null && tokens.length > 0)
        {
            return tokens[0];
        }
        else
        {
            return null;
        }
    }


    public boolean isValidPostcode(String postcodePattern)
    {
        return Pattern.compile(postcodePattern).matcher(postcode).matches();
    }
}