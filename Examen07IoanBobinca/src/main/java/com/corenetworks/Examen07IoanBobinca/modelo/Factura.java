package com.corenetworks.Examen07IoanBobinca.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Factura {
    @Autowired

    private IImpuesto impuesto;
    List<Producto> productos;
    public double calcularTotalFactura(){
        double total=0;
        for (Producto elemento:productos
        ) {
            total+=elemento.getPrecio()+impuesto.calcularImpuesto(elemento);
        }
        return total;
    }


}
