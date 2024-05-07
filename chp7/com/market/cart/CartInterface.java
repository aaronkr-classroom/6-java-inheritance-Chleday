package com.market.cart;

import com.market.bookitem.Book;

public interface CartInterface {
	void printBookList(Book[] p);
	boolean isCartInBook(String id);
	void insertBook(String id);
	void removeCart(int numId);
	void deleteBook();
}
