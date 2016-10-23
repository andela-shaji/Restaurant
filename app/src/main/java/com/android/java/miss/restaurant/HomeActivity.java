package com.android.java.miss.restaurant;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
  private TextView textViewLogo;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
    setContentView(R.layout.activity_home);
    setStatusBackgroundColor();

    // font path
    String fontPath = "fonts/BerkshireSwash-Regular.ttf";
    Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

    textViewLogo = (TextView) findViewById(R.id.tv_logo);
    textViewLogo.setTypeface(tf);
  }


  private void setStatusBackgroundColor() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      getWindow().getDecorView().setSystemUiVisibility(
              View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                      | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
      getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.black_transparent));
    }
  }
}
