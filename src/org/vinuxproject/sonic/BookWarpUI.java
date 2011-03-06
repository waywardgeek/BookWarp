package org.vinuxproject.sonic;

//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;

import org.vinuxproject.bookwarp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookWarpUI extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void switchToBookshelf(View v) {
    	Intent myIntent = new Intent(BookWarpUI.this, Bookshelf.class);
    	BookWarpUI.this.startActivity(myIntent);
    }
    
    public void switchToContents(View v) {
    }

    public void previousChapter(View v) {
    }

    
    public void backward(View v) {
    }

    public void playPause(View v) {
    }

    public void forward(View v) {
    }

    public void nextChapter(View v) {
    }
}