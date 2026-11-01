package kotlin.jvm.internal;

import ck.m;
import ck.p;
import ck.s;
import java.io.Serializable;

/* JADX INFO: compiled from: Lambda.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Lambda<R> implements m<R>, Serializable {
    private final int arity;

    @Override // ck.m
    public int getArity() {
        return this.arity;
    }

    public Lambda(int i10) {
        this.arity = i10;
    }

    public String toString() {
        String strK = s.k(this);
        p.i(strK, "renderLambdaToString(...)");
        return strK;
    }
}
