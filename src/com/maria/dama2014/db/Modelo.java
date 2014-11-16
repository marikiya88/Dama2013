package com.maria.dama2014.db;

// Generated 17-sep-2013 0:44:35 by Hibernate Tools 3.2.1.GA
import com.maria.dama2014.HibernateSession;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * Modelo generated by hbm2java
 */
public class Modelo implements java.io.Serializable {

    private int id;
    private Proveedor proveedor;
    private Categoria categoria;
    private TipoTalla tipoTalla;
    private Temporada temporada;
    private String codigo;
    private String descripcion;
    private Date fechaAlta;
    private Set prendas = new HashSet(0);
    private Set tallajes = new HashSet(0);
    private Set coloridos = new HashSet(0);

    public Modelo() {
    }

    public Modelo(int id, Proveedor proveedor, Categoria categoria, TipoTalla tipoTalla, Temporada temporada, String codigo, String descripcion) {
        this.id = id;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.tipoTalla = tipoTalla;
        this.temporada = temporada;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Modelo(int id, Proveedor proveedor, Categoria categoria, TipoTalla tipoTalla, Temporada temporada, String codigo, String descripcion, Date fechaAlta, Set prendas, Set tallajes, Set coloridos) {
        this.id = id;
        this.proveedor = proveedor;
        this.categoria = categoria;
        this.tipoTalla = tipoTalla;
        this.temporada = temporada;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.prendas = prendas;
        this.tallajes = tallajes;
        this.coloridos = coloridos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public TipoTalla getTipoTalla() {
        return this.tipoTalla;
    }

    public void setTipoTalla(TipoTalla tipoTalla) {
        this.tipoTalla = tipoTalla;
    }

    public Temporada getTemporada() {
        return this.temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Set getPrendas() {
        return this.prendas;
    }

    public void setPrendas(Set prendas) {
        this.prendas = prendas;
    }

    public Set getTallajes() {
        return this.tallajes;
    }

    public void setTallajes(Set tallajes) {
        this.tallajes = tallajes;
    }

    public Set getColoridos() {
        return this.coloridos;
    }

    public void setColoridos(Set coloridos) {
        this.coloridos = coloridos;
    }
    
    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", proveedor=" + proveedor + ", categoria=" + categoria + 
                ", temporada=" + temporada + ", codigo=" + codigo + ", descripcion=" + descripcion + 
                ", fechaAlta=" + fechaAlta.toString() + ", prendas=" + prendas + 
                ", talla=" + "cambiar_esto" + '}';
    }
        
    public void newModelo() {
        Session session = HibernateSession.getSession();
        session.beginTransaction();
        Serializable nuevoId = session.save(this);
        session.getTransaction().commit();

        System.out.println("He insertado bien con identificador " + nuevoId);
    }
    
    public void updateModelo() {
        Session session = HibernateSession.getSession();

        session.beginTransaction();
        session.update(this);
        session.getTransaction().commit();

        System.out.println("He actualizado");
    }

    public List<Modelo> listModelos() {
        Session session = HibernateSession.getSession();
        session.beginTransaction();

        List<Modelo> modelos = session.createQuery("from Modelo order by id").list();

        return modelos;
    }
    
    /***** FIND ***************/
    public List<Modelo> findByCode(String s) {
        String pattern = "%" + s + "%";

        Session session = HibernateSession.getSession();
        session.beginTransaction();

        List models = session.createCriteria(Modelo.class)
                .add(Restrictions.ilike("codigo", pattern)).list();

        return models;
    }

    public List<Modelo> findByProvName(String s) {
        String pattern = "%" + s + "%";

        Session session = HibernateSession.getSession();
        session.beginTransaction();

        List models = session.createCriteria(Modelo.class)
                .add(Restrictions.ilike("proveedor.nombre", pattern)).list();

        return models;
    }

    public List<Modelo> findByDescripcion(String s) {
        String pattern = "%" + s + "%";

        Session session = HibernateSession.getSession();
        session.beginTransaction();

        List models = session.createCriteria(Modelo.class)
                .add(Restrictions.ilike("descripcion", pattern)).list();

        return models;
    }

    public List<Modelo> findByFamilia(String s) {
        String pattern = "%" + s + "%";

        Session session = HibernateSession.getSession();
        session.beginTransaction();

        List models = session.createCriteria(Modelo.class)
                .createCriteria("categoria")
                .add(Restrictions.ilike("descripcion", pattern)).list();

        return models;
    }
}
