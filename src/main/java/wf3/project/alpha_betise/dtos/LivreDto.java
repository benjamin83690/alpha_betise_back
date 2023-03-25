package wf3.project.alpha_betise.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import wf3.project.alpha_betise.dtos.auteurDto.AuteurDto;
import wf3.project.alpha_betise.dtos.categorieLivreDto.CategorieLivreDto;
import wf3.project.alpha_betise.dtos.collectionDto.CollectionDto;
import wf3.project.alpha_betise.entities.EtatStock;
import wf3.project.alpha_betise.entities.Langue;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LivreDto {

	private Long isbn;

	private String titre;

	private Float prix;

	private String resume;

	private Integer nbPages;

	private LocalDate datePublication;

	private Float poids;

	private Integer nbExemplaires;

	private Float longueur;

	private Float largeur;

	private Float epaisseur;

	private CategorieLivreDto categorieLivre;

	private CollectionDto collectionLivre;

	private EditeurDto editeur;

	private String photoLivre;

	private Langue langue;

	private EtatStock etatStock;

	private List<AuteurDto> auteurs;
}
