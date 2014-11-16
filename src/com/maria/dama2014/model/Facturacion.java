/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014.model;

import com.maria.dama2014.HibernateSession;
import com.maria.dama2014.db.Prenda;
import com.maria.dama2014.db.Proveedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.hibernate.type.Type;

/**
 *
 * @author Maria
 */
public class Facturacion {

    public List byMonth() {
        Session session = HibernateSession.getSession();
        
        session.beginTransaction();
        Criteria query = session.createCriteria(Prenda.class);
        
        query.setProjection(Projections.projectionList()
                .add(Projections.sqlGroupProjection(
                    //"to_char(fecha_entrada, 'YYYY-MM') as mes", 
                    "trunc(random() * 4 + 1) as mes", 
                    "mes", new String[] { "mes" }, 
                    //new Type[] { new StringType() }))
                    new Type[] { new IntegerType() }))
                .add(Projections.rowCount(), "numPrendas")
                .add(Projections.sum("precioCompra"), "facturas"));
        
        List results = query.list();
        
        System.out.println("Obtengo " + results.size() + " meses");
        
        return results;
    }
    
    
}
