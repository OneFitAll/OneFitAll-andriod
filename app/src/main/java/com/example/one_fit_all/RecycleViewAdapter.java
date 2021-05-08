package com.example.one_fit_all;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    List<WorkoutModel> everything;
    Context context;

    public RecycleViewAdapter(List<WorkoutModel> everything, Context context) {
        this.everything = everything;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_workout_grid, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_ID.setText(String.valueOf(everything.get(position).getId()));
        holder.tv_MuscleGroup.setText(everything.get(position).getmGroup());
        holder.tv_ExerciseType.setText(everything.get(position).geteType());
        holder.tv_Sets.setText(String.valueOf(everything.get(position).getSetAmount()));
        holder.tv_Reps.setText(String.valueOf(everything.get(position).getRepAmount()));
        holder.tv_Weight.setText(String.valueOf(everything.get(position).getwAmount()));


    }

    @Override
    public int getItemCount() {
        return everything.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_ID;
        TextView tv_MuscleGroup;
        TextView tv_ExerciseType;
        TextView tv_Sets;
        TextView tv_Reps;
        TextView tv_Weight;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_ID = itemView.findViewById(R.id.tv_ID);
            tv_MuscleGroup = itemView.findViewById(R.id.tv_MuscleGroup);
            tv_ExerciseType = itemView.findViewById(R.id.tv_ExerciseType);
            tv_Sets = itemView.findViewById(R.id.tv_Sets);
            tv_Reps = itemView.findViewById(R.id.tv_Reps);
            tv_Weight = itemView.findViewById(R.id.tv_Weight);
        }
    }
}
