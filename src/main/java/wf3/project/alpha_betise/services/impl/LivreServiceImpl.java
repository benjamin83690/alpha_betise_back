package wf3.project.alpha_betise.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wf3.project.alpha_betise.dtos.LivreDto;
import wf3.project.alpha_betise.mappers.LivreMapper;
import wf3.project.alpha_betise.repositories.LivreRepository;
import wf3.project.alpha_betise.services.LivreService;

@Service
@Transactional
public class LivreServiceImpl implements LivreService {

    @Autowired
    private LivreRepository livreRepository;

	@Autowired
	private LivreMapper livreMapper;

    @Override
	public List<LivreDto> getAll() {
		return livreMapper.toDtos(livreRepository.findAll());
    }

    @Override
	public LivreDto get(Long id) throws Exception {
		return livreMapper.toDto(livreRepository.findById(id).orElseThrow(() -> new Exception("Livre introuvable")));
    }

    @Override
	public LivreDto post(LivreDto livre) {
		return livreMapper.toDto(livreRepository.save(livreMapper.toEntity(livre)));
    }

    @Override
    public void delete(Long id) {
        livreRepository.deleteById(id);
    }
}
