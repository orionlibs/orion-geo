package io.github.orionlibs.orion_geo.address;

import io.github.orionlibs.orion_string.StringsService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class OrionAddress
{
    private String houseNumber;
    private String houseName;
    private String houseAddressLine1;
    private String houseAddressLine2;
    private String city;
    private String county;
    private String postcode;
    private String countryCodeAlpha2;
    private String country;


    public String formatIn1LineWithoutCountry()
    {
        StringBuilder fullAddress = new StringBuilder();
        if(getHouseName() != null && !getHouseName().isEmpty())
        {
            fullAddress.append(getHouseName());
            fullAddress.append(", ");
        }
        if(getHouseNumber() != null && !getHouseNumber().isEmpty())
        {
            fullAddress.append(getHouseNumber());
            fullAddress.append(", ");
        }
        if(getHouseAddressLine1() != null && !getHouseAddressLine1().isEmpty())
        {
            fullAddress.append(getHouseAddressLine1());
            fullAddress.append(", ");
        }
        if(getHouseAddressLine2() != null && !getHouseAddressLine2().isEmpty())
        {
            fullAddress.append(getHouseAddressLine2());
            fullAddress.append(", ");
        }
        if(getCity() != null && !getCity().isEmpty())
        {
            fullAddress.append(getCity());
            fullAddress.append(", ");
        }
        if(getPostcode() != null && !getPostcode().isEmpty())
        {
            fullAddress.append(getPostcode());
        }
        return fullAddress.toString();
    }


    public String formatIn1Line()
    {
        StringBuilder fullAddress = new StringBuilder();
        if(getHouseName() != null && !getHouseName().isEmpty())
        {
            fullAddress.append(getHouseName());
            fullAddress.append(", ");
        }
        if(getHouseNumber() != null && !getHouseNumber().isEmpty())
        {
            fullAddress.append(getHouseNumber());
            fullAddress.append(", ");
        }
        if(getHouseAddressLine1() != null && !getHouseAddressLine1().isEmpty())
        {
            fullAddress.append(getHouseAddressLine1());
            fullAddress.append(", ");
        }
        if(getHouseAddressLine2() != null && !getHouseAddressLine2().isEmpty())
        {
            fullAddress.append(getHouseAddressLine2());
            fullAddress.append(", ");
        }
        if(getCity() != null && !getCity().isEmpty())
        {
            fullAddress.append(getCity());
            fullAddress.append(", ");
        }
        if(getCounty() != null && !getCounty().isEmpty())
        {
            fullAddress.append(getCounty());
            fullAddress.append(", ");
        }
        if(getPostcode() != null && !getPostcode().isEmpty())
        {
            fullAddress.append(getPostcode());
            fullAddress.append(", ");
        }
        if(getCountry() != null && !getCountry().isEmpty())
        {
            if("United Kingdom of Great Britain and Northern Ireland".equals(getCountry()))
            {
                fullAddress.append("U.K.");
            }
            else
            {
                fullAddress.append(getCountry());
            }
        }
        return StringsService.deleteCharacterFromTheEnd(fullAddress, ", ").toString();
    }


    public String formatIn1LineWithoutPostcodeOrCountry()
    {
        StringBuilder fullAddress = new StringBuilder();
        if(getHouseName() != null && !getHouseName().isEmpty())
        {
            fullAddress.append(getHouseName());
            fullAddress.append(", ");
        }
        if(getHouseNumber() != null && !getHouseNumber().isEmpty())
        {
            fullAddress.append(getHouseNumber());
            fullAddress.append(", ");
        }
        if(getHouseAddressLine1() != null && !getHouseAddressLine1().isEmpty())
        {
            fullAddress.append(getHouseAddressLine1());
            fullAddress.append(", ");
        }
        if(getHouseAddressLine2() != null && !getHouseAddressLine2().isEmpty())
        {
            fullAddress.append(getHouseAddressLine2());
        }
        return StringsService.deleteCharacterFromTheEnd(fullAddress, ", ").toString();
    }
}