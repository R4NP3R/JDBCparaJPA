package ranper.dao.jpa;

import ranper.dao.generic.jpa.IGenericJpaDAO;
import ranper.domain.jpa.ClienteJpa;
import ranper.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}

