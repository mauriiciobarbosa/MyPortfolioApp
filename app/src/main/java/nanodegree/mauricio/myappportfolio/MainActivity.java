package nanodegree.mauricio.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeAction(View view) {
        boolean isButton = view instanceof Button;

        if (!isButton) return;

        Button button = (Button) view;
        String buttonText = button.getText().toString();

        String message = getString(R.string.msg_show_app, buttonText.toLowerCase());

        showMessage(message);
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
