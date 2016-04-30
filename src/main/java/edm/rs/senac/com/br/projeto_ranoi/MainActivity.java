package edm.rs.senac.com.br.projeto_ranoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alteraNome(View view){
        EditText editText = (EditText)findViewById(R.id.text_nome);
        TextView textView = (TextView) findViewById(R.id.text_world);
        textView.setText("Hello " + editText.getText());
    }
}
