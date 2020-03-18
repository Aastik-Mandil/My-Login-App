package com.game.myloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;

import java.util.ArrayList;

//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;

public class DashboardActivity extends AppCompatActivity {

    String EmailHolder;
    TextView Email;
    Button LogOUT ;
    GridView gridView;
    ArrayList birdList=new ArrayList<>();
//    FirebaseAuth mAuth;
//    FirebaseAuth.AuthStateListener mAuthListner;
//    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Email = findViewById(R.id.textView1);
        LogOUT = findViewById(R.id.button1);
        gridView = findViewById(R.id.gridView);

        Intent intent = getIntent();
        EmailHolder = intent.getStringExtra(MainActivity.userEmail);
        Email.setText(Email.getText().toString()+ EmailHolder);

        birdList.add(new Item("goku 1",R.drawable.goku));
        birdList.add(new Item("goku 2",R.drawable.goku1));
        birdList.add(new Item("goku 3",R.drawable.goku2));
        birdList.add(new Item("goku 4",R.drawable.goku3));
        birdList.add(new Item("goku 5",R.drawable.goku2));
        birdList.add(new Item("goku 6",R.drawable.goku1));
        birdList.add(new Item("goku 7",R.drawable.goku3));
        birdList.add(new Item("goku 8",R.drawable.goku1));

        final GridViewAdapter myAdapter=new GridViewAdapter(this,R.layout.grid_view_items,birdList);
        gridView.setAdapter(myAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item item = (Item) birdList.get(i);
                final Dialog dialog = new Dialog(DashboardActivity.this);
                dialog.setContentView(R.layout.itemlook);
                dialog.setCancelable(false);
                ImageView itemImage = dialog.findViewById(R.id.itemImage);
                TextView itemText = dialog.findViewById(R.id.itemText);
                Button back = dialog.findViewById(R.id.back);

                itemImage.setImageResource(item.getbirdImage());
                itemText.setText(item.getbirdName());

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                Log.d("Checking", item.getbirdName()+" "+String.valueOf(item.getbirdImage()));
            }
        });

        LogOUT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
                Toast.makeText(DashboardActivity.this,"Log Out Successfull", Toast.LENGTH_LONG).show();
            }
        });
    }
}