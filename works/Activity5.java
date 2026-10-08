package activity5;
import java.util.Scanner;
class RestaurantStaff{
void performDuty(){
System.out.println("Restaurant staff performs their duty");
}
void takeRest(){
System.out.println("Restaurant staff takes a rest");
}
void getShiftSchedule(){
System.out.println("Staff works on rotating shifts");
}}

class HeadChef extends RestaurantStaff{
void performDuty(){
 System.out.println("Head Chef oversees all kitchen operations and creates new recipes");
} 
void takeRest(){
 System.out.println("Head Chef takes a break after the lunch rush hour");
} 
void getShiftSchedule(){
 System.out.println("Head Chef works from 8:00 AM to 5:00 PM");
}
void planMenu(){
 System.out.println("Head Chef plans the weekly special menu");
}}

class LineCook extends RestaurantStaff{
void performDuty(){
System.out.println("Line Cook prepares ingredients and cooks dishes according to recipes");
}   
void takeRest(){
System.out.println("Line Cook grabs a quick snack during the 15-minute break");
}
void getShiftSchedule(){
System.out.println("Line Cook works the morning shift from 6:00 AM to 2:00 PM");
}
void prepareMiseEnPlace(){
System.out.println("Line Cook organizes all ingredients before service");
}}

class PastryChef extends RestaurantStaff{
void performDuty(){
System.out.println("Pastry Chef creates delicious desserts and baked goods");
}   
void takeRest(){
System.out.println("Pastry Chef enjoys tasting new dessert creations during break");
}
void getShiftSchedule(){
System.out.println("Pastry Chef works the bakery shift from 4:00 AM to 12:00 PM");
}
void decorateCake(){
System.out.println("Pastry Chef decorates a beautiful three-tier wedding cake");
}}

class Dishwasher extends RestaurantStaff{
void performDuty(){
System.out.println("Dishwasher cleans all dishes, pots, and pans efficiently");
}   
void takeRest(){
System.out.println("Dishwasher rests while the dishwasher machine runs");
}
void getShiftSchedule(){
System.out.println("Dishwasher works the closing shift from 4:00 PM to 11:00 PM");
}
void organizeKitchen(){
System.out.println("Dishwasher organizes all clean utensils in the kitchen");
}}

class Bartender extends RestaurantStaff{
void performDuty(){
System.out.println("Bartender mixes cocktails and serves drinks at the bar");
}   
void takeRest(){
System.out.println("Bartender practices new mixology techniques during breaks");
}
void getShiftSchedule(){
System.out.println("Bartender works the night shift from 6:00 PM to 2:00 AM");
}
void shakeCocktail(){
System.out.println("Bartender shakes a signature margarita cocktail");
}}

class FoodRunner extends RestaurantStaff{
void performDuty(){
System.out.println("Food Runner delivers hot dishes from kitchen to customers' tables");
}   
void takeRest(){
System.out.println("Food Runner hydrates after running multiple orders");
}
void getShiftSchedule(){
System.out.println("Food Runner works the weekend shift from 10:00 AM to 8:00 PM");
}
void clearTables(){
System.out.println("Food Runner clears and resets tables for new customers");
}}
        
public class Activity5 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Choose your restaurant role headchef/linecook/pastrychef/dishwashe/bartender/foodrunner:"); 
    String Choice = input.nextLine();
    RestaurantStaff restaurantstaff;
    if (Choice.equalsIgnoreCase("Headchef")){
        restaurantstaff = new HeadChef();
        restaurantstaff = new LineCook();
        restaurantstaff = new PastryChef();
        restaurantstaff = new Dishwasher();
        restaurantstaff = new Bartender();
        restaurantstaff = new FoodRunner();
        ((HeadChef)restaurantstaff).planMenu();
    }else if (Choice.equalsIgnoreCase("LineCook")){
        restaurantstaff = new HeadChef();
        restaurantstaff = new LineCook();
        restaurantstaff = new PastryChef();
        restaurantstaff = new Dishwasher();
        restaurantstaff = new Bartender();
        restaurantstaff = new FoodRunner();
        ((LineCook)restaurantstaff).prepareMiseEnPlace();
    }else if (Choice.equalsIgnoreCase("PastryChef")){
        restaurantstaff = new HeadChef();
        restaurantstaff = new LineCook();
        restaurantstaff = new PastryChef();
        restaurantstaff = new Dishwasher();
        restaurantstaff = new Bartender();
        restaurantstaff = new FoodRunner();
        ((PastryChef)restaurantstaff).decorateCake();
    }else if (Choice.equalsIgnoreCase("Dishwasher")){
        restaurantstaff = new HeadChef();
        restaurantstaff = new LineCook();
        restaurantstaff = new PastryChef();
        restaurantstaff = new Dishwasher();
        restaurantstaff = new Bartender();
        restaurantstaff = new FoodRunner();
        ((Dishwasher)restaurantstaff).organizeKitchen();
    }else if (Choice.equalsIgnoreCase("Bartender")){
        restaurantstaff = new HeadChef();
        restaurantstaff = new LineCook();
        restaurantstaff = new PastryChef();
        restaurantstaff = new Dishwasher();
        restaurantstaff = new Bartender();
        restaurantstaff = new FoodRunner();
        ((Bartender)restaurantstaff).shakeCocktail();
    }else if (Choice.equalsIgnoreCase("FoodRunner")){
        restaurantstaff = new HeadChef();
        restaurantstaff = new LineCook();
        restaurantstaff = new PastryChef();
        restaurantstaff = new Dishwasher();
        restaurantstaff = new Bartender();
        restaurantstaff = new FoodRunner();
        ((FoodRunner)restaurantstaff).clearTables();
    }else{
           System.out.println("Invalid Choice");
           input.close();
       }}}
       
       
               
       
       
    
    
    
    
    
    
    
