package wf3.project.alpha_betise.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailCommandePK implements Serializable {

    @Column(name = "commande_id")
    private Integer commandeId;

    @Column(name = "livre_isbn")
    private Integer livreIsbn;
}
