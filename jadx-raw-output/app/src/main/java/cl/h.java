package cl;

import com.ironsource.C3426d4;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final boolean a(b bVar, String str) {
        ck.p.j(bVar, "<this>");
        return bVar.a(i.c(str));
    }

    public static final kotlinx.serialization.json.b b(s sVar, String str, Boolean bool) {
        ck.p.j(sVar, "<this>");
        ck.p.j(str, C3426d4.i.W);
        return sVar.b(str, i.a(bool));
    }

    public static final kotlinx.serialization.json.b c(s sVar, String str, Number number) {
        ck.p.j(sVar, "<this>");
        ck.p.j(str, C3426d4.i.W);
        return sVar.b(str, i.b(number));
    }

    public static final kotlinx.serialization.json.b d(s sVar, String str, String str2) {
        ck.p.j(sVar, "<this>");
        ck.p.j(str, C3426d4.i.W);
        return sVar.b(str, i.c(str2));
    }

    public static final kotlinx.serialization.json.b e(s sVar, String str, bk.l<? super b, mj.r> lVar) {
        ck.p.j(sVar, "<this>");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(lVar, "builderAction");
        b bVar = new b();
        lVar.invoke(bVar);
        return sVar.b(str, bVar.b());
    }

    public static final kotlinx.serialization.json.b f(s sVar, String str, bk.l<? super s, mj.r> lVar) {
        ck.p.j(sVar, "<this>");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(lVar, "builderAction");
        s sVar2 = new s();
        lVar.invoke(sVar2);
        return sVar.b(str, sVar2.a());
    }
}
