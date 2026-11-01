package dl;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends al.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f52145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el.c f52146b;

    public e0(a aVar, cl.a aVar2) {
        ck.p.j(aVar, "lexer");
        ck.p.j(aVar2, "json");
        this.f52145a = aVar;
        this.f52146b = aVar2.a();
    }

    @Override // al.a, al.e
    public byte H() {
        a aVar = this.f52145a;
        String strS = aVar.s();
        try {
            return lk.h0.a(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // al.e, al.c
    public el.c a() {
        return this.f52146b;
    }

    @Override // al.a, al.e
    public long h() {
        a aVar = this.f52145a;
        String strS = aVar.s();
        try {
            return lk.h0.g(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // al.a, al.e
    public short l() {
        a aVar = this.f52145a;
        String strS = aVar.s();
        try {
            return lk.h0.j(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // al.a, al.e
    public int u() {
        a aVar = this.f52145a;
        String strS = aVar.s();
        try {
            return lk.h0.d(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // al.c
    public int x(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
