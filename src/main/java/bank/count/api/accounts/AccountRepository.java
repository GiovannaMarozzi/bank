package bank.count.api.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
