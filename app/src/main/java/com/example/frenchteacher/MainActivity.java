package com.example.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.frenchteacher.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.black.setOnClickListener(this);
        binding.Green.setOnClickListener(this);
        binding.Purple.setOnClickListener(this);
        binding.Red.setOnClickListener(this);
        binding.Yellow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int BtnId=view.getId();

        if(BtnId==R.id.black){
            PlaySound(R.raw.black);
        }
        else if(BtnId==R.id.Green){
            PlaySound(R.raw.green);
        }
        else if(BtnId==R.id.Purple){
            PlaySound(R.raw.purple);
        }
        else if(BtnId==R.id.Red){
            PlaySound(R.raw.red);
        }
        else if(BtnId==R.id.Yellow){
            PlaySound(R.raw.yellow);
        }

    }

    public void PlaySound(int id){
        MediaPlayer mediaPlayer =MediaPlayer.create(getApplicationContext(), id);
        mediaPlayer.start();
    }

}