package wf3.project.alpha_betise.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@SuppressWarnings("serial")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utilisateurs")
public class Utilisateur implements UserDetails {

	@Id
	@GeneratedValue
	@Column(name = "utilisateur_id")
	private Integer id;

	@NonNull
	private String nom;

	@NonNull
	private String prenom;

	@NonNull
	private String email;

	@NonNull
	private String motDePasse;

	@NonNull
	private Short age;

	private String photo;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "role_id")
	private Role role;

	@ManyToMany
	@JoinTable(name = "evenements_utilisateur", joinColumns = @JoinColumn(name = "utilisateur_id"), inverseJoinColumns = @JoinColumn(name = "evenement_id"))
	private List<Evenement> evenementId;

	@OneToMany(mappedBy = "utilisateurId", cascade = CascadeType.ALL)
	private List<CommentaireUtilisateur> commentaires;

	@OneToMany(mappedBy = "utilisateurId")
	private List<Commande> commandes;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(role.getRole()));
	}

	@Override
	public String getPassword() {
		return motDePasse;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
