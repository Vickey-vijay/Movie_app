package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f15081a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15082b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f15081a.isEmpty() || eVar.f15083a == null) {
            return false;
        }
        Iterator it = this.f15081a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f15083a)) {
                return !this.f15082b;
            }
        }
        return this.f15082b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f15081a, Boolean.valueOf(this.f15082b));
    }

    public c(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f15081a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f15082b = z10;
    }
}
