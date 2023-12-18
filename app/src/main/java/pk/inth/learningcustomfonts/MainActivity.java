package pk.inth.learningcustomfonts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView urdu, turkish, chinese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We can easily set custom fonts in XML file using Font Family option
        // and we can use programming as well


        // urdu.setTypeface(ResourcesCompat.getFont(getApplicationContext(), R.font.urdu));

        // This is how you can work with "assets folder"
        //object.createFromAsset(getAssets(), "folder/filename");

    }
}