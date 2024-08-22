package io.github.orionlibs.orion_geo.address;

public class UserAddressService
{
    public static boolean isValidAddress(OrionAddress address)
    {
        return UserAddressBO.of(address).isValidAddress();
    }


    public static boolean isInvalidAddress(OrionAddress address)
    {
        return !isValidAddress(address);
    }


    public static boolean isValidHouseNumber(OrionAddress address)
    {
        return UserAddressBO.of(address).isValidHouseNumber();
    }


    public static boolean isInvalidHouseNumber(OrionAddress address)
    {
        return !isValidHouseNumber(address);
    }


    public static boolean isValidHouseAddressLines(OrionAddress address)
    {
        return UserAddressBO.of(address).isValidHouseAddressLines();
    }


    public static boolean isInvalidHouseAddressLines(OrionAddress address)
    {
        return !isValidHouseAddressLines(address);
    }


    public static boolean isValidPostcode(OrionAddress address)
    {
        return PostcodeBO.of(address.getPostcode()).isValidPostcode();
    }


    public static boolean isInvalidPostcode(OrionAddress address)
    {
        return !isValidPostcode(address);
    }


    public static void normaliseAddress(OrionAddress address)
    {
        UserAddressBO.of(address).normaliseAddress();
    }


    public static boolean isValidPostcode(String postcode, String postcodePattern)
    {
        return PostcodeBO.of(postcode).isValidPostcode(postcodePattern);
    }


    public static String getPostcodePrefix(String postcode)
    {
        return PostcodeBO.of(postcode).getPostcodePrefix();
    }


    public static String getPostcodePrefixWithoutUsingGoogleMaps(String postcode)
    {
        return PostcodeBO.of().getPostcodePrefixWithoutUsingGoogleMaps(postcode);
    }


    public static String minifyUKCountryName(String countryName)
    {
        if(countryName != null && "United Kingdom of Great Britain and Northern Ireland".equals(countryName))
        {
            return "U.K.";
        }
        else
        {
            return countryName;
        }
    }
}