package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ments_calculator_try.R;

public class patientfactors_activity extends AppCompatActivity {
Integer agedigit=0;
Integer lungdigit=0;
Integer sleepdigit=0;
Integer cvdigit=0;
Integer diabetesdigit=0;
Integer inmunodigit=0;
Integer ilidigit=0;
Integer coviddigit=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientfactors);

        findViewById(R.id.nextbutton).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(getApplicationContext(),results_activity.class);
                startActivity(nextIntent);
            }
        });

        findViewById(R.id.home_button).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent homeintent= new Intent(getApplicationContext(),patientInformation_activuty.class);
                startActivity(homeintent);
            }
        });

        findViewById(R.id.return2button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnintent = new Intent(getApplicationContext(),procedurefactors_activity.class);
                startActivity(returnintent);
            }
        });

        Spinner agespinner=findViewById(R.id.age_spinner);
        String[] ageoptions={"<20 years", "21-40 years","41-50 years","51-65 years",">65 years"};
        ArrayAdapter<String> arrayadapterage= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,ageoptions);
        agespinner.setAdapter(arrayadapterage);

        agespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=agespinner.getSelectedItem().toString();
                if (selection.equals("<20 years")){
                    agedigit=1;
                } else if (selection.equals("21-40 years")){
                    agedigit=2;
                } else if (selection.equals("41-50 years")){
                    agedigit=3;
                } else if (selection.equals("51-65 years")){
                    agedigit=4;
                } else if (selection.equals(">65 years")){
                    agedigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                agedigit=0;
            }
        });


        Spinner lungspinner=findViewById(R.id.lungdisease_spinner);
        String[] lungoptions={"None", "-","-","Minimal(rare inhaler)",">Minimal"};
        ArrayAdapter<String> arrayadapterlung= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,lungoptions);
        lungspinner.setAdapter(arrayadapterlung);

        lungspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=lungspinner.getSelectedItem().toString();
                if (selection.equals("None")){
                    lungdigit=1;
                } else if (selection.equals("-")){
                    lungdigit=2;
                } else if (selection.equals("-")){
                    lungdigit=3;
                } else if (selection.equals("Minimal (rare inhaler)")){
                    lungdigit=4;
                } else if (selection.equals(">Minimal")){
                    lungdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                lungdigit=0;
            }
        });



        Spinner sleepspinner=findViewById(R.id.sleepapnea_spinner);
        String[] sleepoptions={"Not present", "-","-","Mild/moderate (no CPAP)","On CPAP"};
        ArrayAdapter<String> arrayadaptersleep= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,sleepoptions);
        sleepspinner.setAdapter(arrayadaptersleep);

        sleepspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=sleepspinner.getSelectedItem().toString();
                if (selection.equals("Not present")){
                    sleepdigit=1;
                } else if (selection.equals("-")){
                    sleepdigit=2;
                } else if (selection.equals("-")){
                    sleepdigit=3;
                } else if (selection.equals("Mild/moderate (no CPAP)")){
                    sleepdigit=4;
                } else if (selection.equals("On CPAP")){
                    sleepdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                sleepdigit=0;
            }
        });


        Spinner cvspinner=findViewById(R.id.cvdisease_spinner);
        String[] cvoptions={"None", "Minimal(no meds)","Mild (1 med)","Moderate (2 meds)","Severe (>3 meds)"};
        ArrayAdapter<String> arrayadaptercv= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,cvoptions);
        cvspinner.setAdapter(arrayadaptercv);

        cvspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=cvspinner.getSelectedItem().toString();
                if (selection.equals("None")){
                    cvdigit=1;
                } else if (selection.equals("Minimal(no meds)")){
                    cvdigit=2;
                } else if (selection.equals("Mild (1 med)")){
                    cvdigit=3;
                } else if (selection.equals("Moderate (2 meds)")){
                    cvdigit=4;
                } else if (selection.equals("Severe (>3 meds)")){
                    cvdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                cvdigit=0;
            }
        });


        Spinner diabetesspinner=findViewById(R.id.diabetes_spinner);
        String[] diabetesoptions={"None", "-","Mild (no meds)","Moderate (PO meds only)",">Moderate (insulin)"};
        ArrayAdapter<String> arrayadapterdiabetes= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,diabetesoptions);
        diabetesspinner.setAdapter(arrayadapterdiabetes);

        diabetesspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=diabetesspinner.getSelectedItem().toString();
                if (selection.equals("None")){
                    diabetesdigit=1;
                } else if (selection.equals("-")){
                    diabetesdigit=2;
                } else if (selection.equals("Mild (no meds)")){
                    diabetesdigit=3;
                } else if (selection.equals("Moderate (PO meds only)")){
                    diabetesdigit=4;
                } else if (selection.equals(">Moderate (insulin)")){
                    diabetesdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                diabetesdigit=0;
            }
        });


        Spinner inmunospinner=findViewById(R.id.inmunocompromised_spinner);
        String[] inmunooptions={"No", "-","-","Moderate","Severe"};
        ArrayAdapter<String> arrayadapterinmuno= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,inmunooptions);
        inmunospinner.setAdapter(arrayadapterinmuno);

        inmunospinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=inmunospinner.getSelectedItem().toString();
                if (selection.equals("N0")){
                    inmunodigit=1;
                } else if (selection.equals("-")){
                    inmunodigit=2;
                } else if (selection.equals("-")){
                    inmunodigit=3;
                } else if (selection.equals("Moderate")){
                    inmunodigit=4;
                } else if (selection.equals("Severe")){
                    inmunodigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                inmunodigit=0;
            }
        });


        Spinner ilispinner=findViewById(R.id.ili_spinner);
        String[] ilioptions={"None (Asymptomatic)", "-","-","-","Yes"};
        ArrayAdapter<String> arrayadapterili= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,ilioptions);
        ilispinner.setAdapter(arrayadapterili);

        ilispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=ilispinner.getSelectedItem().toString();
                if (selection.equals("None (Asymptomatic")){
                    ilidigit=1;
                } else if (selection.equals("-")){
                    ilidigit=2;
                } else if (selection.equals("-")){
                    ilidigit=3;
                } else if (selection.equals("-")){
                    ilidigit=4;
                } else if (selection.equals("Yes")){
                    ilidigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                ilidigit=0;
            }
        });


        Spinner covidspinner=findViewById(R.id.covid_spinner);
        String[] covidoptions={"No", "Probably not","Possibly","Probably","Yes"};
        ArrayAdapter<String> arrayadaptercovid= new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item,covidoptions);
        covidspinner.setAdapter(arrayadaptercovid);

        covidspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=covidspinner.getSelectedItem().toString();
                if (selection.equals("No")){
                    coviddigit=1;
                } else if (selection.equals("Probably not")){
                    coviddigit=2;
                } else if (selection.equals("Possibly")){
                    coviddigit=3;
                } else if (selection.equals("Probably")){
                    coviddigit=4;
                } else if (selection.equals("Yes")){
                    coviddigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                coviddigit=0;
            }
        });

    }
}
