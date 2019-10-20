package kz.caremet.mentors.vijaysproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import kz.caremet.mentors.vijaysproject.models.FootballNews;

public class DetailsActivity extends AppCompatActivity {

    FootballNews footballNews;

    TextView title;
    TextView description;
    TextView createdAt;
    ImageView mainImage;
    Button shareBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = findViewById(R.id.newsTitle);
        description = findViewById(R.id.descriptionTextView);
        mainImage = findViewById(R.id.mainImage);
        shareBtn = findViewById(R.id.shareBtn);
        createdAt = findViewById(R.id.newsCreationDate);

        int footballNewsId = getIntent().getIntExtra("footballNewsId", -1);

        FootballNewsGenerator footballNewsGenerator = FootballNewsGenerator.getInstance();

        if(footballNewsId != -1){
            footballNews = footballNewsGenerator.getFootballNews(footballNewsId);

            if(footballNews != null){
                title.setText(footballNews.getTitle());
                description.setText(footballNews.getLongDescription());
                createdAt.setText( "Дата создания: " +
                        DateFormatter.getFormattedStringFromDate(footballNews.getCratetion_date()));

                Glide.with(this)
                        .load(footballNews.getImage_url())
                        .placeholder(R.drawable.ic_ball_load)
                        .into(mainImage);


                shareBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showToast("Не получилось сделать");
                    }
                });


            }

        }
    }

    private void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
