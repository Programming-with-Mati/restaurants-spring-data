package com.programmingwithmati.restaurants;

import com.programmingwithmati.restaurants.model.MenuItem;
import com.programmingwithmati.restaurants.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {

  private final RestaurantRepository restaurantRepository;

  @Autowired
  public RestaurantController(RestaurantRepository restaurantRepository) {
    this.restaurantRepository = restaurantRepository;
  }

  @GetMapping("/{id}")
  public String viewRestaurant(@PathVariable("id")Long id, Model model) {
    var restaurant = restaurantRepository.findById(id).orElseThrow();
    model.addAttribute("restaurant", restaurant);
    return "restaurant-view";
  }

  @GetMapping("/create")
  public String viewCreateRestaurant(Model model) {
    model.addAttribute("restaurant", new Restaurant());
    return "create-restaurant-view";
  }

  @PostMapping("/save")
  public String saveRestaurant(@ModelAttribute Restaurant restaurant, Model model) {
    var savedRestaurant = restaurantRepository.save(restaurant);
    model.addAttribute("restaurant", savedRestaurant);
    return "restaurant-view";
  }

  @GetMapping("/{id}/create-menu-item")
  public String viewCreateMenuItem(@PathVariable("id") Long id, Model model) {
    var menuItem = new MenuItem();
    menuItem.setRestaurantId(id);
    model.addAttribute("menuItem", menuItem);
    return "create-menu-item-view";
  }

  @PostMapping("/menu-item/save")
  public String saveMenuItem(@ModelAttribute MenuItem menuItem, Model model) {
    var restaurant = restaurantRepository.findById(menuItem.getRestaurantId()).orElseThrow();
    restaurant.getMenuItems().add(menuItem);
    restaurant = restaurantRepository.save(restaurant);
    model.addAttribute("restaurant", restaurant);
    return "restaurant-view";
  }
}
