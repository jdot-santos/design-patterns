package com.jsantos.structuralpatterns.compositepattern.mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * This examples creates and builds a list of person attributes and group attributes, and combines them all in one to represent our security attributes map by utilizing the putAll method.
 * The putAll method treats each map as a composite of the previous one, so it treats the individual object the same way.
 *
 * Created by James Santos.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> personAttributes = getPersonAttributes();
        Map<String, String> groupAttributes = getGroupAttributes();

        Map<String, String> secAttributes = new HashMap<>();
        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);
    }

    private static Map<String, String> getGroupAttributes() {
        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");
        return groupAttributes;
    }

    private static Map<String, String> getPersonAttributes() {
        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");
        return personAttributes;
    }
}
