package uk.ac.ebi.pride.archive.repo.services.param;

import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

/**
 * @author Rui Wang
 * @version $Id$
 */
public class CvParamSummary extends ParamSummary implements CvParamProvider {

  private String cvLabel;
  private String accession;

  @Override
  public String getCvLabel() {
    return cvLabel;
  }

  public void setCvLabel(String cvLabel) {
    this.cvLabel = cvLabel;
  }

  @Override
  public String getAccession() {
    return accession;
  }

  public void setAccession(String accession) {
    this.accession = accession;
  }
}
