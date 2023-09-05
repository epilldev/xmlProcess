package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aplication.xmlProcess.Model.Agente;

import java.util.List;

@Repository
public interface AgenteRepository extends JpaRepository<Agente, Long> {

	// Buscar dados consolidados por região
	@Query("SELECT r.sigla, AVG(r.precoMedio), SUM(r.geracao), SUM(r.compra) FROM Agente a JOIN a.regioes r GROUP BY r.sigla")
	List<Object[]> dadosConsolidadosPorRegiao();

	// Buscar um Agente pelo código
	Agente findByCodigo(String codigo);

	// Buscar Agentes por sigla da região
	List<Agente> findByRegioesSigla(String sigla);
}
