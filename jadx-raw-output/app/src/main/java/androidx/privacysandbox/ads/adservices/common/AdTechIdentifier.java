package androidx.privacysandbox.ads.adservices.common;

import ck.p;

/* JADX INFO: compiled from: AdTechIdentifier.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AdTechIdentifier {
    private final String identifier;

    public AdTechIdentifier(String str) {
        p.j(str, "identifier");
        this.identifier = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdTechIdentifier) {
            return p.e(this.identifier, ((AdTechIdentifier) obj).identifier);
        }
        return false;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return String.valueOf(this.identifier);
    }
}
