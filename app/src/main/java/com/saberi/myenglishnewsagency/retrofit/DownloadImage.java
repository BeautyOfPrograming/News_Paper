package com.saberi.myenglishnewsagency.retrofit;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImage extends AsyncTask<Void,Void, Bitmap> {

    String innerImageURl;
    public DownloadImage(String imagURl){
        this.innerImageURl = imagURl;
        Log.e("urLContent",innerImageURl+"");
    }

    @Override
    protected Bitmap doInBackground(Void... Params) {


        Bitmap myBitmap=null;
        try {
            URL url = new URL(innerImageURl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;


        } catch (IOException e) {
            // Log exception
        }
        return myBitmap;


    }
}
