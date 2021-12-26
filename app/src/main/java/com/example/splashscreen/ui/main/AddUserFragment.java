package com.example.splashscreen.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.splashscreen.R;
import com.example.splashscreen.databinding.FragmentAddUserBinding;


public class AddUserFragment extends Fragment {

    public FragmentAddUserBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return FragmentAddUserBinding.inflate(getLayoutInflater()).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding=FragmentAddUserBinding.bind(view);
    }
}