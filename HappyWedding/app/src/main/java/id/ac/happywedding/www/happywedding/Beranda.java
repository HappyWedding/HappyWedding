package id.ac.happywedding.www.happywedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Beranda extends AppCompatActivity {

    @BindView(R.id.textView14)
    TextView textView14;



    @Override
    public void onBackPressed(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.textView14)
    public void setTextView14(){
        Intent intent = new Intent(Beranda.this, login.class);
        startActivity(intent);
        finish();
    }


}
