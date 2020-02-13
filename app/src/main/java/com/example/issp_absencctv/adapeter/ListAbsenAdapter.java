package com.example.issp_absencctv.adapeter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.issp_absencctv.R;
import com.example.issp_absencctv.model.Absen;

import java.util.List;

public class ListAbsenAdapter extends RecyclerView.Adapter<ListAbsenAdapter.MyViewHolder> {

    private Context context;
    private List<Absen> absenList;

    public ListAbsenAdapter(Context mContext, List<Absen> absenList){
        this.context = mContext;
        this.absenList = absenList;

    }
    @NonNull
    @Override
    public ListAbsenAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list_absen, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAbsenAdapter.MyViewHolder holder, int position) {
        holder.tvNamaKaryawan.setText(absenList.get(position).getNama());
        holder.tvNikKaryawan.setText(absenList.get(position).getNik());
        holder.tvJamMasukReportPribadi.setText(absenList.get(position).getStatus());
        if (absenList.get(position).getStatus().equals("Black List")){
            holder.tvJamMasukReportPribadi.setTextColor(Color.RED);
            holder.ivAbsenPribadi.setImageResource(R.drawable.blank_donald);
        }
//        holder.tvTanggalAbsen.setText(absenList.get(position).getJam_masuk());

//        holder.tvJamMasukReportPribadi.setText(absenList.get(position).getJam_masuk());
//        holder.ivAbsenPribadi.setImageBitmap(StringToBitMap(absenList.get(position).getSelfie()));
    }

    @Override
    public int getItemCount() {
        return this.absenList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private ImageView ivAbsenPribadi;
        private TextView tvNamaKaryawan, tvNikKaryawan, tvJababatanKaryawan,
                tvJamMasukReportPribadi, tvTanggalAbsen;
        public MyViewHolder(View v) {
            super(v);
            ivAbsenPribadi = (ImageView) v.findViewById(R.id.ivAbsenPribadi);
            tvNamaKaryawan = (TextView) v.findViewById(R.id.tvNamaKaryawan);
            tvNikKaryawan = (TextView) v.findViewById(R.id.tvNikKaryawan);
            tvJababatanKaryawan = (TextView) v.findViewById(R.id.tvJababatanKaryawan);
            tvJamMasukReportPribadi = (TextView) v.findViewById(R.id.tvJamMasuk);
            tvTanggalAbsen = (TextView) v.findViewById(R.id.tvTanggalAbsen);
        }
    }
}
