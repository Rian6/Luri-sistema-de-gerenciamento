package Conexao;
import java.io.File;
import java.util.Locale;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.NumberFormats;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;
//import jxl.write.*;
import jxl.write.Label;

public class CriarPlanilha {
	
	public CriarPlanilha(String vendedor,String pagamento,String []nome,String []preco,String []codigo,String total) {
		try {
			String filename = "nota.xls";
		      WorkbookSettings ws = new WorkbookSettings();
		      ws.setLocale(new Locale("en", "EN"));
		      WritableWorkbook workbook = Workbook.createWorkbook(new File(filename), ws);
		      WritableSheet s = workbook.createSheet("Folha1", 0);
                      
                      WritableCellFormat cf2 = new WritableCellFormat();
 			      Label Vendedor = new Label(0,0, "Vendedor", cf2);
                              Label Pagamento = new Label(0,1, "Pagamento", cf2);
                              Label VendedorF = new Label(1,0, vendedor, cf2);
                              Label PagamentoF = new Label(1,1, pagamento, cf2);
                              
                              Label tnome = new Label(0,2, "Nome", cf2);
                              Label tpreco = new Label(1,2, "Preço", cf2);
                              Label tcodigo = new Label(2,2, "Código", cf2);
                        s.addCell(VendedorF);
                        s.addCell(PagamentoF);                              
                        s.addCell(Vendedor);
                        s.addCell(Pagamento);
                        s.addCell(tnome);                              
                        s.addCell(tpreco);
                        s.addCell(tcodigo);
                        
                        int cont=0;
		     for(int i=3;i<nome.length+3;i++){
			      Label label0 = new Label(0,i, nome[i-3], cf2);
                              Label label1 = new Label(1,i, preco[i-3], cf2);
                              Label label2 = new Label(2,i, codigo[i-3], cf2);
		      s.addCell(label0);
		      s.addCell(label1);
                      s.addCell(label2);
                      cont=i;
		     }  
                        Label totall = new Label(0,cont+1, "Total", cf2);
                        s.addCell(totall);
                        
                        Label totalv = new Label(1,cont+1, total, cf2);
                        s.addCell(totalv);
                        
		      workbook.write();
		      workbook.close();
		      
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}