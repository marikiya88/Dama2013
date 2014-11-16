/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.model;

import com.maria.dama2014.HibernateSession;
import com.maria.dama2014.db.Proveedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.Type;

/**
 *
 * @author Maria
 */
public class ProveedorStats {

    private int id;
    private String nombre;
    private int numModelos;
    private int numPrendas;
    private double facturas;
    private double precioMedio;
    
    public void getFacturacion() {
        
        Session session = HibernateSession.getSession();
        
        session.beginTransaction();
        Criteria query = session.createCriteria(Proveedor.class);
        query.createAlias("modelos", "modelo");
        query.createAlias("modelos.prendas", "prenda");
        
        Projection vendido = Projections.sqlProjection(
                "sum(case when prenda.precioVentaActual = 6 then prenda.precioVentaActual else 0 end)", 
                new String[] { "facturas" }, new Type[] {new DoubleType()});
                
//                Restrictions.eq("state", "VENDIDO"), Projections.property("precio_actual"), Projections.constant(0));
//        Conditional stockPrendas = Projections.Conditional(
//                Restrictions.eq("state", "STOCK"),  Projections.Constant(1), Projections.Constant(0));
//        Conditional stockFactura = Projections.Conditional(
//                Restrictions.eq("state", "STOCK"), Projections.property("precio_compra"), Projections.Constant(0));
//        Conditional stockFacturacion = Projections.Conditional(
//                Restrictions.eq("state", "STOCK"), Projections.property("precio_actual"), Projections.Constant(0));         
//         
        query.setProjection(Projections.projectionList()
                .add(Projections.groupProperty("id"))
                .add(Projections.groupProperty("nombre"))
                .add(Projections.property("id"), "id")
                .add(Projections.property("nombre"), "nombre")
                .add(Projections.countDistinct("modelo.id"), "numModelos")
                .add(Projections.rowCount(), "numPrendas")
                .add(Projections.sum("prenda.precioCompra"), "facturas") 
                //.add(Projections.sum("case when prenda.precioVentaActual = 6 then prenda.precioVentaActual else 0 end"), "facturas")
                //.add(Projections.sum(vendido), "facturacionAnual")
                //.add(Projections.sum(stockPrendas), "prendasStock")
                //.add(Projections.sum(stockFactura), "stockFactura")
                //.add(Projections.sum(stockFacturacion), "stockFacturacion")
                .add(Projections.avg("prenda.precioVentaActual"), "precioMedio"))
                .addOrder(Order.asc("id"));
        
        query.setResultTransformer(Transformers.aliasToBean(ProveedorStats.class));
          
        List<ProveedorStats> results = query.list();

        System.out.println("Recibidos " + results.size() + " elementos");
        for (ProveedorStats p : results){
            System.out.println("Id: " + p.id +
                    " Nombre: " + p.nombre +
                    " Num Modelos: " + p.numModelos +
                    " Num Prendas: " + p.numPrendas +
                    " Facturas: " + p.facturas +
                    " Precio medio: " + p.precioMedio);
        }
        
        return;


        /**
         * select proveedor.id, proveedor.name , count(distinct modelo_id)
         * num_modelos , count(*) num_prendas , sum(precio_compra) facturas ,
         * sum(case when prenda.state = 'VENDIDO' then precio_venta else 0 end)
         * facturacion_actual , sum(case when prenda.state = 'STOCK' then 1 else
         * 0 end) prendas_stock , sum(case when prenda.state = 'STOCK' then
         * precio_compra else 0 end) factura_stock , sum(case when prenda.state
         * = 'STOCK' then precio_venta else 0 end) futura_facturacion_stock ,
         * avg(precio_venta) precio_medio from proveedor join modelo on
         * modelo.proveedor_id = proveedor.id join prenda p on prenda.modelo_id
         * = modelo.id group by proveedor.id, proveedor.name
         */
    }
    
    public void getFacturacion(int idProv) {
        
        Session session = HibernateSession.getSession();
        
        session.beginTransaction();
        Criteria query = session.createCriteria(Proveedor.class);
        query.createAlias("modelos", "modelo");
        query.createAlias("modelos.prendas", "prenda");
        
//        Conditional vendido = Projections.Conditional(
//                Restrictions.eq("state", "VENDIDO"), Projections.property("precio_actual"), Projections.constant(0));
//        Conditional stockPrendas = Projections.Conditional(
//                Restrictions.eq("state", "STOCK"),  Projections.Constant(1), Projections.Constant(0));
//        Conditional stockFactura = Projections.Conditional(
//                Restrictions.eq("state", "STOCK"), Projections.property("precio_compra"), Projections.Constant(0));
//        Conditional stockFacturacion = Projections.Conditional(
//                Restrictions.eq("state", "STOCK"), Projections.property("precio_actual"), Projections.Constant(0));         
//         
        query.add(Restrictions.eq("id", idProv))
                .setProjection(
                Projections.projectionList()
                .add(Projections.property("id"), "id2")
                .add(Projections.property("nombre"), "nombre2")
                .add(Projections.groupProperty("id"))
                .add(Projections.groupProperty("nombre"))
                .add(Projections.countDistinct("modelo.id"), "numModelos")
                .add(Projections.rowCount(), "numPrendas")
                .add(Projections.sum("prenda.precioCompra"), "facturas") 
                //.add(Projections.sum(vendido), "facturacionAnual")
                //.add(Projections.sum(stockPrendas), "prendasStock")
                //.add(Projections.sum(stockFactura), "stockFactura")
                //.add(Projections.sum(stockFacturacion), "stockFacturacion")
                .add(Projections.avg("prenda.precioVentaActual"), "precioMedio"))
                .addOrder(Order.asc("id"));
        
        query.setResultTransformer(Transformers.aliasToBean(ProveedorStats.class));
          
        List<ProveedorStats> results = query.list();

        System.out.println("Recibidos " + results.size() + " elementos");
        for (ProveedorStats p : results){
            System.out.println("Id: " + p.id +
                    " Nombre: " + p.nombre +
                    " Num Modelos: " + p.numModelos +
                    " Num Prendas: " + p.numPrendas +
                    " Facturas: " + p.facturas +
                    " Precio medio: " + p.precioMedio);
        }
        
        return;
    }
}
