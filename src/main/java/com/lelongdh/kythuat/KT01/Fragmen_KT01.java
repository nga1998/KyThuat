package com.lelongdh.kythuat.KT01;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lelongdh.kythuat.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragmen_KT01#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmen_KT01 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    CheckBox ch;
    RecyclerView recyclerView;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    CheckBox ck;
    public Fragmen_KT01() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FootBall.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmen_KT01 newInstance(String param1, String param2) {
        Fragmen_KT01 fragment = new Fragmen_KT01();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    // Using ArrayList to store images data
    ArrayList maso = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5",
            "6", "7", "8"));
    ArrayList noidung = new ArrayList<>(Arrays.asList("Data Structure", "C++", "C#", "JavaScript", "Java",
            "C-Language", "HTML 5", "CSS"));

    ArrayList diemso = new ArrayList<>(Arrays.asList("3", "3", "3", "3", "3",
            "3", "3", "3"));

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }



    private void setContentView(int activity_main) {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmen_kt01, container, false);

        // Getting reference of recyclerView
        recyclerView = view.findViewById(R.id.recyclerView);

        // Setting the layout as linear
        // layout for vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        // Sending reference and data to Adapter
        Adapter adapter = new Adapter(  getApplicationContext(), maso, noidung,diemso);

        // Setting Adapter to RecyclerView
        recyclerView.setAdapter(adapter);

        return view;
    }

    private Context getApplicationContext() {
        return null;
    }
}