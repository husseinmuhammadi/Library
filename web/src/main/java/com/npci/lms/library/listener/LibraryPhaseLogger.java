package com.npci.lms.library.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LibraryPhaseLogger implements PhaseListener {
    @Override
    public void afterPhase(PhaseEvent phaseEvent) {
        System.out.println("--- After phase: " + phaseEvent.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        System.out.println("--- Before phase: " + phaseEvent.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
