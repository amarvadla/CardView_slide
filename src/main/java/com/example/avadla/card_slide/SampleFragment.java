package com.example.avadla.card_slide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {


    public SampleFragment() {
        // Required empty public constructor
    }

    public static SampleFragment newInstance(String coins){
        SampleFragment sampleFragment = new SampleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("coins",coins);
        sampleFragment.setArguments(bundle);
        return sampleFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        Bundle bundle = getArguments();
        TextView textView = (TextView) view.findViewById(R.id.no_of_coins);
        textView.setText(bundle.getString("coins"));
        return view;
    }

}
