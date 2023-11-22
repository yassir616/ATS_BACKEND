package com.soa.vie.takaful.responsemodels;

import java.util.Date;

import com.soa.vie.takaful.entitymodels.AbstractBaseEntity;
import com.soa.vie.takaful.entitymodels.AcceptationTestMedical;
import com.soa.vie.takaful.entitymodels.Verdict;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcceptationEtapeModelResponse extends AbstractBaseEntity {

    /**
     *
     */

    private String etape;

    private Date dateVerdict;

    private Verdict verdict;

    private AcceptationTestMedical acceptationTestMedical;

    private AcceptationReassuranceModelResponse acceptationReassuranceModelResponse;
}