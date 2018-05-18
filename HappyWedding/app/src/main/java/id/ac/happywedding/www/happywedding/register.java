package id.ac.happywedding.www.happywedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class register extends AppCompatActivity {

    @BindView(R.id.button4)
    Button button4;
    @BindView(R.id.textView13)
    TextView textView13;



    @Override
    public void onBackPressed(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button4)
    public void setTextView14(){
        Intent intent = new Intent(register.this, login.class);
        startActivity(intent);
        finish();
    }
}
