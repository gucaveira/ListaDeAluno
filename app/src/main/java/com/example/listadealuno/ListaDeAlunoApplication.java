package com.example.listadealuno;

import android.app.Application;

import com.example.listadealuno.dao.AlunoDAO;
import com.example.listadealuno.model.Aluno;

public class ListaDeAlunoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AlunoDAO dao = new AlunoDAO();

        criaAlunoTest(dao);
    }

    private void criaAlunoTest(AlunoDAO dao) {
        dao.salva(new Aluno("Alex", "1122223333", "alex@gmail.com"));
        dao.salva(new Aluno("Fran", "1122223333", "fran@gmail.com"));
    }
}
