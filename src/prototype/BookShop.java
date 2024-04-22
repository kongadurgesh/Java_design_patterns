package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopId;
    private List<Book> books = new ArrayList<>();

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        for (int i = 0; i < 10; i++) {
            Book book = new Book("Book" + i, i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop [shopId=" + shopId + ", books=" + books + "]";
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();

        for (Book book : this.getBooks()) {
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }

}
