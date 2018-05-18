package id.ac.happywedding.www.happywedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class halamanawal extends AppCompatActivity {
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;


    @Override
    public void onBackPressed(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanawal);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void setButton(){
        Intent intent = new Intent(halamanawal.this, login.class);
        startActivity(intent);
        finish();
    }
    @OnClick(R.id.button2)
    public void setButton2(){
        Intent intent = new Intent(halamanawal.this, register.class);
        startActivity(intent);
        finish();
    }

}