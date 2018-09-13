 package com.example.laptop.popupshow;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     TextView tvView;
     Button btnPress;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate( savedInstanceState );
         setContentView( R.layout.activity_main );

         tvView = findViewById( R.id.tv );
         btnPress = findViewById( R.id.btn );

         btnPress.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 showAlert( view);
             }
         } );



     }



     public void showAlert(View view) {
         AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder( this );
         alertDialogBuilder.setMessage( "Lets a make decision" );
         alertDialogBuilder.setPositiveButton( "yes",
                 new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Toast.makeText( MainActivity.this, "you guys are Awesome",
                                 Toast.LENGTH_LONG ).show();
                     }
                 } );

         alertDialogBuilder.setNegativeButton( "No", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 Toast.makeText( MainActivity.this, "We are sorry for you", Toast.LENGTH_LONG ).show();
                 finish();
             }
         } );

         AlertDialog alertDialog = alertDialogBuilder.create();
         alertDialog.show();
     }

 }