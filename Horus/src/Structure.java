import java.util.List;
import java.util.Optional;

public interface Structure {
	// zwraca dowolny element o podanym kolorze
	Optional findBlockByColor(String color);

	// zwraca wszystkie elementy z danego materia�u
	List findBlocksByMaterial(String material);

	//zwraca liczb� wszystkich element�w tworz�cych struktur�
	int count();
}
