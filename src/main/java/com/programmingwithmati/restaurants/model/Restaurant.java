package com.programmingwithmati.restaurants.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity(name = "restaurant")
public class Restaurant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;

  @OneToMany(
          fetch = FetchType.EAGER,
          targetEntity = MenuItem.class,
          cascade = CascadeType.ALL
  )
  @JoinColumn(name = "restaurant_id")
  private List<MenuItem> menuItems;

  public Restaurant() {
  }

  public Restaurant(Long id, String name, String email, List<MenuItem> menuItems) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.menuItems = menuItems;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Restaurant that = (Restaurant) o;
    return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(menuItems, that.menuItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, menuItems);
  }
}
