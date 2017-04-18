package depeloper.fragment.adapter;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import depeloper.fragment.R;

/**
 * Created by G on 18/04/2017.
 */

public class ChattingAdapter extends ArrayAdapter <String> {

    private final Activity activity;
    private final String[] telp;
    private final String[] name;
    private final Integer[] image;

    public ChattingAdapter(Activity activity, String[] name, String[] telp, Integer[] image){
        super(activity, R.layout.chatting_list, name);
        this.activity=activity;
        this.name=name;
        this.image=image;
        this.telp=telp;
    }
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.chatting_list,null,true);
        TextView tvNama = (TextView)rowView.findViewById(R.id.tv_nama);
        TextView tvNomor = (TextView)rowView.findViewById(R.id.tv_nomor);
        ImageView Images = (ImageView)rowView.findViewById(R.id.img);

        tvNama.setText(name[position]);
        tvNomor.setText(telp[position]);
        Images.setImageResource(image[position]);

        return rowView;
    }
}
