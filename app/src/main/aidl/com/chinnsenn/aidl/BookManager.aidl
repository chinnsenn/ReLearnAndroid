// BookManager.aidl
package com.chinnsenn.aidl;

import com.chinnsenn.aidl.Book;
// Declare any non-default types here with import statements

interface BookManager {
    List<Book> getBookList();
    void addBook(in Book book);
}
