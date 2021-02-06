package com.sayanthan.try6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
     EditText ed1,ed2;
     Button btn;
     ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.ede);
        ed2=findViewById(R.id.ed2);

        btn=findViewById(R.id.button);

        iv=findViewById(R.id.imageView);
//
//        Picasso.get()
//                .load("http://i.imgur.com/DvpvklR.png")
//                .resize(50, 50)
//                .centerCrop()
//                .into(iv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String ec1 = ed1.getText().toString();
                String ec2 = ed2.getText().toString();

               // addition(Integer.parseInt(ec1),Integer.parseInt(ec2));

               // Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(iv);


            }
        });
    }

    private void addition(int num1, int num2) {
        int total = num1+num2;
        ed2.setText(String.valueOf(total));
    }


}