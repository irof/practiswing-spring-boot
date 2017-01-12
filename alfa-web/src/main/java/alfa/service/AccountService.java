package alfa.service;

import alfa.domain.Account;
import alfa.spring.data.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author irof
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    @Transactional
    public void register(Account account) {
        repository.createNewAccount(account);
    }
}
