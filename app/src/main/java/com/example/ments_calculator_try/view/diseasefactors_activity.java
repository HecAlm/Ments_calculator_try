package com.example.ments_calculator_try.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ments_calculator_try.R;

public class diseasefactors_activity extends AppCompatActivity {
Integer wk6riskdigit=0;
Integer wk6outcomedigit=0;
Integer wk2riskdigit=0;
Integer wk2outcomedigit=0;
Integer riskdigit=0;
Integer effectivenessdigit=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseasefactors);


        findViewById(R.id.nestdiseasebutton).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent nestintent= new Intent(getApplicationContext(),patientfactors_activity.class);
                startActivity(nestintent);
            }
        });


        findViewById(R.id.homediseasebutton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent homeintent2 = new Intent(getApplicationContext(),patientInformation_activuty.class);
                startActivity(homeintent2);
            }
        });

        findViewById(R.id.returndiseasebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returndiseaseintent = new Intent(getApplicationContext(),procedurefactors_activity.class);
                startActivity(returndiseaseintent);
            }
        });


        Spinner efectivenessspinner=findViewById(R.id.effectivenes_spinner);
        String[] effectivenessoptions={"None available","Available,<40% as effective as surgery","Available,40% to 60% as effective as surgery","Available, 61% to 95% as effective as surgery","Available,equally effective"};
        ArrayAdapter<String> arrayArrayAdaptereffective = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,effectivenessoptions);
        efectivenessspinner.setAdapter(arrayArrayAdaptereffective);

        efectivenessspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=efectivenessspinner.getSelectedItem().toString();
                if (selection.equals("None available")){
                    effectivenessdigit=1;
                } else if (selection.equals("Available,<40% as effective as surgery")){
                    effectivenessdigit=2;
                } else if (selection.equals("Available,40% to 60% as effective as surgery")){
                    effectivenessdigit=3;
                } else if (selection.equals("Available, 61% to 95% as effective as surgery")){
                    effectivenessdigit=4;
                } else if (selection.equals("Available,equally effective")){
                    effectivenessdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                effectivenessdigit=0;
            }
        });

        Spinner risksspinner=findViewById(R.id.risk_spinner);
        String[] riskoptions={"Significantly worse/ not applicable","Somewhat worse","Equivalent","Somewhat better","Significantly better"};
        ArrayAdapter<String> arrayArrayAdapterrisk = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,riskoptions);
        risksspinner.setAdapter(arrayArrayAdapterrisk);

        risksspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=risksspinner.getSelectedItem().toString();
                if (selection.equals("Significantly worse/ not applicable")){
                    riskdigit=1;
                } else if (selection.equals("Somewhat worse")){
                    riskdigit=2;
                } else if (selection.equals("Equivalent")){
                    riskdigit=3;
                } else if (selection.equals("Somewhat better")){
                    riskdigit=4;
                } else if (selection.equals("Significantly better")){
                    riskdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                riskdigit=0;
            }
        });


        Spinner wk2_outcomespinner=findViewById(R.id.wk2_outcome);
        String[] wk2_outcomeoptions={"Significantly worse","Worse","Moderately worse","Slightly worse","No worse"};
        ArrayAdapter<String> arrayArrayAdapterwk2_outcome = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,wk2_outcomeoptions);
        wk2_outcomespinner.setAdapter(arrayArrayAdapterwk2_outcome);

        wk2_outcomespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=wk2_outcomespinner.getSelectedItem().toString();
                if (selection.equals("Significantly worse")){
                    wk2outcomedigit=1;
                } else if (selection.equals("Worse")){
                    wk2outcomedigit=2;
                } else if (selection.equals("Moderately worse")){
                    wk2outcomedigit=3;
                } else if (selection.equals("Slightly worse")){
                    wk2outcomedigit=4;
                } else if (selection.equals("No worse")){
                    wk2outcomedigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                wk2outcomedigit=0;
            }
        });



        Spinner wk2_riskspinner=findViewById(R.id.wk2_risk_spinner);
        String[] wk2_riskoptions={"Significantly worse","Worse","Moderately worse","Slightly worse","No worse"};
        ArrayAdapter<String> arrayArrayAdapterwk2_risk = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,wk2_riskoptions);
        wk2_riskspinner.setAdapter(arrayArrayAdapterwk2_risk);

        wk2_riskspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=wk2_riskspinner.getSelectedItem().toString();
                if (selection.equals("Significantly worse")){
                    wk2riskdigit=1;
                } else if (selection.equals("Worse")){
                    wk2riskdigit=2;
                } else if (selection.equals("Moderately worse")){
                    wk2riskdigit=3;
                } else if (selection.equals("Slightly worse")){
                    wk2riskdigit=4;
                } else if (selection.equals("No worse")){
                    wk2riskdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                wk2riskdigit=0;
            }
        });



        Spinner wk6_outcomespinner=findViewById(R.id.wk6_outcome);
        String[] wk6_outcomeoptions={"Significantly worse","Worse","Moderately worse","Slightly worse","No worse"};
        ArrayAdapter<String> arrayArrayAdapterwk6_outcome = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,wk6_outcomeoptions);
        wk6_outcomespinner.setAdapter(arrayArrayAdapterwk6_outcome);

        wk6_outcomespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=wk6_outcomespinner.getSelectedItem().toString();
                if (selection.equals("Significantly worse")){
                    wk6outcomedigit=1;
                } else if (selection.equals("Worse")){
                    wk6outcomedigit=2;
                } else if (selection.equals("Moderately worse")){
                    wk6outcomedigit=3;
                } else if (selection.equals("Slightly worse")){
                    wk6outcomedigit=4;
                } else if (selection.equals("No worse")){
                    wk6outcomedigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                wk6outcomedigit=0;
            }
        });



        Spinner wk6_riskspinner=findViewById(R.id.wk6_risk_spinner);
        String[] wk6_riskoptions={"Significantly worse","Worse","Moderately worse","Slightly worse","No worse"};
        ArrayAdapter<String> arrayArrayAdapterwk6_risk = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,wk6_riskoptions);
        wk6_riskspinner.setAdapter(arrayArrayAdapterwk6_risk);

        wk6_riskspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection=wk6_riskspinner.getSelectedItem().toString();
                if (selection.equals("Significantly worse")){
                    wk6riskdigit=1;
                } else if (selection.equals("Worse")){
                    wk6riskdigit=2;
                } else if (selection.equals("Moderately worse")){
                    wk6riskdigit=3;
                } else if (selection.equals("Slightly worse")){
                    wk6riskdigit=4;
                } else if (selection.equals("No worse")){
                    wk6riskdigit=5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                wk6riskdigit=0;
            }
        });
    }
}
