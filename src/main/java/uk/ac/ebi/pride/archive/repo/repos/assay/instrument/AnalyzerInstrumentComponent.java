package uk.ac.ebi.pride.archive.repo.repos.assay.instrument;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Collection;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
@Entity
@DiscriminatorValue("ANALYZER")
public class AnalyzerInstrumentComponent extends InstrumentComponent {
    @Override
    public Collection<? extends String> getAdditionalAttributesStrings() {
        return null;
    }
}
