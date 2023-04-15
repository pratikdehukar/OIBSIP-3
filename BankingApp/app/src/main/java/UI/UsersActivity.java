package UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.suvarnalaxmi.bankingapp.R;

public class UsersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new UsersFragment())
                .commit();
    }


}