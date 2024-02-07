package com.corenetworks.Examen07IoanBobinca.modelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("iG")
@Primary
public class IvaGeneral implements IImpuesto{

    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*0.21;
    }
}
