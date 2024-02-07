package com.corenetworks.Examen07IoanBobinca.modelo;

import org.springframework.stereotype.Component;

@Component("iSr")
public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.04;
    }
}
