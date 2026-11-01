package kotlin.jvm.internal;

import ck.s;
import jk.b;
import jk.m;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PropertyReference1 extends PropertyReference implements m {
    public PropertyReference1() {
    }

    public abstract /* synthetic */ Object get(Object obj);

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public m.a getGetter() {
        return ((m) getReflected()).getGetter();
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        return s.i(this);
    }

    @Override // jk.m
    public Object getDelegate(Object obj) {
        return ((m) getReflected()).getDelegate(obj);
    }

    @Override // bk.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
