package com.soa.vie.takaful.requestmodels;

import com.soa.vie.takaful.entitymodels.*;
import com.soa.vie.takaful.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAndUpdateRetraiteProduit  extends Produit {

    private List<PoolInvestissment> poolInvestissment;

    private NatureFiscale natureFiscale;

    private float revenuGlobal;

    private Integer dureeMinimalSouscription;

    private boolean renouvellementContratTaciteReconduction;

    private float montantMinContribution;

    private float tauxRendementAvantImposition;

    private ModeGestion modeGestion;

    private float fraisFixeWakalabilIstithmar;

    private float surperformanceWakalabilIstithmar;

    private float profitMoudaraba;

    ModeCalculCapitalConstitue modeCalculCapitalConstitue;

    private boolean rachatTotal;

    private Integer dureeMinimalSouscriptionAvantRachatTotal;

    private boolean conditionDisciplinaireTotale;

    NatureConditionDisciplinaire natureConditionDisciplinaireTotale;

    private float valeurConditionDisciplinaireTotale;

    private boolean rachatPartiel;

    private boolean conditionDisciplinairePartiel;

    private Integer dureeMinimalSouscriptionAvantRachatPartiel;

    NatureConditionDisciplinaire natureConditionDisciplinairePartiel;

    private float valeurConditionDisciplinairePartiel;

    private float maximumMontantRachatPartiel;

    private Integer nombreMaximumRachatPartiel;

    private RegimeFiscal regimeFiscal;



}
