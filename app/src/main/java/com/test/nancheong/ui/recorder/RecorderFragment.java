package com.test.nancheong.ui.recorder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.test.nancheong.databinding.FragmentHomeBinding;
import com.test.nancheong.databinding.FragmentRecorderBinding;
import com.test.nancheong.ui.home.HomeViewModel;

public class RecorderFragment extends Fragment {

    private RecorderViewModel recorderViewModel;
    private FragmentRecorderBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recorderViewModel =
                new ViewModelProvider(this).get(RecorderViewModel.class);

        binding = FragmentRecorderBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRecorder;
        recorderViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}