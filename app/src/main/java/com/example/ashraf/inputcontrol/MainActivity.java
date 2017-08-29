package com.example.ashraf.inputcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    private ArrayList<String>arrayList=new ArrayList<>();
    private String selectItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_ashraf:
                doSelectOrNot(view,checked);
                break;
            case R.id.checkbox_alve:
                doSelectOrNot(view,checked);
                break;
            case R.id.checkbox_anam:
                doSelectOrNot(view,checked);
                break;
            case R.id.checkbox_Md:
                doSelectOrNot(view,checked);
                break;

        }

    }
    public void doSelectOrNot(View view,boolean checked){
        if (checked){
            selectItem = ((CheckBox)view).getText().toString();
            arrayList.add(selectItem);
           /* String str = "";
            for (String pair : arrayList) {
                str += pair + ' ';
            }
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();*/
            Toast.makeText(this, "Size"+arrayList.size(), Toast.LENGTH_LONG).show();
        }
        else{
            selectItem = ((CheckBox)view).getText().toString();
           /* for (String object: arrayList) {
                if(object==selectItem){
                    arrayList.remove(selectItem);
                }
            }
            String str = "";
            for (String pair : arrayList) {
                str += pair + ' ';
            }
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();*/
            if(arrayList.contains(selectItem))
                arrayList.remove(selectItem);
            Toast.makeText(this, "Size"+arrayList.size(), Toast.LENGTH_LONG).show();
        }
    }
}
