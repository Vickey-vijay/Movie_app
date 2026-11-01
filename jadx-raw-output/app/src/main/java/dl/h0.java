package dl;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.b f52153f;

    @Override // al.c
    public int x(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(cl.a aVar, kotlinx.serialization.json.b bVar) {
        super(aVar, bVar, null);
        ck.p.j(aVar, "json");
        ck.p.j(bVar, "value");
        this.f52153f = bVar;
        X("primitive");
    }

    @Override // dl.c
    public kotlinx.serialization.json.b e0(String str) {
        ck.p.j(str, "tag");
        if (str == "primitive") {
            return s0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // dl.c
    public kotlinx.serialization.json.b s0() {
        return this.f52153f;
    }
}
