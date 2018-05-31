// Application designed by James Mariano and Olis ______

package edu.drexel.jam829.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

// Eventful API
import com.evdb.javaapi;
import com.evdb.javaapi.data;
import com.evdb.javaapi.data.request;
import com.evdb.javaapi.data.response;
import com.evdb.javaapi.network;
import com.evdb.javaapi.operations;
import com.evdb.javaapi.util;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView listEvents;
    private String baseURL = "http://eventful.com/events?q=music&l=San+Diego";
    private String apiKey = "jnxLt6gNg8kx2BNQ";
    public static void setApiKey(java.lang.String apiKey);
    public static String setBaseURL(java.lang.String baseURL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
