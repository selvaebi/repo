package uk.ac.ebi.pride.archive.repo.repos.project;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
@Entity
@DiscriminatorValue("INSTRUMENT")
public class ProjectInstrumentCvParam extends ProjectCvParam {}
