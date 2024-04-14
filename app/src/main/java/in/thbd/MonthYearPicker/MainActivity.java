package in.thbd.MonthYearPicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.YearMonth;

import in.thbd.monthyearpicker.MonthPickerDialog;

public class MainActivity extends AppCompatActivity {

    TextView title,title2;
    int mYear=2024;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.textview);
        title2 = findViewById(R.id.textview);

        findViewById(R.id.button).setOnClickListener(view -> {


            MonthPickerDialog.Builder builder = new MonthPickerDialog.Builder(MainActivity.this, new MonthPickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(int selectedMonth, int selectedYear) {
                    title.setText("Year "+selectedYear);
                    mYear = selectedYear;

//                    getGraphData(mYear);
                }
            }, mYear, 0);

            builder.showYearOnly()
                    .setTitle("Select Year")
                    .build()
                    .show();

        });


        findViewById(R.id.button2).setOnClickListener(view -> {




            MonthPickerDialog.Builder builder = new MonthPickerDialog.Builder(MainActivity.this, new MonthPickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(int selectedMonth, int selectedYear) {
                    title.setText("Year "+selectedYear);
                    mYear = selectedYear;

//                    getGraphData(mYear);
                }


            }, mYear, 0);

            builder.showMonthOnly()
                    .setTitle("Select Year")
                    .build()
                    .show();

        });

    }
}