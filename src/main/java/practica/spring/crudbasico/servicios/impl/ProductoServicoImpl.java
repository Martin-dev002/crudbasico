package practica.spring.crudbasico.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practica.spring.crudbasico.modelos.Producto;
import practica.spring.crudbasico.repositorios.ProductoRepositorio;
import practica.spring.crudbasico.servicios.ProductoServicio;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoServicoImpl implements ProductoServicio {

    @Autowired
    ProductoRepositorio productoRepositorio;
    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepositorio.findAll();
    }
    @Override
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productoRepositorio.findById(id);
    }
    @Override
    public void crearProducto(Producto producto) {
        productoRepositorio.save(producto);
    }
    @Override
    public void eliminarProducto(Long id) {
        productoRepositorio.deleteById(id);
    }
}
