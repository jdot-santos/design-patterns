package com.jsantos.behavioralpatterns.memento.serialize;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * The Originator
 * To implement Serializable, simply add the <b>implements</b>
 */
@Getter
@Setter
@ToString
public class Employee implements Serializable {

    private String name;
    private String address;
    private String phone;

}
