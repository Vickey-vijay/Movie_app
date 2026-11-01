package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f15097a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15098b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f15097a.isEmpty() || eVar.f15084b == null) {
            return false;
        }
        Iterator it = this.f15097a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f15084b)) {
                return !this.f15098b;
            }
        }
        return this.f15098b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f15097a, Boolean.valueOf(this.f15098b));
    }

    public i(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f15097a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f15098b = z10;
    }
}
