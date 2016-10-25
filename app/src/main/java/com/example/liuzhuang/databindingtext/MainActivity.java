package com.example.liuzhuang.databindingtext;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.liuzhuang.databindingtext.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    DataBean dataBean = new DataBean("Steven", "Liu");
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        binding.firstName.setText(dataBean.getFirst_name());
//        binding.lastName.setText(dataBean.getLast_name());
        binding.setDataBean(dataBean);
        binding.setPresenter(new Presenter());

    }

    public class Presenter {
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            dataBean.setFirst_name(s.toString());
            binding.setDataBean(dataBean);

        }

        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(DataBean dataBean) {
            Toast.makeText(MainActivity.this, dataBean.getLast_name(), Toast.LENGTH_SHORT).show();
        }
    }

}
