package yads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75814b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return ck.p.e(bgVar.f75813a, this.f75813a) && ck.p.e(bgVar.f75814b, this.f75814b);
    }

    public final String a() {
        return this.f75813a;
    }

    public final String b() {
        return this.f75814b;
    }

    public final int hashCode() {
        return this.f75814b.hashCode() + (this.f75813a.hashCode() * 31);
    }

    public bg(cg cgVar, JSONObject jSONObject) {
        this.f75813a = cgVar.a();
        this.f75814b = jSONObject.toString();
    }
}
