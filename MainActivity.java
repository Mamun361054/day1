package com.example.mdmamunhossain.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox check;
    ArrayList<String> arrayList;
    LinearLayout linearLayout;
    Button btnOk;
    TextView txtView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        btnOk = (Button) findViewById(R.id.okButton);
        listView = (ListView)findViewById(R.id.listView);

   /*    ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

               if(isChecked){

                   Toast.makeText(getApplication(),"Remember you",Toast.LENGTH_SHORT).show();

               }else{

                   Toast.makeText(getApplication(),"Not remember you",Toast.LENGTH_SHORT).show();

               }

           }
       });*/
        //use button
    }
    public void ok(View view) {
        arrayList = new ArrayList<>();
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View v = linearLayout.getChildAt(i);

            if (v instanceof CheckBox) {

                check = (CheckBox) v;

                if (check.isChecked()) {

                    String data = (String) check.getText().toString();
                    arrayList.add(data);
                }

            }
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}

