package com.example.drapp.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drapp.R;
import com.example.drapp.model.Photo;
import com.example.drapp.presenter.Presenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Presenter presenter = new Presenter(MainActivity.this);
        presenter.getAllPhotos();
    }

    @Override
    public void getPhotos(List<Photo> photos) {
        for (Photo photo : photos) {
            Log.i("RETROFIT", photo.getId() + "\n"
                    + " - Alpha2:  " + photo.getCamera().getFullName() + " \n"
                    + " - Alpha2:  " + photo.getCamera().getName() + " \n"
                    + " - Alpha2:  " + photo.getCamera().getRoverId() + " \n"
                    + " - Alpha2:  " + photo.getRover().getName() + " \n"
                    + " - Alpha3: " + photo.getEarthDate());
        }
    }
}
