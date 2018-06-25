package persol.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persol.oracle.domain.TMST207;
import persol.oracle.repository.TMST207Repository;

@Service
public class TMST207ServiceImpl implements TMST207Service {

    private TMST207Repository tmst207Repository;

    @Autowired
    public TMST207ServiceImpl(TMST207Repository tmst207Repository) {
        this.tmst207Repository = tmst207Repository;
    }

    @Override
	public List<TMST207> listAll() {
        List<TMST207> tmst207 = new ArrayList<>();
        tmst207Repository.findAll();
        return tmst207;
	}

}