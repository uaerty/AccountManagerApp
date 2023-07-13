package com.accounts.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountService {
	@Autowired AccountRepository repo;
	
	public void save(Account account) {
		repo.save(account);
	}
	
	public List<Account> listAll() {
		return (List<Account>) repo.findAll();
	}
	
	public Account get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Account> search(String keyword) {
		return repo.search(keyword);
	}
}
