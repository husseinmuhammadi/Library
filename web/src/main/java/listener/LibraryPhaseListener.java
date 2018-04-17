package listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Created by a.mohammadi on 4/17/2018.
 */
public class LibraryPhaseListener implements PhaseListener {
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("--- After phase: " + phaseEvent.getPhaseId());
    }

    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("--- Before phase: " + phaseEvent.getPhaseId());
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
