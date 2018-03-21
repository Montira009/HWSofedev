package com.montira.hwsofedev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_RapMonster:
                if (checked)
                    System.out.println("Put some meat on the sandwich");
                else
                    System.out.println("Remove the meat");
                break;
            case R.id.checkbox_Jin:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_Suga:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_JHope:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_Jimin:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_V:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_Jungkook:
                if (checked)
                    System.out.println("Put some meat on the sandwich");
                else
                    System.out.println("Remove the meat");
                break;
            case R.id.checkbox_Joongki:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_Minho:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
            case R.id.checkbox_Jongsuk:
                if (checked)
                    System.out.println("Cheese me");
                else
                    System.out.println("I'm lactose intolerant");
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_RapMonster:
                if (checked)
                    System.out.println("Pirates are the best");
                break;
            case R.id.radio_Jin:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
            case R.id.radio_Suga:
                if (checked)
                    System.out.println("Pirates are the best");
                break;
            case R.id.radio_JHope:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
            case R.id.radio_Jimin:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
            case R.id.radio_V:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
            case R.id.radio_Jungkook:
                if (checked)
                    System.out.println("Ninjas rule ");
                break;
        }
    }
}
