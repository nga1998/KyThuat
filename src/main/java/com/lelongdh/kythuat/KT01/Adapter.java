package com.lelongdh.kythuat.KT01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lelongdh.kythuat.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList maso, noidung,diemso;
    Context context;

    // Constructor for initialization
    public Adapter(Context context, ArrayList maso, ArrayList noidung,ArrayList diemso) {
        this.context = context;
        this.maso = maso;
        this.noidung = noidung;
        this.diemso = diemso;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the Layout(Instantiates list_item.xml
        // layout file into View object)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        // Passing view to ViewHolder
        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        // TypeCast Object to int type

        holder.tx_maso.setText((String) maso.get(position));
        holder.tx_noidung.setText((String) noidung.get(position));
        holder.tx_diemso.setText((String) diemso.get(position));
        holder.mCheckedTextView.setOnCheckedChangeListener(null);

        holder.mCheckedTextView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    buttonView.setSelected(true);
                }else {
                    buttonView.setSelected(false);
                }
            }
        });
        holder.mCheckedTextView.setChecked(holder.mCheckedTextView.isSelected());
    }

    @Override
    public int getItemCount() {
        return maso.size();
    }

    /*@Override
    public int getItemCount() {
        // Returns number of items
        // currently available in Adapter
        //return maso.size();
        return 0;
    }*/
    // Initializing the Views
    public class ViewHolder extends RecyclerView.ViewHolder  {

        CheckBox mCheckedTextView;
        ImageView images;
        TextView tx_maso,tx_noidung,tx_diemso;

        public ViewHolder(View view) {
            super(view);
            //images = (ImageView) view.findViewById(R.id.maso);
            tx_maso = (TextView) view.findViewById(R.id.maso);
            tx_noidung = (TextView) view.findViewById(R.id.noidung);
            tx_diemso = (TextView) view.findViewById(R.id.diemso);
            mCheckedTextView = (CheckBox) view.findViewById(R.id.checkBox);

            //view.setOnClickListener(this);
        }




    }
}
