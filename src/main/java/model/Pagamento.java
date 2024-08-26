package model;

import java.util.Date;

public class Pagamento {

    private Date data;
    private float valor;
    private long id;

    @Override
    public String toString() {
        return "Pagamento{" +
                "data=" + data +
                ", valor=" + valor +
                ", id=" + id +
                '}';
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
