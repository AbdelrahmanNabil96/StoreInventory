package com.example.abdu.bookstoreinventory;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class BookContract {

    private BookContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.example.abdu.bookstoreinventory";
    public static final String PATH_BOOKS = "books";


    public static final class BookEntry implements BaseColumns {
        public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_BOOKS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;
        public final static String TABLE_NAME = "books";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_BOOK_NAME = "name";
        public final static String COLUMN_BOOK_PRICE = "price";
        public final static String COLUMN_BOOK_QUANTITY = "quantity";
        public final static String COLUMN_BOOK_SUPPLIER = "supplier";
        public final static String COLUMN_SUPPLIER_NUMBER = "supplier_number";

    }

}

