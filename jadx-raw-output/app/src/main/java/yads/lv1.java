package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class lv1 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f79940m = new jb2();

    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) throws t43 {
        o20 o20VarA;
        jb2 jb2Var = this.f79940m;
        jb2Var.f78966a = bArr;
        jb2Var.f78968c = i10;
        jb2Var.f78967b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            jb2 jb2Var2 = this.f79940m;
            int i11 = jb2Var2.f78968c - jb2Var2.f78967b;
            if (i11 <= 0) {
                return new mv1(arrayList);
            }
            if (i11 < 8) {
                throw new t43("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iB = jb2Var2.b();
            if (this.f79940m.b() == 1987343459) {
                jb2 jb2Var3 = this.f79940m;
                int i12 = iB - 8;
                CharSequence charSequenceA = null;
                n20 n20VarA = null;
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new t43("Incomplete vtt cue box header found.");
                    }
                    int iB2 = jb2Var3.b();
                    int iB3 = jb2Var3.b();
                    int i13 = iB2 - 8;
                    String strA = ib3.a(jb2Var3.f78966a, jb2Var3.f78967b, i13);
                    jb2Var3.e(jb2Var3.f78967b + i13);
                    i12 = (i12 - 8) - i13;
                    if (iB3 == 1937011815) {
                        po3 po3Var = new po3();
                        qo3.a(strA, po3Var);
                        n20VarA = po3Var.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = qo3.a(null, strA.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (n20VarA != null) {
                    n20VarA.f80513a = charSequenceA;
                    o20VarA = n20VarA.a();
                } else {
                    Pattern pattern = qo3.f81911a;
                    po3 po3Var2 = new po3();
                    po3Var2.f81507c = charSequenceA;
                    o20VarA = po3Var2.a().a();
                }
                arrayList.add(o20VarA);
            } else {
                jb2 jb2Var4 = this.f79940m;
                jb2Var4.e(jb2Var4.f78967b + (iB - 8));
            }
        }
    }
}
