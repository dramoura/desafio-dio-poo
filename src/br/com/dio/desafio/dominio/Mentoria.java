package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteúdo {
    private String titulo;
    private String descricao;
    private String cargaHoraria;
    private LocalDate data;



    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", data=" + data +
                '}';
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
