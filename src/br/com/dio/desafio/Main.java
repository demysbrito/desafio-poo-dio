/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author demys
 */
public class Main {
    
    public static void main(String[] args) {
        
        Curso c1 = new Curso();
        Curso c2 = new Curso();
        Mentoria m1 = new Mentoria();
        
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();
        
        c1.setTitulo("Java Fundamentos");
        c1.setDescricao("Curso de fundamentos de Java");
        c1.setCargaHoraria(10);
        
        c2.setTitulo("SQL Fundamentos");
        c2.setDescricao("Curso de fundamentos de SQL");
        c2.setCargaHoraria(8);
        
        m1.setTitulo("Mentoria Java");
        m1.setDescricao("Mentoria em Java");
        m1.setData(LocalDate.now());
        
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(m1);
        
        
        Bootcamp bc1 = new Bootcamp();
        bc1.setNome("Bootcamp Java Developer");
        bc1.setDescricao("Descrição Bootcamp Java Developer");
        bc1.getConteudos().add(c1);
        bc1.getConteudos().add(c2);
        bc1.getConteudos().add(m1);
        
        Dev d1 = new Dev();
        d1.setNome("João");
        d1.inscreverBootCamp(bc1);
        
        System.out.println("Dev: " + d1.getNome() + " - Conteúdos inscritos: " + d1.getConteudosInscritos());
        d1.progredir();
        d1.progredir();
        System.out.println("Dev: " + d1.getNome() + " - Conteúdos concluídos: " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularTotalXp());
        System.out.println("Dev: " + d1.getNome() + " - Conteúdos inscritos: " + d1.getConteudosInscritos());

        System.out.println("======================");
        
        Dev d2 = new Dev();
        d2.setNome("José");
        d2.inscreverBootCamp(bc1);
        System.out.println("Dev: " + d2.getNome() + " - Conteúdos inscritos: " + d2.getConteudosInscritos());
        d2.progredir();
        System.out.println("Dev: " + d2.getNome() + " - Conteúdos concluídos: " + d2.getConteudosConcluidos());
        System.out.println("XP: " + d2.calcularTotalXp());
        System.out.println("Dev: " + d2.getNome() + " - Conteúdos inscritos: " + d2.getConteudosInscritos());
        
        
        
        
        
    }
    
}
