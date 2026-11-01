package androidx.privacysandbox.ads.adservices.common;

import ck.p;

/* JADX INFO: compiled from: AdSelectionSignals.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdSelectionSignals {
    private final String signals;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdSelectionSignals) {
            return p.e(this.signals, ((AdSelectionSignals) obj).signals);
        }
        return false;
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }

    public AdSelectionSignals(String str) {
        p.j(str, "signals");
        this.signals = str;
    }
}
