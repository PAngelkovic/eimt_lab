package mk.ukim.finki.emt.service.impl;

import mk.ukim.finki.emt.model.exceptions.CategoryInUseException;
import mk.ukim.finki.emt.model.jpa.Book;
import mk.ukim.finki.emt.model.jpa.BookPicture;
import mk.ukim.finki.emt.model.jpa.Category;
import mk.ukim.finki.emt.model.jpa.DeliveryPackage;
import mk.ukim.finki.emt.service.StoreManagementService;
import org.springframework.stereotype.Service;

/**
 * @author Riste Stojanov
 */
@Service
public class StoreManagementServiceImpl implements StoreManagementService {

  @Override
  public Category createTopLevelCategory(String name) {
    return null;
  }

  @Override
  public Category createCategory(String name, Long parentId) {
    return null;
  }

  @Override
  public void updateCategoryName(Long id, String newName) {

  }

  @Override
  public void changeCategoryParent(Long id, Long parentId) {

  }

  @Override
  public void removeCategory(Long id) throws CategoryInUseException {

  }

  @Override
  public Book createBook(String name, Long categoryId, String[] authors, String isbn, Double price) {
    return null;
  }

  @Override
  public Book updateBook(Long bookId, String name, String[] authors, String isbn) {
    return null;
  }

  @Override
  public Book updateBookPrice(Long bookId, Double price) {
    return null;
  }

  @Override
  public Book updateBookCategory(Long bookId, Long newCategoryId) {
    return null;
  }

  @Override
  public void addBooksInStock(Long bookId, int quantity) {

  }

  @Override
  public void donateBooks(Long bookId, int quantity) {

  }

  @Override
  public void clearCart(Long cartId) {

  }

  @Override
  public void markInvoiceAsExpired(Long invoiceId) {

  }

  @Override
  public DeliveryPackage markInvoiceAsPayed(Long invoiceId) {
    return null;
  }

  @Override
  public void preparedDelivery(Long deliverId) {

  }

  @Override
  public void shippedDelivery(Long deliveryId) {

  }

  @Override
  public void closeDeliveryWithoutConfirmation(Long deliveryId) {

  }

  @Override
  public BookPicture addBookPicture(Long bookId, byte[] bytes, String contentType) {
    return null;
  }
}
