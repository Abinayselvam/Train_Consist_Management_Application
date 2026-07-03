package org.example.model;

public class GoodsBogie {
    public String bogieId;
    public String shape;
    public String cargo;
    public GoodsBogie(String bogieId, String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
    }
    public String getBogieId() {
        return  bogieId;
    }
    public String getShape() {
        return shape;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return bogieId + "Shape: " + shape + "Cargo: " + cargo;
    }
}
