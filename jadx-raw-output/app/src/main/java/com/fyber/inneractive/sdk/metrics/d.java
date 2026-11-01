package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f15849d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15850a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15851b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f15852c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.f15852c;
            }
            g gVar = (g) this.f15850a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f15850a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.f15852c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.f15851b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.f15851b.put(str, iVar);
        return iVar;
    }
}
