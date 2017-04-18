package depeloper.fragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import depeloper.fragment.R;
import depeloper.fragment.adapter.ChattingAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class Chatting extends Fragment {
    private ListView listView;
    String[] nama={"Wamba","Aiz","Chandra"};
    String[] telp={"0857","0812","0877"};
    Integer[]image={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};


    public Chatting() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chatting,container,false);
        ChattingAdapter adapter=new ChattingAdapter(getActivity(),nama,telp,image);
        listView=(ListView)view.findViewById(R.id.lv_chatting);
        listView.setAdapter(adapter);
        return view;
    }

}
