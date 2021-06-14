package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomerDataBase cdb = new CustomerDataBase(this);
        Customer customer1 = new Customer("4220","Deepak Reddy","deepakreddy@gmail.com",40000);
        boolean success = cdb.addRow(customer1);
        
        Button viewCustBtn = (Button) findViewById(R.id.viewCustButton);
        viewCustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent customersListIntent = new Intent(getApplicationContext(),CustomersListActivity.class);
                startActivity(customersListIntent);
            }
        });

        Button viewTransactionBtn = (Button) findViewById(R.id.viewTransBtn);
        viewTransactionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent transacListIntent = new Intent(MainActivity.this,TransactionListActivity.class);
                startActivity(transacListIntent);
            }
        });
    }
}