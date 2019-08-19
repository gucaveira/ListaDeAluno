package com.example.listadealuno.dao;

import com.example.listadealuno.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    private final static List<Aluno> alunos = new ArrayList<>();
    private static int contadorDeIds = 1;

    public void salva(Aluno aluno){
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
    }

}
