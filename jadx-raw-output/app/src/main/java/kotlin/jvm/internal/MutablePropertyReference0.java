package kotlin.jvm.internal;

import ck.s;
import jk.b;
import jk.i;
import jk.l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements i {
    public MutablePropertyReference0() {
    }

    public abstract /* synthetic */ Object get();

    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public l.a getGetter() {
        return ((i) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public i.a getSetter() {
        return ((i) getReflected()).getSetter();
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        return s.e(this);
    }

    @Override // jk.l
    public Object getDelegate() {
        return ((i) getReflected()).getDelegate();
    }

    @Override // bk.a
    public Object invoke() {
        return get();
    }
}
