package com.test.nancheong.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.test.nancheong.MainActivity;
import com.test.nancheong.R;
import com.test.nancheong.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    MainActivity mainActivity;
    private View viewHome;
    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private ImageButton diagnose_btn, baby_btn, schedule_btn, encyclopaedia_btn,chat_btn,map_btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        viewHome = inflater.inflate(R.layout.fragment_home,container,false);
        diagnose_btn = viewHome.findViewById(R.id.diagnose_btn);
       baby_btn = viewHome.findViewById(R.id.baby_btn);
        encyclopaedia_btn = viewHome.findViewById(R.id.encyclopaedia_btn);
        schedule_btn = viewHome.findViewById(R.id.schedule_btn);
        chat_btn = viewHome.findViewById(R.id.chat_btn);
        map_btn = viewHome.findViewById(R.id.map_btn);

        diagnose_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onFragmentChange(1);

            }
        });

        baby_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onFragmentChange(2);
            }
        });
        schedule_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onFragmentChange(3);

            }
        });
        encyclopaedia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onFragmentChange(4);
            }
        });
        chat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onFragmentChange(5);
            }
        });
        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.onFragmentChange(6);
            }
        });
        diagnose_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return viewHome;
    }
    }