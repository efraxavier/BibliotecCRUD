package com.example.bibliotecacrud.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.bibliotecacrud.model.Exemplar;
import com.example.bibliotecacrud.model.ICRUDDao;

public class InsertFragment extends Fragment {
    private EditText editText;
    private Button submitButton;
    private TextView resultTextView;
    private ICRUDDao<Exemplar> exemplarDao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_insert, container, false);
        editText = view.findViewById(R.id.edit_text);
        submitButton = view.findViewById(R.id.submit_button);
        resultTextView = view.findViewById(R.id.result_text_view);

        submitButton.setOnClickListener(v -> {
            // Collect input data and create a new Exemplar (e.g., Livro or Revista)
            String input = editText.getText().toString();
            Exemplar exemplar = new Livro(input, false, "123-456", "Sample Title", "Author Name");
            try {
                exemplarDao.insert(exemplar);
                resultTextView.setText("Insert successful: " + exemplar);
            } catch (SQLException e) {
                resultTextView.setText("Insert failed: " + e.getMessage());
            }
        });

        return view;
    }
}
