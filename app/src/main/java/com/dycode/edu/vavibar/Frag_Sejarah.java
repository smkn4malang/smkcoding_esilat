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
public class Frag_Sejarah extends Fragment {

    private LinearLayout sej1;
    private LinearLayout sej2;
    private LinearLayout sej3;
    private LinearLayout sej4;
    public Frag_Sejarah() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag__sejarah, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sej1 = (LinearLayout) view.findViewById(R.id.fragsej1);
        sej2 = (LinearLayout) view.findViewById(R.id.fragsej2);
        sej3 = (LinearLayout) view.findViewById(R.id.fragsej3);
        sej4 = (LinearLayout) view.findViewById(R.id.fragsej4);

        sej1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_sejarah.class);
                getActivity().startActivity(intent);
            }
        });
        sej2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_sejarah.class);
                getActivity().startActivity(intent);
            }
        });
        sej3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_sejarah.class);
                getActivity().startActivity(intent);
            }
        });
        sej4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), isi_sejarah.class);
                getActivity().startActivity(intent);
            }
        });
    }
}
