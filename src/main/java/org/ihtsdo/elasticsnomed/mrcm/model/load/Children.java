package org.ihtsdo.elasticsnomed.mrcm.model.load;

import org.ihtsdo.elasticsnomed.mrcm.model.InclusionType;

public class Children {
	private Long conceptId;
	private InclusionType inclusionType;

	public Children() {
		inclusionType = InclusionType.SELF;
	}

	public Long getConceptId() {
		return conceptId;
	}

	public void setConceptId(Long conceptId) {
		this.conceptId = conceptId;
	}

	public InclusionType getInclusionType() {
		return inclusionType;
	}

	public void setInclusionType(InclusionType inclusionType) {
		this.inclusionType = inclusionType;
	}
}
