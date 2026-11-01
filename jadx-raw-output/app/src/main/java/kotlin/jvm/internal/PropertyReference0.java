package kotlin.jvm.internal;

import ck.s;
import jk.b;
import jk.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PropertyReference0 extends PropertyReference implements l {
    public PropertyReference0() {
    }

    public abstract /* synthetic */ Object get();

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public l.a getGetter() {
        return ((l) getReflected()).getGetter();
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        return s.h(this);
    }

    @Override // jk.l
    public Object getDelegate() {
        return ((l) getReflected()).getDelegate();
    }

    @Override // bk.a
    public Object invoke() {
        return get();
    }
}
