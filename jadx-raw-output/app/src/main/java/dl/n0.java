package dl;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.a f52170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f52171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52172h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(cl.a aVar, kotlinx.serialization.json.a aVar2) {
        super(aVar, aVar2, null);
        ck.p.j(aVar, "json");
        ck.p.j(aVar2, "value");
        this.f52170f = aVar2;
        this.f52171g = s0().size();
        this.f52172h = -1;
    }

    @Override // bl.e1
    public String a0(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        return String.valueOf(i10);
    }

    @Override // dl.c
    public kotlinx.serialization.json.b e0(String str) {
        ck.p.j(str, "tag");
        return s0().get(Integer.parseInt(str));
    }

    @Override // dl.c
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.a s0() {
        return this.f52170f;
    }

    @Override // al.c
    public int x(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        int i10 = this.f52172h;
        if (i10 >= this.f52171g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f52172h = i11;
        return i11;
    }
}
