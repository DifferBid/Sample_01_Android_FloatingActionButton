
package develop.differ.bid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityFloatingActionButton extends AppCompatActivity {

    private DrawerLayout  drawerLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        drawerLayout = findViewById(R.id.drawer_layout);

        FloatingActionButton floatingActionButton_01 = findViewById(R.id.floatingActionButton_01);
        FloatingActionButton floatingActionButton_02 = findViewById(R.id.floatingActionButton_02);
        FloatingActionButton floatingActionButton_03 = findViewById(R.id.floatingActionButton_03);
        FloatingActionButton floatingActionButton_05 = findViewById(R.id.floatingActionButton_05);

        floatingActionButton_01.setOnClickListener(view -> {
            Toast.makeText(this, "floatingActionButton_01 " , Toast.LENGTH_LONG).show();
        });

        floatingActionButton_02.setOnClickListener(view -> {
            Toast.makeText(this, "floatingActionButton_02 " , Toast.LENGTH_LONG).show();
        });

        floatingActionButton_03.setOnClickListener(view -> {
            Toast.makeText(this, "floatingActionButton_03 " , Toast.LENGTH_LONG).show();
        });

        floatingActionButton_05.setOnClickListener(view -> {
            Toast.makeText(this, "floatingActionButton_05 " , Toast.LENGTH_LONG).show();
        });

        Button button_01 = findViewById(R.id.button_01);
        button_01.setOnClickListener(view -> {
            Toast.makeText(this, "button_01 " , Toast.LENGTH_LONG).show();
        });

    }

    // Метод для кнопки бутерброд
    public void openDrawer(View view) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
}
