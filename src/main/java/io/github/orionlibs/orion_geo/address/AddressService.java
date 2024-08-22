package io.github.orionlibs.orion_geo.address;

import io.github.orionlibs.orion_reflection.object.ReflectionObjectsService;

public class AddressService
{
    public static String formatIn1Line(Object address)
    {
        return ReflectionObjectsService.copyFields(address, new OrionAddress()).formatIn1Line();
    }


    public static String formatIn1LineWithoutCountry(Object address)
    {
        if(address != null)
        {
            return ReflectionObjectsService.copyFields(address, new OrionAddress()).formatIn1LineWithoutCountry();
        }
        else
        {
            return "";
        }
    }


    public static String formatIn1LineWithoutPostcodeOrCountry(Object address)
    {
        return ReflectionObjectsService.copyFields(address, new OrionAddress()).formatIn1LineWithoutPostcodeOrCountry();
    }
}