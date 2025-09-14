import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto(1, "Gaturro", 7500, "Nik");
        Producto p2 = new Producto(2, "El Misterio del Mayordomo", 4300, "Norma Huidobro");
        Producto p3 = new Producto(3, "Papelucho", 5750, "Marcela Paz");

        List<ProductoDTO> listaDTO = new ArrayList<>();

        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo(p1.getCodigo());
        dto1.setNombre(p1.getNombre());
        dto1.setPrecio(p1.getPrecio());
        listaDTO.add(dto1);

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo(p2.getCodigo());
        dto2.setNombre(p2.getNombre());
        dto2.setPrecio(p2.getPrecio());
        listaDTO.add(dto2);

        ProductoDTO dto3 = new ProductoDTO();
        dto3.setCodigo(p3.getCodigo());
        dto3.setNombre(p3.getNombre());
        dto3.setPrecio(p3.getPrecio());
        listaDTO.add(dto3);

        System.out.println("============================================================================");
        for (ProductoDTO dto : listaDTO) {
            System.out.println(dto);
        }
        System.out.println("============================================================================");
    }
}