package rs.aleph.android.example12.activities.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import rs.aleph.android.example12.R;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    private int position = 0;

    private Jelo[] fruits = new Fruit[] {
            new Fruit("apples.jpg", "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f),
            new Fruit("bananas.jpg", "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 4.0f),
            new Fruit("oranges.jpg", "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 3.0f)
    };

    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }
    // startujemo third activity
    public void btnStartActivityClicked(View view) {
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    // otvaramo kameru
    public void btnOpenCameraClicked(View view) {
        Intent intent2 = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        startActivity(intent2);
    }
}


}


