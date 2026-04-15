package bridge;

public class Main {
    public static void main(String[] args) {

        ItemRelatorio a = new ItemRelatorio("Produto A", 50);
        ItemRelatorio b = new ItemRelatorio("Produto B", 200);
        ItemRelatorio c = new ItemRelatorio("Produto C", 150);

        Relatorio rel1 = new RelatorioFinanceiro(new ExportadorPDF());
        rel1.adicionarItem(a);
        rel1.adicionarItem(b);
        rel1.adicionarItem(c);
        rel1.gerar(false);

        Relatorio rel2 = new RelatorioFinanceiro(new ExportadorExcel());
        rel2.adicionarItem(a);
        rel2.adicionarItem(b);
        rel2.adicionarItem(c);
        rel2.gerar(true);

        Relatorio rel3 = new RelatorioVendas(new ExportadorPDF());
        rel3.adicionarItem(a);
        rel3.adicionarItem(b);
        rel3.adicionarItem(c);
        rel3.gerar(true);

        Relatorio rel4 = new RelatorioVendas(new ExportadorExcel());
        rel4.adicionarItem(a);
        rel4.adicionarItem(b);
        rel4.adicionarItem(c);
        rel4.gerar(false);
    }
}