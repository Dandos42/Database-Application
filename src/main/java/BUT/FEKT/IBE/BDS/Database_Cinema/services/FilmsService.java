package BUT.FEKT.IBE.BDS.Database_Cinema.services;

/**
 * @author Daniel Prachař
 * @creatin_date 22.12.2022
 */

import BUT.FEKT.IBE.BDS.Database_Cinema.data.FilmsRepository;
import BUT.FEKT.IBE.BDS.Database_Cinema.database.*;

import java.util.List;

public class FilmsService {

    private FilmsRepository filmsRepository;

    public FilmsService(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }
    public List<FilmsView> getFilmsView() {return filmsRepository.getFilmsView();}

    //Create movie
    public void CreateFilm(FilmCreateView filmCreateView) {

        filmsRepository.CreateFilm(filmCreateView);
    }

    //Remove movie
    public void RemoveFilm(DeleteView deleteView) {

        filmsRepository.RemoveFilm(deleteView);
    }

    //Edite movie
    public void EditFilm(FilmEditView filmEditView) {
        filmsRepository.EditFilm(filmEditView);
    }

    //Filtered View
    public List<FilmsView> getFilterFilm(Integer footage)
    {
        return filmsRepository.getFilterFilm(footage);
    }
}
