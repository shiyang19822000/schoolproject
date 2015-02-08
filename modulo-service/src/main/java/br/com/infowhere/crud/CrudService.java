package br.com.infowhere.crud;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;


public abstract class CrudService<T> {


    private Class<T> classePersistencia;

    @PersistenceContext
    private EntityManager entityManager;

    public CrudService() {
        this.setClassePersistencia((Class<T>) ((ParameterizedType)
                getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    public T salvar(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public T alterar(T entity) {
        return (T) entityManager.merge(entity);
    }

    public void excluir(T entity){
        entityManager.remove(entity);
    }

    public T buscarPorId(Long id) {
        return (T) entityManager.find(getClassePersistencia(), id);
    }

    public List<T> buscarTodos(){
        return entityManager.createQuery("from " + getClassePersistencia().getName()).getResultList();
    }


    /*Getter e Setter*/

    public Class<T> getClassePersistencia() {
        return classePersistencia;
    }

    public void setClassePersistencia(Class<T> classePersistencia) {
        this.classePersistencia = classePersistencia;
    }

    public EntityManager getEntityManager(){
        return entityManager;
    }

}
