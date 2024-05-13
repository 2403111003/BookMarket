package bookmarket.model;

public class Cart {
	CartItem[] itemList = new CartItem[64];
	int numItems = 0;
	public boolean isEmpty() {
		return numItems == 0;
	}

	public CartItem[] getItemList() {
		return itemList;
	}

	public void setItemList(CartItem[] itemList) {
		this.itemList = itemList;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public String getItemInfo(int index) {
		return itemList[index].toString();
	}
	public void addItem(Book book) {
		CartItem item = getCartItem(book);
			if(item == null) {
				itemList[numItems++] = new CartItem(book);
			}else {
				item.addQuantity(1);
		    }
	}

	private CartItem getCartItem(Book book) {
	      for(int i = 0; i < numItems; i++) {
	          if(itemList[i].getBook() == book) {
	             return itemList[i];
	          }
	       }
		return null;
	}
}
