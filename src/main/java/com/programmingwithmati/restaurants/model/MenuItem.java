package com.programmingwithmati.restaurants.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity(name = "menu_item")
public class MenuItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private BigDecimal price;

  @Column(name = "restaurant_id")
  private Long restaurantId;

  public MenuItem() {
  }

  public MenuItem(Long id, String name, String description, BigDecimal price, Long restaurantId) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.restaurantId = restaurantId;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Long restaurantId) {
    this.restaurantId = restaurantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuItem menuItem = (MenuItem) o;
    return Objects.equals(id, menuItem.id) && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(price, menuItem.price) && Objects.equals(restaurantId, menuItem.restaurantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, price, restaurantId);
  }
}
