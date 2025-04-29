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

    public static Specification<ImmobileEntity> hasPiano(int piano) {
        return (root, query, criteriaBuilder) ->
                piano != 0 ? criteriaBuilder.equal(root.get("piano"), piano) : null;
    }

    public static Specification<ImmobileEntity> hasN_Stanze(int n_stanze) {
        return (root, query, criteriaBuilder) ->
                n_stanze != 0 ? criteriaBuilder.equal(root.get("n_stanze"), n_stanze) : null;
    }

    public static Specification<ImmobileEntity> hasCategoria(String categoria) {
        return (root, query, criteriaBuilder) ->
                categoria != null ? criteriaBuilder.equal(root.get("categoria"), categoria) : null;
    }

    public static Specification<ImmobileEntity> hasClasseEnergetica(char cl_ener) {
        return (root, query, criteriaBuilder) ->
                cl_ener != '\u0000' ? criteriaBuilder.equal(root.get("classe_energetica"), cl_ener) : null;
    }

    public static Specification<ImmobileEntity> hasAscensore(boolean ascensore) {
        return (root, query, criteriaBuilder) ->
                ascensore ? criteriaBuilder.equal(root.get("ascensore"), ascensore) : null;
    }

    public static Specification<ImmobileEntity> hasPortineria(boolean portineria) {
        return (root, query, criteriaBuilder) ->
                portineria ? criteriaBuilder.equal(root.get("portineria"), portineria) : null;
    }

    public static Specification<ImmobileEntity> hasBalcone(boolean balcone) {
        return (root, query, criteriaBuilder) ->
                balcone ? criteriaBuilder.equal(root.get("balcone"), balcone) : null;
    }

    public static Specification<ImmobileEntity> hasTerrazzo(boolean terrazzo) {
        return (root, query, criteriaBuilder) ->
                terrazzo ? criteriaBuilder.equal(root.get("terrazzo"), terrazzo) : null;
    }

    public static Specification<ImmobileEntity> hasGiardino(boolean giardino) {
        return (root, query, criteriaBuilder) ->
                giardino ? criteriaBuilder.equal(root.get("giardino"), giardino) : null;
    }

    public static Specification<ImmobileEntity> hasClimatizzazione(boolean climatizzazione) {
        return (root, query, criteriaBuilder) ->
                climatizzazione ? criteriaBuilder.equal(root.get("climatizzazione"), climatizzazione) : null;
    }

    public static Specification<ImmobileEntity> hasRiscaldamento(boolean riscaldamento) {
        return (root, query, criteriaBuilder) ->
                riscaldamento ? criteriaBuilder.equal(root.get("riscaldamento"), riscaldamento) : null;
    }

    public static Specification<ImmobileEntity> hasPostoAuto(boolean posto_auto) {
        return (root, query, criteriaBuilder) ->
                posto_auto ? criteriaBuilder.equal(root.get("posto_auto"), posto_auto) : null;
    }

    public static Specification<ImmobileEntity> hasAccessoDisabili(boolean accesso_disabili) {
        return (root, query, criteriaBuilder) ->
                accesso_disabili ? criteriaBuilder.equal(root.get("accesso_disabili"), accesso_disabili) : null;
    }

}

