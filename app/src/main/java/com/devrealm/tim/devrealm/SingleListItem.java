package com.devrealm.tim.devrealm;

/**
 * Created by Mac'Philip1 on 3/15/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);

        TextView txtProduct = (TextView) findViewById(R.id.email);

        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("login");
        // displaying selected product name
        txtProduct.setText(product);

    }
}