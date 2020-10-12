package com.laribi.easycots.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;

/**
 * Component status 
 */
@Entity
@Table(name = "ComponentStatus")
public enum ComponentStatus {
    AVAILABLE("Available"),
    NO_MORE_MAINTAINED("No more maintained"),
    UNDER_POLITIC_ISSUE("Under Politic Issue"),
    UNDER_DEROGATION("Under Derogation");

  @Column(name="value", insertable = false, updatable = false)
  private String value;
  
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name = "id", unique = true, nullable = false)
  long id;

  ComponentStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ComponentStatus fromValue(String text) {
    for (ComponentStatus b : ComponentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public long getId() {
    return id;
  }

}
