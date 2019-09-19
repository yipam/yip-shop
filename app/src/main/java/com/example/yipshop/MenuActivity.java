package com.example.yipshop;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    private static final String LOG_TAG = CheckoutActivity.class.getSimpleName();
    private static final String LOG_TAGR = MenuActivity.class.getSimpleName();
    int counter = 0;
    int counter2 = 0;
    int counter3 = 0;

    double transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        final Button button_increase = findViewById(R.id.add_button1);
        button_increase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                counter = counter + 1;
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + counter);

                double finalSubtotal = counter * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1+dd2+dd3;

                displaySubber(transfer);

                Log.d(LOG_TAGR, "*checkout*" + (transfer));

            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

        });

        final Button button_decrease = findViewById(R.id.minus_button1);
        button_decrease.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter > 0) {
                    counter = counter - 1;
                }
                display(counter);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                TextView subtotal = (TextView) temp.getChildAt(11);
                String s = subtotal.getText().toString();
                double ss = Double.parseDouble(s);
                double finalSubtotal = counter * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);

            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

        });

        final Button button_increase2 = findViewById(R.id.add_button2);
        button_increase2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                counter2 = counter2 + 1;
                display(counter2);
                Log.d(LOG_TAGR, "*quantity*" + counter2);

                double finalSubtotal = counter2 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);

                Log.d(LOG_TAGR, "*checkout*" + (transfer));

            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer2);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal2);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

        });

        final Button button_decrease2 = findViewById(R.id.minus_button2);
        button_decrease2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter2 > 0) {
                    counter2 = counter2 - 1;
                }
                display(counter2);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                double finalSubtotal = counter2 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);

            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer2);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal2);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });

        final Button button_increase3 = findViewById(R.id.add_button3);
        button_increase3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                counter3 = counter3 + 1;
                display(counter3);
                Log.d(LOG_TAGR, "*quantity*" + counter3);

                double finalSubtotal = counter3 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);


            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer3);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal3);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

        });

        final Button button_decrease3 = findViewById(R.id.minus_button3);
        button_decrease3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ViewGroup temp = (ViewGroup) v.getParent();

                TextView price = (TextView) temp.getChildAt(3);
                String p = price.getText().toString();
                double pp = Double.parseDouble(p);
                Log.d(LOG_TAGR, "*price*" + pp);

                TextView quantity = (TextView) temp.getChildAt(10);
                String q = quantity.getText().toString();
                int qq = Integer.parseInt(q);
                if (counter3 > 0) {
                    counter3 = counter3 - 1;
                }
                display(counter3);
                Log.d(LOG_TAGR, "*quantity*" + qq);

                double finalSubtotal = counter3 * pp;
                displaySub(finalSubtotal);
                Log.d(LOG_TAGR, "*subtotal*" + finalSubtotal);

                TextView getFirstSub = (TextView) findViewById(R.id.subtotal);
                String d1 = getFirstSub.getText().toString();
                double dd1 = Double.parseDouble(d1);

                TextView getSecondSub = (TextView) findViewById(R.id.subtotal2);
                String d2 = getSecondSub.getText().toString();
                double dd2 = Double.parseDouble(d2);

                TextView getThirdSub = (TextView) findViewById(R.id.subtotal3);
                String d3 = getThirdSub.getText().toString();
                double dd3 = Double.parseDouble(d3);

                transfer = dd1 + dd2 + dd3;

                displaySubber(transfer);

            }

            private void display(int number) {
                TextView displayInteger = (TextView) findViewById(R.id.integer3);
                displayInteger.setText("" + number);
            }

            private void displaySub(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal3);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }

            private void displaySubber(double number) {
                TextView displaySubtotal = (TextView) findViewById(R.id.subtotal_amount);
                displaySubtotal.setText("" + String.format("%.2f", number));
            }
        });

    }

    public void launchCheckoutActivity(View view) {
        Intent intent = new Intent(this, CheckoutActivity.class);

        ViewGroup layout_view = (ViewGroup) view.getParent();
        TextView checkout_view = (TextView) layout_view.getChildAt(2);
        String message = checkout_view.getText().toString();
        intent.putExtra("subtotal", message);
        startActivity(intent);

        Log.d(LOG_TAG, "Button clicked!");
        Log.d(LOG_TAG, "!" + message);
    }
}