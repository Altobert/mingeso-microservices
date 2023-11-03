package cl.mingeso.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_colegio")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TipoColegioEntity {

    @Id
    @NotNull
    private int id;
    private String tipo;
}
