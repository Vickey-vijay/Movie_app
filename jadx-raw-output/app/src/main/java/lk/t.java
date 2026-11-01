package lk;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class t extends s {
    private static final StringBuilder insert(StringBuilder sb2, int i10, byte b10) {
        ck.p.j(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) b10);
        ck.p.i(sbInsert, "insert(...)");
        return sbInsert;
    }

    private static final StringBuilder insert(StringBuilder sb2, int i10, short s10) {
        ck.p.j(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) s10);
        ck.p.i(sbInsert, "insert(...)");
        return sbInsert;
    }

    public static final StringBuilder m(StringBuilder sb2) {
        ck.p.j(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }
}
