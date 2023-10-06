package practica.spring.crudbasico.servicios;

import practica.spring.crudbasico.modelos.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoServicio {
    List<Producto> obtenerTodosLosProductos();
    Optional<Producto> obtenerProductoPorId(Long id);
    void crearProducto(Producto producto);
    void eliminarProducto(Long id);
}
