package ranper.dao.jpa;

import ranper.dao.generic.jpa.GenericJpaDAO;
import ranper.dao.generic.jpa.GenericJpaDB1DAO;
import ranper.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}