package pac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pac.models.Journal;


public interface JournalRepository extends JpaRepository<Journal, Long> {
}
