package fruitbasket;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import navigation.Navigation;
import navigation.NavigationUtil;

@Named
@ViewScoped
public class FruitBean extends AbstractFruit  {

	private static final long serialVersionUID = -5431067889768439768L;
	
	private String welcomeToBasket;
	
	
	
	@PostConstruct
	public void init(){
		this.welcomeToBasket = "Welcome to your Fruit-Basket";
	}

	public String getWelcomeToBasket() {
		return welcomeToBasket;
	}

	public void setWelcomeToBasket(String welcomeToBasket) {
		this.welcomeToBasket = welcomeToBasket;
	}

}
