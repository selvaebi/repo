package uk.ac.ebi.pride.archive.repo.assay.service;

import uk.ac.ebi.pride.archive.dataprovider.assay.AssayProvider;
import uk.ac.ebi.pride.archive.repo.param.service.CvParamSummary;
import uk.ac.ebi.pride.archive.repo.param.service.ParamSummary;
import uk.ac.ebi.pride.archive.repo.user.service.ContactSummary;
import uk.ac.ebi.pride.archive.repo.util.CollectionUtils;
import uk.ac.ebi.pride.archive.utils.cv.Ontology;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Rui Wang
 * @version $Id$
 */
public class AssaySummary implements AssayProvider{

    private Long projectId;
    private String accession;
    private String title;
    private String shortLabel;
    private String experimentalFactor;
    private int proteinCount;
    private int peptideCount;
    private int uniquePeptideCount;
    private int identifiedSpectrumCount;
    private int totalSpectrumCount;
    private boolean ms2Annotation;
    private boolean chromatogram;
    private final Collection<CvParamSummary> samples;
    private final Collection<InstrumentSummary> instruments;
    private final Collection<SoftwareSummary> softwares;
    private final Collection<CvParamSummary> ptms;
    private final Collection<CvParamSummary> quantificationMethods;
    private final Collection<ContactSummary> contacts;
    private Long id;
    private final Collection<ParamSummary> params;
    private final Collection<CvParamSummary> species;
    private final Collection<CvParamSummary> tissues;
    private final Collection<CvParamSummary> cellTypes;
    private final Collection<CvParamSummary> diseases;
    private final Collection<CvParamSummary> goTerms;

    public AssaySummary() {
        this.samples = new ArrayList<CvParamSummary>();
        this.instruments= new ArrayList<InstrumentSummary>();
        this.softwares = new ArrayList<SoftwareSummary>();
        this.ptms = new ArrayList<CvParamSummary>();
        this.quantificationMethods = new ArrayList<CvParamSummary>();
        this.contacts = new ArrayList<ContactSummary>();
        this.params = new ArrayList<ParamSummary>();
        this.species = new ArrayList<CvParamSummary>();
        this.tissues = new ArrayList<CvParamSummary>();
        this.cellTypes = new ArrayList<CvParamSummary>();
        this.diseases = new ArrayList<CvParamSummary>();
        this.goTerms = new ArrayList<CvParamSummary>();
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortLabel() {
        return shortLabel;
    }

    public void setShortLabel(String shortLabel) {
        this.shortLabel = shortLabel;
    }

    public String getExperimentalFactor() {
        return experimentalFactor;
    }

    public void setExperimentalFactor(String experimentalFactor) {
        this.experimentalFactor = experimentalFactor;
    }

    public int getProteinCount() {
        return proteinCount;
    }

    public void setProteinCount(int proteinCount) {
        this.proteinCount = proteinCount;
    }

    public int getPeptideCount() {
        return peptideCount;
    }

    public void setPeptideCount(int peptideCount) {
        this.peptideCount = peptideCount;
    }

    public int getUniquePeptideCount() {
        return uniquePeptideCount;
    }

    public void setUniquePeptideCount(int uniquePeptideCount) {
        this.uniquePeptideCount = uniquePeptideCount;
    }

    public int getIdentifiedSpectrumCount() {
        return identifiedSpectrumCount;
    }

    public void setIdentifiedSpectrumCount(int identifiedSpectrumCount) {
        this.identifiedSpectrumCount = identifiedSpectrumCount;
    }

    public int getTotalSpectrumCount() {
        return totalSpectrumCount;
    }

    public void setTotalSpectrumCount(int totalSpectrumCount) {
        this.totalSpectrumCount = totalSpectrumCount;
    }

    public boolean hasMs2Annotation() {
        return ms2Annotation;
    }

    public void setMs2Annotation(boolean ms2Annotation) {
        this.ms2Annotation = ms2Annotation;
    }

    public boolean hasChromatogram() {
        return chromatogram;
    }

    public void setChromatogram(boolean chromatogram) {
        this.chromatogram = chromatogram;
    }

    public Collection<CvParamSummary> getSamples() {
        return samples;
    }

    public void setSamples(Collection<CvParamSummary> samples) {
        CollectionUtils.replaceValuesInCollection(samples, this.samples);
    }

    public Collection<InstrumentSummary> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<InstrumentSummary> instruments) {
        CollectionUtils.replaceValuesInCollection(instruments, this.instruments);
    }

    public Collection<SoftwareSummary> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(Collection<SoftwareSummary> softwares) {
        CollectionUtils.replaceValuesInCollection(softwares, this.softwares);
    }

    public Collection<CvParamSummary> getPtms() {
        return ptms;
    }

    public void setPtms(Collection<CvParamSummary> ptms) {
        CollectionUtils.replaceValuesInCollection(ptms, this.ptms);
    }

    public Collection<CvParamSummary> getQuantificationMethods() {
        return quantificationMethods;
    }

    public void setQuantificationMethods(Collection<CvParamSummary> quantificationMethods) {
        CollectionUtils.replaceValuesInCollection(quantificationMethods, this.quantificationMethods);
    }

    public Collection<ContactSummary> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<ContactSummary> contacts) {
        CollectionUtils.replaceValuesInCollection(contacts, this.contacts);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<ParamSummary> getParams() {

        Comparator<ParamSummary> comparator = new Comparator<ParamSummary>() {
            @Override
            public int compare(ParamSummary o1, ParamSummary o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        Collections.sort((java.util.List<ParamSummary>) params, comparator);

        return params;
    }

    public void setParams(Collection<ParamSummary> params) {
        CollectionUtils.replaceValuesInCollection(params, this.params);
    }

    public Collection<CvParamSummary> getSpecies() {
        if (species.isEmpty()) {
            for (CvParamSummary sample : samples) {
                String cvLabel = sample.getCvLabel();
                if (Ontology.NEWT.getName().equalsIgnoreCase(cvLabel)) {
                    this.species.add(sample);
                }
            }
        }

        return species;
    }

    public Collection<CvParamSummary> getTissues() {
        if (tissues.isEmpty()) {
            for (CvParamSummary sample : samples) {
                String cvLabel = sample.getCvLabel();
                if (Ontology.BRENDA.getName().equalsIgnoreCase(cvLabel)) {
                    this.tissues.add(sample);
                }
            }
        }
        return tissues;
    }

    public Collection<CvParamSummary> getCellTypes() {
        if (cellTypes.isEmpty()) {
            for (CvParamSummary sample : samples) {
                String cvLabel = sample.getCvLabel();
                if (Ontology.CL.getName().equalsIgnoreCase(cvLabel)) {
                    this.cellTypes.add(sample);
                }
            }
        }
        return cellTypes;
    }

    public Collection<CvParamSummary> getDiseases() {
        if (diseases.isEmpty()) {
            for (CvParamSummary sample : samples) {
                String cvLabel = sample.getCvLabel();
                if (Ontology.DISEASE.getName().equalsIgnoreCase(cvLabel)) {
                    this.diseases.add(sample);
                }
            }
        }
        return diseases;
    }

    public Collection<CvParamSummary> getGoTerms() {
        if (goTerms.isEmpty()) {
            for (CvParamSummary sample : samples) {
                String cvLabel = sample.getCvLabel();
                if (Ontology.GO.getName().equalsIgnoreCase(cvLabel)) {
                    this.goTerms.add(sample);
                }
            }
        }
        return goTerms;
    }
}