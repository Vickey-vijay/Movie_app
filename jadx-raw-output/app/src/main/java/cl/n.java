package cl;

import dl.a1;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends kotlinx.serialization.json.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f6113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6114d;

    public /* synthetic */ n(Object obj, boolean z10, kotlinx.serialization.descriptors.a aVar, int i10, ck.i iVar) {
        this(obj, z10, (i10 & 4) != 0 ? null : aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return g() == nVar.g() && ck.p.e(e(), nVar.e());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object obj, boolean z10, kotlinx.serialization.descriptors.a aVar) {
        super(null);
        ck.p.j(obj, "body");
        this.f6112b = z10;
        this.f6113c = aVar;
        this.f6114d = obj.toString();
        if (aVar != null && !aVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // kotlinx.serialization.json.c
    public String e() {
        return this.f6114d;
    }

    public final kotlinx.serialization.descriptors.a f() {
        return this.f6113c;
    }

    public boolean g() {
        return this.f6112b;
    }

    public int hashCode() {
        return (Boolean.hashCode(g()) * 31) + e().hashCode();
    }

    @Override // kotlinx.serialization.json.c
    public String toString() {
        if (g()) {
            StringBuilder sb2 = new StringBuilder();
            a1.c(sb2, e());
            String string = sb2.toString();
            ck.p.i(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        return e();
    }
}
