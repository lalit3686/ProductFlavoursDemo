package demo.flavour.product.app.com.productflavoursdemo;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_hello_world = (TextView) findViewById(R.id.txt_hello_world);
        txt_hello_world.setText(R.string.hello_world_0 + Constants.SELECTED_LANGUAGE);

        Toast.makeText(this, "selected language - "+ Constants.SELECTED_LANGUAGE, Toast.LENGTH_LONG).show();

    }
}
