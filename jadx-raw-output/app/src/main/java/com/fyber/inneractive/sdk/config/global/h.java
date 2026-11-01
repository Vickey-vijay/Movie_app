package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f15095a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15096b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f15095a.isEmpty() || eVar.f15085c == null) {
            return false;
        }
        Iterator it = this.f15095a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.f15085c.value())) {
                return !this.f15096b;
            }
        }
        return this.f15096b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f15095a, Boolean.valueOf(this.f15096b));
    }

    public h(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f15095a.add(strOptString);
                }
            }
        }
        this.f15096b = z10;
    }
}
