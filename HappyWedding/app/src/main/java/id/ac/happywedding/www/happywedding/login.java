package id.ac.happywedding.www.happywedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class login extends AppCompatActivity {
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.button3)
    Button button3;

    @Override
    public void onBackPressed(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button3)
    public void setButton3(){
        Intent intent = new Intent(login.this,Beranda.class);
        startActivity(intent);
        finish();
    }
}
