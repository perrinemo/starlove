package fr.perrine.starlove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AuraActivity extends AppCompatActivity {

    ArrayList<ProfileModel> mImagesPersos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aura);

        TextView title = findViewById(R.id.side_of_the_force);
        FontHelper.setFont(title, "Starjhol.ttf");

        mImagesPersos = getIntent().getExtras().getParcelableArrayList("clef");

        Button yes = findViewById(R.id.yes_button);
        Button no = findViewById(R.id.no_button);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goProfilView = new Intent(AuraActivity.this, ActivityPropositions.class);
                goProfilView.putParcelableArrayListExtra("clef", mImagesPersos);
                startActivity(goProfilView);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goProfilView = new Intent(AuraActivity.this, ActivityNo.class);
                goProfilView.putParcelableArrayListExtra("clef", mImagesPersos);
                startActivity(goProfilView);
            }
        });
    }
}
