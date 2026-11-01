package com.unity3d.ads.core.domain.scar;

import ck.p;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;

/* JADX INFO: compiled from: ScarTimeHackFixer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ScarTimeHackFixer {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int i10) {
        if (i10 >= 1000) {
            return i10;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, null, 62, null);
        return i10 * 1000;
    }
}
