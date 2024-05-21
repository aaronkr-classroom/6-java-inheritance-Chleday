package com.market.cart;

import java.util.ArrayList;
import com.market.bookitem.Book;

public interface CartInterface {
	void printBookList(ArrayList<Book> p);
	boolean isCartInBook(String id);
	void insertBook(String id);
	void removeCart(int numId);
	void deleteBook();
}
