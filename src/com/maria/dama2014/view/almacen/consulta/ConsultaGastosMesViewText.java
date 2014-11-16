/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.view.almacen.consulta;

import com.maria.dama2014.model.Facturacion;
import java.awt.Frame;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author Maria
 */
public class ConsultaGastosMesViewText {

    Facturacion fact = new Facturacion();

    //@Override
    public void run() {

        List result = fact.byMonth();
        double[] x = new double[result.size()];
        double[] y= new double[result.size()];

        for (int j = 0; j < result.size(); j++) {
            Object[] reg = (Object[]) result.get(j);
            x[j] = (double) (int) reg[0];
            y[j] = (double) (int) reg[1];

            for (int i = 0; i < reg.length; i++) {
                System.out.println("Elemento " + i + ": " + reg[i]);
            }
        }
        DefaultXYDataset dds = new DefaultXYDataset();
        double[][] data = {x, y};
      
        dds.addSeries("series1", data);
        
        XYDataset ds = dds;
        
        DefaultCategoryDataset dcds = new DefaultCategoryDataset();
        for (int i=0; i<x.length; i++){
            dcds.addValue(y[i], "Compras", x[i]+"");
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Test Chart",
                "mes", "Compras", dcds, PlotOrientation.VERTICAL, true, true,
                false);
        ChartPanel cp = new ChartPanel(chart);

        Frame f = new Frame("Grafico");
        //f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.add(cp);
        f.pack();
        f.setVisible(true);
        
    }
}