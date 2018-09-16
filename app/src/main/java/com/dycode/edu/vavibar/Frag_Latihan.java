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
public class Frag_Latihan extends Fragment {


    private LinearLayout lat1;
    private LinearLayout lat2;
    private LinearLayout lat3;
    private LinearLayout lat4;

    public Frag_Latihan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag__latihan, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lat1 = (LinearLayout) view.findViewById(R.id.fraglat1);
        lat2 = (LinearLayout) view.findViewById(R.id.fraglat2);
        lat3 = (LinearLayout) view.findViewById(R.id.fraglat3);
        lat4 = (LinearLayout) view.findViewById(R.id.fraglat4);

        lat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_latihan.class);
                getActivity().startActivity(intent);
            }
        });
        lat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_latihan.class);
                getActivity().startActivity(intent);
            }
        });
        lat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_latihan.class);
                getActivity().startActivity(intent);
            }
        });
        lat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_latihan.class);
                getActivity().startActivity(intent);
            }
        });
    }

}
