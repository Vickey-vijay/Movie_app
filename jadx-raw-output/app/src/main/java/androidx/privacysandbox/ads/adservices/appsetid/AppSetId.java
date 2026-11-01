package androidx.privacysandbox.ads.adservices.appsetid;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: AppSetId.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppSetId {
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f4637id;
    private final int scope;

    /* JADX INFO: compiled from: AppSetId.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return p.e(this.f4637id, appSetId.f4637id) && this.scope == appSetId.scope;
    }

    public AppSetId(String str, int i10) {
        p.j(str, "id");
        this.f4637id = str;
        this.scope = i10;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Scope undefined.".toString());
        }
    }

    public final String getId() {
        return this.f4637id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (this.f4637id.hashCode() * 31) + Integer.hashCode(this.scope);
    }

    public String toString() {
        return "AppSetId: id=" + this.f4637id + ", scope=" + (this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
