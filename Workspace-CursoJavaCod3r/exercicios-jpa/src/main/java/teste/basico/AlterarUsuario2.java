package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Gabriella Alterado");
		
		//em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		// Aqui o objeto está num modo gerenciado. Então toda e qualquer alteração feita ele vai
		// sincronizar com o Banco de Dados
	}
}
