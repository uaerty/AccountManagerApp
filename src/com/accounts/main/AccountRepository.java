package com.accounts.main;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends CrudRepository<Account, Long> {
	
	@Query(value = "SELECT c FROM Account c WHERE c.customerfname LIKE '%' || :keyword || '%'"
			+ " OR c.customerlname LIKE '%' || :keyword || '%'"
			+ " OR c.customerAddress LIKE '%' || :keyword || '%'"
			+ " OR c.customerAccountNumber LIKE '%' || :keyword || '%'"
			+ " OR c.customerSavings LIKE '%' || :keyword || '%'")
	public List<Account> search(@Param("keyword") String keyword);
}
