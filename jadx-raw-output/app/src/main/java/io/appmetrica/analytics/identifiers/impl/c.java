package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f54828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f54829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54830c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f54828a = identifierStatus;
        this.f54829b = aVar;
        this.f54830c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f54828a == cVar.f54828a && ck.p.e(this.f54829b, cVar.f54829b) && ck.p.e(this.f54830c, cVar.f54830c);
    }

    public final int hashCode() {
        int iHashCode = this.f54828a.hashCode() * 31;
        a aVar = this.f54829b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f54830c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f54828a + ", advIdInfo=" + this.f54829b + ", errorExplanation=" + this.f54830c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i10) {
        this(identifierStatus, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : str);
    }
}
