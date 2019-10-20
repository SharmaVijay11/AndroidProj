package kz.caremet.mentors.vijaysproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemFootballNewsClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FootballNewsGenerator footballNewsGenerator = FootballNewsGenerator.getInstance();

        RecyclerView recyclerView = findViewById(R.id.main_content_recList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FootballNewsAdapter adapter = new FootballNewsAdapter(footballNewsGenerator.getFootballNewsList(),this, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void startDetailsActivity(int footballNewsId) {
        Intent intent = new Intent(this, DetailsActivity.class).putExtra("footballNewsId",footballNewsId);
        startActivity(intent);
    }

    @Override
    public void showToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
