package io.github.orionlibs.orion_geo.address;

import io.github.orionlibs.orion_assert.Assert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

// @NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
//@Setter
public class UserAddressBO
{
    private OrionAddress address;


    public static UserAddressBO of(OrionAddress address)
    {
        return UserAddressBO.builder().address(address).build();
    }


    public boolean isValidAddress()
    {
        Assert.notNull(address, "The given address cannot be null.");
        return ((address.getHouseAddressLine1() != null && !address.getHouseAddressLine1().isEmpty())
                        || (address.getHouseAddressLine2() != null && !address.getHouseAddressLine2().isEmpty()))
                        && address.getPostcode() != null && !address.getPostcode().isEmpty();
    }


    public boolean isValidHouseNumber()
    {
        return address.getHouseNumber() != null && !address.getHouseNumber().isEmpty();
    }


    public boolean isValidHouseAddressLines()
    {
        return (address.getHouseAddressLine1() != null && !address.getHouseAddressLine1().isEmpty())
                        || (address.getHouseAddressLine2() != null && !address.getHouseAddressLine2().isEmpty());
    }


    public void normaliseAddress()
    {
        Assert.notNull(address, "The given address cannot be null.");
        if(address.getHouseNumber() != null && !address.getHouseNumber().isEmpty())
        {
            address.setHouseNumber(address.getHouseNumber().trim());
        }
        if((address.getHouseAddressLine1() == null || address.getHouseAddressLine1().isEmpty())
                        && address.getHouseAddressLine2() != null && !address.getHouseAddressLine2().isEmpty())
        {
            address.setHouseAddressLine1(address.getHouseAddressLine2());
            address.setHouseAddressLine2(null);
        }
        if(address.getHouseAddressLine1() != null && !address.getHouseAddressLine1().isEmpty())
        {
            address.setHouseAddressLine1(address.getHouseAddressLine1().trim());
        }
        if(address.getHouseAddressLine2() != null && !address.getHouseAddressLine2().isEmpty())
        {
            address.setHouseAddressLine2(address.getHouseAddressLine2().trim());
        }
        if(address.getCounty() != null && !address.getCounty().isEmpty())
        {
            address.setCounty(address.getCounty().trim());
        }
        if(address.getCity() != null && !address.getCity().isEmpty())
        {
            address.setCity(address.getCity().trim());
        }
        address.setPostcode(address.getPostcode().trim());
        address.setCountryCodeAlpha2(address.getCountryCodeAlpha2().trim().toUpperCase());
        address.setCountry(address.getCountry().trim());
    }
}