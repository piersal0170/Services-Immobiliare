package it.immobiliare.immobile.specification;

import it.immobiliare.immobile.entity.ImmobileEntity;
import org.springframework.data.jpa.domain.Specification;

public class ImmobileSpecifications {
    public static Specification<ImmobileEntity> hasComune(String comune) {
        return (root, query, criteriaBuilder) ->
                comune != null ? criteriaBuilder.equal(root.get("comune"), comune) : null;
    }

    public static Specification<ImmobileEntity> hasZona(String zona) {
        return (root, query, criteriaBuilder) ->
                zona != null ? criteriaBuilder.equal(root.get("zona"), zona) : null;
    }

    public static Specification<ImmobileEntity> hasPrezzoBetween(int p_min, int p_max) {
        return (root, query, criteriaBuilder) -> {
            if(p_min != 0 && p_max != 0) {
                return criteriaBuilder.between(root.get("prezzo"), p_min, p_max);
            } else if (p_min != 0) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("prezzo"), p_min);
            } else if (p_max != 0) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("prezzo"), p_max);
            } else{
                return null;
            }
        };
    }

    public static Specification<ImmobileEntity> hasPiano(Integer piano) {
        return (root, query, criteriaBuilder) ->
                piano != null ? criteriaBuilder.equal(root.get("piano"), piano) : null;
    }

    public static Specification<ImmobileEntity> hasN_Stanze(Integer n_stanze) {
        return (root, query, criteriaBuilder) ->
                n_stanze != null ? criteriaBuilder.equal(root.get("n_stanze"), n_stanze) : null;
    }

    public static Specification<ImmobileEntity> hasCategoria(String categoria) {
        return (root, query, criteriaBuilder) ->
                categoria != null ? criteriaBuilder.equal(root.get("categoria"), categoria) : null;
    }

    public static Specification<ImmobileEntity> hasClasseEnergetica(Character cl_ener) {
        return (root, query, criteriaBuilder) ->
                cl_ener != null ? criteriaBuilder.equal(root.get("classe_energetica"), cl_ener) : null;
    }

    public static Specification<ImmobileEntity> hasAscensore(Boolean ascensore) {
        return (root, query, criteriaBuilder) ->
                ascensore != null ? criteriaBuilder.equal(root.get("ascensore"), ascensore) : null;
    }

    public static Specification<ImmobileEntity> hasPortineria(Boolean portineria) {
        return (root, query, criteriaBuilder) ->
                portineria != null ? criteriaBuilder.equal(root.get("portineria"), portineria) : null;
    }

    public static Specification<ImmobileEntity> hasBalcone(Boolean balcone) {
        return (root, query, criteriaBuilder) ->
                balcone != null ? criteriaBuilder.equal(root.get("balcone"), balcone) : null;
    }

    public static Specification<ImmobileEntity> hasTerrazzo(Boolean terrazzo) {
        return (root, query, criteriaBuilder) ->
                terrazzo != null ? criteriaBuilder.equal(root.get("terrazzo"), terrazzo) : null;
    }

    public static Specification<ImmobileEntity> hasGiardino(Boolean giardino) {
        return (root, query, criteriaBuilder) ->
                giardino != null ? criteriaBuilder.equal(root.get("giardino"), giardino) : null;
    }

    public static Specification<ImmobileEntity> hasClimatizzazione(Boolean climatizzazione) {
        return (root, query, criteriaBuilder) ->
                climatizzazione != null ? criteriaBuilder.equal(root.get("climatizzazione"), climatizzazione) : null;
    }

    public static Specification<ImmobileEntity> hasRiscaldamento(Boolean riscaldamento) {
        return (root, query, criteriaBuilder) ->
                riscaldamento != null ? criteriaBuilder.equal(root.get("riscaldamento"), riscaldamento) : null;
    }

    public static Specification<ImmobileEntity> hasPostoAuto(Boolean posto_auto) {
        return (root, query, criteriaBuilder) ->
                posto_auto != null ? criteriaBuilder.equal(root.get("posto_auto"), posto_auto) : null;
    }

    public static Specification<ImmobileEntity> hasAccessoDisabili(Boolean accesso_disabili) {
        return (root, query, criteriaBuilder) ->
                accesso_disabili != null ? criteriaBuilder.equal(root.get("accesso_disabili"), accesso_disabili) : null;
    }

}

