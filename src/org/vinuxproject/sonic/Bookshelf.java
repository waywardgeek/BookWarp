package org.vinuxproject.sonic;

import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.util.ArrayList;

import org.vinuxproject.bookwarp.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class Bookshelf extends Activity {

	private ArrayList<Book> books;
	
	private void loadBooks()
	{
//		try {
	        File BookWarpDir = new File(Environment.getExternalStorageDirectory() + "/BookWarp");
	        File bookDirs[] = BookWarpDir.listFiles();
	        for (File file : bookDirs) {
	        	if(file.isDirectory()) {
	        		File indexFile = new File(file, "index");
	        		if(indexFile.canRead()) {
	        		    Book book = new Book(indexFile);
	        		    books.add(book);
	        		}
	        	}
            }
//	    } catch (IOException e) {
//			e.printStackTrace();
//			return;
//		}
	}

	private void listBooks()
	{
        for(Book book : books) {
        	
        }
	}
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadBooks();
        listBooks();
        setContentView(R.layout.bookshelf);
    }

}
