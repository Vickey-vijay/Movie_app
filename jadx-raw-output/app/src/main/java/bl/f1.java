package bl;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class f1 extends e2<String> {
    public abstract String a0(String str, String str2);

    public abstract String b0(kotlinx.serialization.descriptors.a aVar, int i10);

    @Override // bl.e2
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "<this>");
        return d0(b0(aVar, i10));
    }

    public final String d0(String str) {
        ck.p.j(str, "nestedName");
        String strW = W();
        if (strW == null) {
            strW = "";
        }
        return a0(strW, str);
    }
}
