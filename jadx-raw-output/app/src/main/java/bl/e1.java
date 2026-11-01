package bl;

import kotlinx.serialization.internal.TaggedDecoder;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class e1 extends TaggedDecoder<String> {
    public abstract String Z(String str, String str2);

    public String a0(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        return aVar.f(i10);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String V(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "<this>");
        return c0(a0(aVar, i10));
    }

    public final String c0(String str) {
        ck.p.j(str, "nestedName");
        String strU = U();
        if (strU == null) {
            strU = "";
        }
        return Z(strU, str);
    }
}
