package com.android.testeviews;

public class Cardapio {
    private String comida;
    private String preco;
    private String img;

    public Cardapio(String comida, String preco, String img) {
        this.comida = comida;
        this.preco = preco;
        this.img = img;
    }

    public String getComida() {
        return comida;
    }

    public void setNome(String nome) {
        this.comida = comida;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }



    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
