package com.isil.p1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {

    public static final ArrayList<Trabajo> trabajos = new ArrayList<>();
    RecyclerView rvTrabajo;
    Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Datos de Trabajo
        trabajos.add(new Trabajo(getString(R.string.trabajo1_nombre), getString(R.string.trabajo1_descripcion), 130.00, R.drawable.trabajoaltura));
        trabajos.add(new Trabajo(getString(R.string.trabajo2_nombre), getString(R.string.trabajo2_descripcion), 430.00, R.drawable.trabajoelectrico));
        trabajos.add(new Trabajo(getString(R.string.trabajo3_nombre), getString(R.string.trabajo3_descripcion), 200.00, R.drawable.trabajomanejo));
        trabajos.add(new Trabajo(getString(R.string.trabajo4_nombre), getString(R.string.trabajo4_descripcion), 150.00, R.drawable.trabajoprimero));

        rvTrabajo = findViewById(R.id.rvTrabajo);
        btnRegresar = findViewById(R.id.btnRegresar);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvTrabajo.setLayoutManager(layoutManager);

        TrabajoAdapter adapter = new TrabajoAdapter(this,trabajos);
        rvTrabajo.setAdapter(adapter);
        btnRegresar.setOnClickListener(view -> {
            startActivity(new Intent(this,LoginActivity.class));
        });
    }
}
