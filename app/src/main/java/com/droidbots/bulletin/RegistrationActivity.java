package com.droidbots.bulletin;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import com.rey.material.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class RegistrationActivity extends AppCompatActivity {

    Spinner accountType,year,department;
    Toolbar toolbar;
    LinearLayout yearLayout;
    String accountTypeStr,yearStr,departmentStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("New User Registration");
        setSupportActionBar(toolbar);

        yearLayout=(LinearLayout)findViewById(R.id.year_layout);
        accountType=(Spinner)findViewById(R.id.account_type);
        year=(Spinner)findViewById(R.id.year);
        department=(Spinner)findViewById(R.id.department);

        initializeSpinners();




    }

    void initializeSpinners()
    {
        List<String> list = new ArrayList<>();
        list.add("Student");
        list.add("Faculty");
        list.add("Administration");



        ArrayAdapter<String> accountTypeDataAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, list);

        accountTypeDataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        accountType.setAdapter(accountTypeDataAdapter);



        List<String> yearList = new ArrayList<>();
        yearList.add("First");
        yearList.add("Second");
        yearList.add("Third");
        yearList.add("Fourth");



        ArrayAdapter<String> yearDataAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, yearList);

        yearDataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        year.setAdapter(yearDataAdapter);



        List<String> departmentList = new ArrayList<>();
        departmentList.add("Computer Science Engineering");
        departmentList.add("Information Technology");
        departmentList.add("Mechanical Engineering");
        departmentList.add("Electronics Engineering");
        departmentList.add("Electrical Engineering");
        departmentList.add("Civil Engineering");





        ArrayAdapter<String> deptDataAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, departmentList);

        deptDataAdapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        department.setAdapter(deptDataAdapter);


        addListenerOnAccountTypeSpinnerItemSelection();
        addListenerOnDepartmentSpinnerItemSelection();
        addListenerOnYearSpinnerItemSelection();
    }

    public void addListenerOnAccountTypeSpinnerItemSelection() {
        accountType.setOnItemSelectedListener(new AccountTypeOnItemSelectedListener());
    }

    public class AccountTypeOnItemSelectedListener implements Spinner.OnItemSelectedListener {


        @Override
        public void onItemSelected(Spinner spinner, View view, int i, long l) {
            accountTypeStr=spinner.getSelectedItem().toString();
            if(accountTypeStr.equals("Student")){
                yearLayout.setVisibility(View.VISIBLE);
            }
        }
    }

    public void addListenerOnYearSpinnerItemSelection() {
        year.setOnItemSelectedListener(new YearOnItemSelectedListener());
    }

    public class YearOnItemSelectedListener implements Spinner.OnItemSelectedListener {


        @Override
        public void onItemSelected(Spinner spinner, View view, int i, long l) {
            yearStr=spinner.getSelectedItem().toString();

        }
    }

    public void addListenerOnDepartmentSpinnerItemSelection() {
        department.setOnItemSelectedListener(new DepartmentOnItemSelectedListener());
    }

    public class DepartmentOnItemSelectedListener implements Spinner.OnItemSelectedListener {


        @Override
        public void onItemSelected(Spinner spinner, View view, int i, long l) {
            departmentStr=spinner.getSelectedItem().toString();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registration, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
