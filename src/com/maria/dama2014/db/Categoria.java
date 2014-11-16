package com.maria.dama2014.db;

// Generated 17-sep-2013 0:44:35 by Hibernate Tools 3.2.1.GA
import com.maria.dama2014.HibernateSession;
import com.maria.dama2014.model.ProveedorStats;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

    private int id;
    private String descripcion;
    private Set modelos = new HashSet(0);

    public String[] getFieldNames() {
        return new String[]{"Id", "Descripcion"};
    }

    public Object[] getFieldValues() {

        Field[] fields = this.getClass().getDeclaredFields();
        Object[] o = new Object[fields.length];

        for (int i = 0; i < fields.length; i++) {
            try {
                o[i] = fields[i].get(this);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return o;
    }
    
    public Categoria() {
    }

    public Categoria(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Categoria(int id, String descripcion, Set modelos) {
        this.id = id;
        this.descripcion = descripcion;
        this.modelos = modelos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set getModelos() {
        return this.modelos;
    }

    public void setModelos(Set modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString(){
        return "Categoria{" + "id=" + id + ", Descripcion=" + descripcion +'}';
    }
    
    public void newCategoria() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Serializable nuevoId = session.save(this);
        session.getTransaction().commit();

        System.out.println("He insertado bien con identificador " + nuevoId);
    }

    public List<Categoria> listCategorias() {
        Session session = HibernateSession.getSession();
        session.beginTransaction();

        List<Categoria> cats = session.createQuery("from Categoria").list();

        return cats;
    }
    
    public Categoria get(int id) {
        Session session = HibernateSession.getSession();
        session.beginTransaction();

        Categoria temp = (Categoria) session.get(Categoria.class, id);
        session.getTransaction().commit();
        
        return temp;
    }
    
    public List<Categoria> get(List<Integer> ids) {
        Session session = HibernateSession.getSession();
        session.beginTransaction();

        Criteria query = session.createCriteria(Categoria.class)
                .add(Restrictions.in("id", ids.toArray()));
        query.setResultTransformer(Transformers.aliasToBean(Categoria.class));

        return query.list();
    }

}
