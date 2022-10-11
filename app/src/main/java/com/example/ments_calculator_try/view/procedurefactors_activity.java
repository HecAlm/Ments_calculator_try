package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ments_calculator_try.R;
public class procedurefactors_activity extends AppCompatActivity {
Integer losdigit=0;
Integer ordigit=0;
Integer icudigit=0;
Integer blooddigit=0;
Integer teamdigit=0;
Integer intubationdigit=0;
Integer sitedigit=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedurefactors);

        findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(),diseasefactors_activity.class);
                startActivity(nextIntent);
            }
        });

        findViewById(R.id.return_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent(getApplicationContext(),patientInformation_activuty.class);
                startActivity(returnIntent);
            }
        });

        Spinner orspiner=findViewById(R.id.ortime_spinner);
        String[] oroptions={"<30 min","31-60 min","61-120 min","121-180 min", ">181 min"};
        ArrayAdapter<String> arrayadapterortime=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,oroptions);
        orspiner.setAdapter(arrayadapterortime);

        orspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection = orspiner.getSelectedItem().toString();
                if (selection.equals("<30 min")){
                    ordigit=1;
                } else if (selection.equals("31-60 min")){
                    ordigit=2;
                } else if (selection.equals("61-120 min")){
                    ordigit=3;
                } else if (selection.equals("121-180 min")){
                    ordigit=4;
                } else if (selection.equals(">181 min")){
                    ordigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                ordigit=0;
            }

        });


        Spinner losspiner=findViewById(R.id.estimatedlos_spinner);
        String[] losoptions={"Outpatient","<23 hours","24-48 hours","2-3 days", ">4 days"};
        ArrayAdapter<String> arrayadapterlosestimation=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,losoptions);
        losspiner.setAdapter(arrayadapterlosestimation);

        losspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection=losspiner.getSelectedItem().toString();
                if (selection.equals("Outpatient")){
                    losdigit=1;
                } else if (selection.equals("<23 hours")){
                    losdigit=2;
                } else if (selection.equals("24-48 hours")){
                    losdigit=3;
                } else if (selection.equals("2-3 days")){
                    losdigit=4;
                } else if (selection.equals(">4 days")){
                    losdigit=5;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                losdigit=0;
            }

        });



        Spinner icuspiner=findViewById(R.id.icu_spinner);
        String[] icuoptions={"Very Unlikely","<5%","5-10%","11-25%", ">25%"};
        ArrayAdapter<String> arrayadaptericu=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,icuoptions);
        icuspiner.setAdapter(arrayadaptericu);

        icuspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection=icuspiner.getSelectedItem().toString();
                if (selection.equals("Very Unlikely")){
                    icudigit=1;
                } else if (selection.equals("<5%")){
                    icudigit=2;
                } else if (selection.equals("5-10%")){
                    icudigit=3;
                } else if (selection.equals("11-25%")){
                    icudigit=4;
                } else if (selection.equals(">25%")){
                    icudigit=5;
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                icudigit=0;
            }

        });



        Spinner bloodspiner=findViewById(R.id.blood_spiner);
        String[] bloodoptions={"<100 cc","100-250 cc","250-500 cc","500-750 cc", ">751 cc"};
        ArrayAdapter<String> arrayadapterblood=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,bloodoptions);
        bloodspiner.setAdapter(arrayadapterblood);

        bloodspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection=bloodspiner.getSelectedItem().toString();
                if (selection.equals("<100 cc")){
                    blooddigit=1;
                } else if (selection.equals("100-250 cc")){
                    blooddigit=2;
                } else if (selection.equals("250-500 cc")){
                    blooddigit=3;
                } else if (selection.equals("500-750 cc")){
                    blooddigit=4;
                } else if (selection.equals(">751 cc")){
                    blooddigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                blooddigit=0;
            }

        });





        Spinner teamspiner=findViewById(R.id.teamsize_spinner);
        String[] teamsizeoptions={"1","2","3","4", "5"};
        ArrayAdapter<String> arrayadapterteamsize=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,teamsizeoptions);
        teamspiner.setAdapter(arrayadapterteamsize);

        teamspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection=teamspiner.getSelectedItem().toString();
                if (selection.equals("1")){
                    teamdigit=1;
                } else if (selection.equals("2")){
                    teamdigit=2;
                } else if (selection.equals("3")){
                    teamdigit=3;
                } else if (selection.equals("4")){
                    teamdigit=4;
                } else if (selection.equals("5")){
                    teamdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                teamdigit=0;
            }

        });



        Spinner intubationspiner=findViewById(R.id.intubation_spinner);
        String[] intubationoptions={"<1%","1-5%","6-10%","11-25%", ">25%"};
        ArrayAdapter<String> arrayadapterintubation=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,intubationoptions);
        intubationspiner.setAdapter(arrayadapterintubation);

        intubationspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection=intubationspiner.getSelectedItem().toString();
                if (selection.equals("<1%")){
                    intubationdigit=1;
                } else if (selection.equals("1-5%")){
                    intubationdigit=2;
                } else if (selection.equals("6-10%")){
                    intubationdigit=3;
                } else if (selection.equals("11-25%")){
                    intubationdigit=4;
                } else if (selection.equals(">25%")){
                    intubationdigit=5;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                intubationdigit=0;
            }

        });




        Spinner sitespiner=findViewById(R.id.surgicalsite_spinner);
        String[] surgicalsiteoptions={"None of the following variables","Abdominopelvic MIS","Abdominopelvic open surgery, infaumbilical","Abdominopelvic open surgery, supraumbilical", "OHNS/upper or GI/thoracic"};
        ArrayAdapter<String> arrayadaptersurgicalsite=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,surgicalsiteoptions);
        sitespiner.setAdapter(arrayadaptersurgicalsite);

        sitespiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                String selection=sitespiner.getSelectedItem().toString();
                if (selection.equals("None of the following variables")){
                    sitedigit=1;
                } else if (selection.equals("Abdominopelvic MIS")){
                    sitedigit=2;
                } else if (selection.equals("Abdominopelvic open surgery, infaumbilical")){
                    sitedigit=3;
                } else if (selection.equals("Abdominopelvic open surgery, supraumbilical")){
                    sitedigit=4;
                } else if (selection.equals("OHNS/upper or GI/thoracic")){
                    sitedigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                sitedigit=0;
            }

        });

    }
}
