package com.chenyingjie.myokhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chenyingjie.okhttp.OkCallback;
import com.chenyingjie.okhttp.OkClient;

import com.chenyingjie.myokhttp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String url = "https://raw.github.com/square/okhttp/master/README.md";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnReq1.setOnClickListener(view -> getReq());
        binding.btnReq2.setOnClickListener(view -> getReq2());
    }

    private void getReq() {
        binding.textView.setText("请求中...");
        OkClient.getInstance().getAsyc(url, new OkCallback() {
            @Override
            public void onError(int code, String message) {
                binding.textView.setText("code: " + code + ", message: " + message);
            }

            @Override
            public void onResult(String response) {
                binding.textView.setText(response);
            }
        });
    }

    private void getReq2() {

    }
}