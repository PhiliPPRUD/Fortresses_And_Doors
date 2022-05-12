package my.application.fortresses_and_doors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button jump_btn;
    private ImageView persian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jump_btn = findViewById(R.id.jump_btn);
        persian = findViewById(R.id.persian);

        jump_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ViewGroup.MarginLayoutParams)persian.getLayoutParams()).topMargin -=10;
                persian.requestLayout();
            }
        });
    }
}