package com.example.lesson6.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson6.R;
import com.example.lesson6.databinding.FragmentDigitBinding;

public class DigitFragment extends Fragment {

    private FragmentDigitBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDigitBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        data();
    }

    private void data() {
        if (getArguments() != null){
            String s = getArguments().getString("key");
            binding.tvTitle.setText(s);
        }
    }
}