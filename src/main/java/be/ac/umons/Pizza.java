package be.ac.umons;
import java.util.ArrayList;
import java.math.BigDecimal;
public class Pizza implements PizzaComponent{
    private String name;
    private BigDecimal price = new BigDecimal (0.0);
    private ArrayList<Ingredient>listIngredients;
    Pizza (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setPrice(BigDecimal p){
        this.price=p;
    }
    public ArrayList<Ingredient>getListIngredient(){
        return listIngredients;
    }
    public void addIngredient(Ingredient i){
        listIngredients.add(i);
    }
    public String toString(){
        return name;
    }

}
