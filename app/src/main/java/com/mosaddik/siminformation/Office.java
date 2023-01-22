package com.mosaddik.siminformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Office extends AppCompatActivity {


    TextView ablanceC1, ablanceC2, ablanceC3, ablanceC4, ablanceC5, ablanceC6, ablanceC7, ablanceC8, ablanceC9, ablanceC10;
    Button bcopy1, bcopy2, bcopy3, bcopy4, bcopy5, bcopy6, bcopy7, bcopy8, bcopy9, bcopy10, buttond1, buttond2, buttond3, buttond4, buttond5, buttond6, buttond7, buttond8, buttond9, buttond10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);
        getSupportActionBar().setTitle("Office");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ablanceC1 = findViewById(R.id.ablanceC1);
        ablanceC2 = findViewById(R.id.ablanceC2);
        ablanceC3 = findViewById(R.id.ablanceC3);
        ablanceC4 = findViewById(R.id.ablanceC4);
        ablanceC5 = findViewById(R.id.ablanceC5);
        ablanceC6 = findViewById(R.id.ablanceC6);
        ablanceC7 = findViewById(R.id.ablanceC7);
        ablanceC8 = findViewById(R.id.ablanceC8);
        ablanceC9 = findViewById(R.id.ablanceC9);
        ablanceC10 = findViewById(R.id.ablanceC10);


        bcopy1 = findViewById(R.id.bcopy1);
        bcopy2 = findViewById(R.id.bcopy2);
        bcopy3 = findViewById(R.id.bcopy3);
        bcopy4 = findViewById(R.id.bcopy4);
        bcopy5 = findViewById(R.id.bcopy5);
        bcopy6 = findViewById(R.id.bcopy6);
        bcopy7 = findViewById(R.id.bcopy7);
        bcopy8 = findViewById(R.id.bcopy8);
        bcopy9 = findViewById(R.id.bcopy9);
        bcopy10 = findViewById(R.id.bcopy10);


        buttond1 = findViewById(R.id.buttond1);
        buttond2 = findViewById(R.id.buttond2);
        buttond3 = findViewById(R.id.buttond3);
        buttond4 = findViewById(R.id.buttond4);
        buttond5 = findViewById(R.id.buttond5);
        buttond6 = findViewById(R.id.buttond6);
        buttond7 = findViewById(R.id.buttond7);
        buttond8 = findViewById(R.id.buttond8);
        buttond9 = findViewById(R.id.buttond9);
        buttond10 = findViewById(R.id.buttond10);




        bcopy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC1.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:121"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });


        bcopy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC2.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01819400400"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });


        bcopy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC3.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:786"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });


        bcopy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC4.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0167860786"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });



        bcopy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC5.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1234"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });



        bcopy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC6.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01550157740"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });



        bcopy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC7.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:121"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });



        bcopy8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC8.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01911304121"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });



        bcopy9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC9.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:121"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });



        bcopy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text",ablanceC10.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(Office.this, "Copy Finished", Toast.LENGTH_LONG).show();

            }
        });

        buttond10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01711594594"));
                startActivity(intent);

                Toast.makeText(Office.this, "Please Type- #  then Call", Toast.LENGTH_LONG).show();

            }
        });


    }
}