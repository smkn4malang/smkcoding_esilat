package com.dycode.edu.vavibar;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Seni extends Fragment {

    private LinearLayout sen1;
    private LinearLayout sen2;
    private LinearLayout sen3;
    private LinearLayout sen4;

    public Frag_Seni() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag__seni, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sen1 = (LinearLayout) view.findViewById(R.id.fragseni1);
        sen2 = (LinearLayout) view.findViewById(R.id.fragseni2);
        sen3 = (LinearLayout) view.findViewById(R.id.fragseni3);
        sen4 = (LinearLayout) view.findViewById(R.id.fragseni4);

        sen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_seni.class);
                getActivity().startActivity(intent);
            }
        });
        sen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_seni.class);
                getActivity().startActivity(intent);
            }
        });
        sen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_seni.class);
                getActivity().startActivity(intent);
            }
        });
        sen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_seni.class);
                getActivity().startActivity(intent);
            }
        });

    }
}
