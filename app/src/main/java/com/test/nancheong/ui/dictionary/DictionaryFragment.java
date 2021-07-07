package com.test.nancheong.ui.dictionary;

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

import com.test.nancheong.databinding.FragmentDictionaryBinding;
import com.test.nancheong.ui.dictionary.DictionaryViewModel;

public class DictionaryFragment extends Fragment {

    private DictionaryViewModel dictionaryViewModel;
    private FragmentDictionaryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dictionaryViewModel =
                new ViewModelProvider(this).get(DictionaryViewModel.class);

        binding = FragmentDictionaryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.button;
        dictionaryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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