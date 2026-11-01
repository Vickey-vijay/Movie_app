package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4689z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ja f58042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f58043b = "";

    public final void a(String str, boolean z10) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || ck.p.e(this.f58043b, str)) {
                return;
            }
            this.f58043b = str;
            this.f58042a.a(str, z10);
        }
    }

    public C4689z7(Ja ja2) {
        this.f58042a = ja2;
    }
}
