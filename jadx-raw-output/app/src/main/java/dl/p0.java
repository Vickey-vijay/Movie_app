package dl;

import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends kotlinx.serialization.json.internal.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JsonObject f52178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<String> f52179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f52180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f52181n;

    @Override // kotlinx.serialization.json.internal.b, dl.c, al.c
    public void c(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(cl.a aVar, JsonObject jsonObject) {
        super(aVar, jsonObject, null, null, 12, null);
        ck.p.j(aVar, "json");
        ck.p.j(jsonObject, "value");
        this.f52178k = jsonObject;
        List<String> listO0 = nj.b0.O0(s0().keySet());
        this.f52179l = listO0;
        this.f52180m = listO0.size() * 2;
        this.f52181n = -1;
    }

    @Override // kotlinx.serialization.json.internal.b, bl.e1
    public String a0(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        return this.f52179l.get(i10 / 2);
    }

    @Override // kotlinx.serialization.json.internal.b, dl.c
    public kotlinx.serialization.json.b e0(String str) {
        ck.p.j(str, "tag");
        return this.f52181n % 2 == 0 ? cl.i.c(str) : (kotlinx.serialization.json.b) kotlin.collections.a.k(s0(), str);
    }

    @Override // kotlinx.serialization.json.internal.b, dl.c
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public JsonObject s0() {
        return this.f52178k;
    }

    @Override // kotlinx.serialization.json.internal.b, al.c
    public int x(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        int i10 = this.f52181n;
        if (i10 >= this.f52180m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f52181n = i11;
        return i11;
    }
}
