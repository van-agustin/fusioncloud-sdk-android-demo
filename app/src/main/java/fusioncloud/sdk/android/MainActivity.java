package fusioncloud.sdk.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.posonandroidva.R;

public class MainActivity extends AppCompatActivity {

    private Button btnProducts;
    private Button btnCart;
    private Button btnSatellite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                
        btnProducts = (Button) findViewById(R.id.btnProducts);
        btnProducts.setOnClickListener(v -> openActivityProducts());
        btnProducts.setEnabled(Settings.btnProductsEnabled);

        btnCart = (Button) findViewById(R.id.btnCart);
        btnCart.setOnClickListener(v -> openActivityCart());

        btnSatellite = (Button) findViewById(R.id.btnSatellite);
        btnSatellite.setOnClickListener(v -> openActivitySattelite());
    }
    public void openActivityProducts() {
        Intent intent = new Intent(this, ActivityProducts.class);
        startActivity(intent);
    }

    public void openActivityCart() {
        Intent intent = new Intent(this, ActivityCart.class);
        startActivity(intent);
    }

    public void openActivitySattelite() {
        Intent intent = new Intent(this, ActivitySatellite.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.back, menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}