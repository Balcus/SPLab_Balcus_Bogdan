package ro.uvt.info.sp_lab_2025.persistance;

import org.springframework.stereotype.Component;
import ro.uvt.info.sp_lab_2025.models.Author;

import java.util.List;
import java.util.Optional;

@Component
public class AuthorRepositoryAdapter implements CrudRepository<Author, Integer> {

    private final AuthorRepository authorRepository;

    public AuthorRepositoryAdapter(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author save(Author entity) {
        return authorRepository.save(entity);
    }

    @Override
    public Optional<Author> findById(Integer id) {
        return authorRepository.findById(id);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        authorRepository.deleteById(id);
    }
}