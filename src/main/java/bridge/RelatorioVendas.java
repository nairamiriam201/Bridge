package bridge;
import java.util.List;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        String titulo = "Relatorio de Vendas";

        List<ItemRelatorio> itensFiltrados = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(itensFiltrados);

        exportador.exportar(titulo, itensFiltrados, total);
    }
}