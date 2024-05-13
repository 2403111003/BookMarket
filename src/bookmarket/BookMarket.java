package bookmarket;

import bookmarket.controller.BookMarketController;
import bookmarket.model.BookStorage;
import bookmarket.model.Cart;
import bookmarket.view.ConsoleView;

public class BookMarket {
	public static void main(String[] args) {
		BookStorage bookStorage = new BookStorage();
		Cart cart = new Cart();
		ConsoleView view = new ConsoleView();
		BookMarketController controller = new BookMarketController(bookStorage, cart, view);
		
		controller.start();
	}

}
