package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25600d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.f25597a == voVar.f25597a && this.f25598b == voVar.f25598b && this.f25599c == voVar.f25599c && this.f25600d == voVar.f25600d;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", F3.a(this.f25597a));
            jSONObject.put("top", F3.a(this.f25598b));
            jSONObject.put("right", F3.a(this.f25599c));
            jSONObject.put("bottom", F3.a(this.f25600d));
            return jSONObject;
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            return new JSONObject();
        }
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25600d) + AbstractC2862fi.a(this.f25599c, AbstractC2862fi.a(this.f25598b, Integer.hashCode(this.f25597a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.f25597a + ", top=" + this.f25598b + ", right=" + this.f25599c + ", bottom=" + this.f25600d + ")";
    }

    public vo(int i10, int i11, int i12, int i13) {
        this.f25597a = i10;
        this.f25598b = i11;
        this.f25599c = i12;
        this.f25600d = i13;
    }
}
