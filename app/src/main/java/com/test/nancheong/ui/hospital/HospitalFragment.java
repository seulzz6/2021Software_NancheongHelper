package com.test.nancheong.ui.hospital;

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

import com.test.nancheong.databinding.FragmentHospitalBinding;
import com.test.nancheong.ui.hospital.HospitalViewModel;

public class HospitalFragment extends Fragment {

    private HospitalViewModel hospitalViewModel;
    private FragmentHospitalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hospitalViewModel =
                new ViewModelProvider(this).get(HospitalViewModel.class);

        binding = FragmentHospitalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHospital;
        hospitalViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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