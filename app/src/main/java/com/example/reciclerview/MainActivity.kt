package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val recycler by lazy {findViewById<RecyclerView>(R.id.recycler_view)}
    val toolbar by lazy {findViewById<Toolbar>(R.id.toolbar)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val alunos = getAlunos()

        recycler.layoutManager=LinearLayoutManager(this)

        val adapter = AlunosAdapter(alunos)

        recycler.adapter = adapter

    }

    private fun getAlunos():MutableList<Aluno>{
        val alunosList = mutableListOf<Aluno>()

       alunosList.add(Aluno("Bartosz","1", R.drawable.bartosz))
       alunosList.add(Aluno("Elizabeth","2", R.drawable.elizabeth))
       alunosList.add(Aluno("Franziska","3", R.drawable.franziska))
       alunosList.add(Aluno("Hanna","4", R.drawable.hanna))
       alunosList.add(Aluno("Jonas","5", R.drawable.jonas))
       alunosList.add(Aluno("Katharina","6", R.drawable.katharina))
       alunosList.add(Aluno("Magnus","7", R.drawable.magnus))
       alunosList.add(Aluno("Martha","8", R.drawable.martha))
       alunosList.add(Aluno("Mikkel","9", R.drawable.mikkel))
       alunosList.add(Aluno("Noah","10", R.drawable.noah))
        return alunosList
    }
}