 package com.example.lesson6.fragments.car_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson6.MainActivity;
import com.example.lesson6.R;
import com.example.lesson6.databinding.FragmentCarBinding;

 public class CarFragment extends Fragment {

    private FragmentCarBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCarBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

     @Override
     public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);
         setupListener();
     }

     private void setupListener() {
         binding.btnOpenLocation.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String s = binding.etInput.getText().toString().trim();
                 Bundle bundle = new Bundle();
                 bundle.putString("key",s);
                 Navigation.findNavController(view).navigate(R.id.digitFragment,bundle);
            }
        });

     }
     public void onDestroyView() {
         super.onDestroyView();
         binding = null;
     }
 }