package cl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static final a a(a aVar, bk.l<? super d, mj.r> lVar) {
        ck.p.j(aVar, TypedValues.TransitionType.S_FROM);
        ck.p.j(lVar, "builderAction");
        d dVar = new d(aVar);
        lVar.invoke(dVar);
        return new l(dVar.a(), dVar.b());
    }

    public static /* synthetic */ a b(a aVar, bk.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = a.f6073d;
        }
        return a(aVar, lVar);
    }
}
