package com.corenetworks.Examen07IoanBobinca;

import com.corenetworks.Examen07IoanBobinca.modelo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen07IoanBobincaApplication implements CommandLineRunner {
	@Autowired
	Factura f1;

	public static void main(String[] args) {
		SpringApplication.run(Examen07IoanBobincaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto("cerveza", 3));
		productos.add(new Producto("cafe", 1.70));
		productos.add(new Producto("refresco", 2.5));

		IImpuesto general = new IvaGeneral();
		IImpuesto reducido = new IvaSuperReducido();


		f1.setImpuesto(general);
		f1.setProductos(productos);
		System.out.println("IVA general " + f1.calcularTotalFactura());
		f1.setImpuesto(reducido);
		System.out.println("IVA reducido " + f1.calcularTotalFactura());

	}
}
