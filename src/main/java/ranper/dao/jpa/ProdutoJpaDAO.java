package ranper.dao.jpa;

import ranper.dao.generic.jpa.GenericJpaDAO;
import ranper.dao.generic.jpa.GenericJpaDB1DAO;
import ranper.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}

