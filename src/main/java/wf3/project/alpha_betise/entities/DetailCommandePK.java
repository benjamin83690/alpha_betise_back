package wf3.project.alpha_betise.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

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
