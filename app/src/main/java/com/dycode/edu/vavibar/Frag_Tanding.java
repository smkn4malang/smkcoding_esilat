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
public class Frag_Tanding extends Fragment {

    private LinearLayout tan1;
    private LinearLayout tan2;
    private LinearLayout tan3;
    private LinearLayout tan4;

    public Frag_Tanding() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag__tanding, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tan1 = (LinearLayout) view.findViewById(R.id.fragtan1);
        tan2 = (LinearLayout) view.findViewById(R.id.fragtan2);
        tan3 = (LinearLayout) view.findViewById(R.id.fragtan3);
        tan4 = (LinearLayout) view.findViewById(R.id.fragtan4);

        tan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_tanding.class);
                getActivity().startActivity(intent);
            }
        });
        tan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_tanding.class);
                getActivity().startActivity(intent);
            }
        });
        tan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_tanding.class);
                getActivity().startActivity(intent);
            }
        });
        tan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_tanding.class);
                getActivity().startActivity(intent);
            }
        });

    }

}
