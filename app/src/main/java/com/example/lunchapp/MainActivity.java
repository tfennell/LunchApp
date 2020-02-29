package com.example.lunchapp;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ButtonItem> names = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names.add(new ButtonItem("Waffles", R.drawable.waffle));
        names.add(new ButtonItem("Pancakes", R.drawable.pancakes));
    }

    public void Pancakes(View view){
            Intent intent = new Intent(MainActivity.this, Pancakes.class);
            startActivity(intent);
        }
    public void Waffles(View view){
        Intent intent = new Intent(MainActivity.this, Waffles.class);
        startActivity(intent);
    }

}

