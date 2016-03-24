package com.vn.coderschool.recyclerexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by charles on 3/24/16.
 */
public class StudentsAdapter extends
        RecyclerView.Adapter<StudentsAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView tvName;
        public TextView tvGithub;

        public ViewHolder(View view) {
            super(view);

            tvName = (TextView) view.findViewById(R.id.tvName);
            tvGithub = (TextView) view.findViewById(R.id.tvGithub);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), tvName.getText(), Toast.LENGTH_SHORT).show();
        }
    }

    private List<Student> mStudents;

    public StudentsAdapter(List<Student> students) {
        mStudents = students;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View studentView = inflater.inflate(R.layout.student_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(studentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StudentsAdapter.ViewHolder holder, int position) {
        Student student = mStudents.get(position);

        holder.tvName.setText(student.getName());
        holder.tvGithub.setText(student.getGithub());
    }

    @Override
    public int getItemCount() {
        if (mStudents == null) {
            return 0;
        }
        return mStudents.size();
    }
}
