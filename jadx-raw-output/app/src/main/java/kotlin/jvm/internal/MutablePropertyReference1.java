package kotlin.jvm.internal;

import ck.s;
import jk.b;
import jk.j;
import jk.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements j {
    public MutablePropertyReference1() {
    }

    @Override // jk.m
    public abstract /* synthetic */ Object get(Object obj);

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference
    public m.a getGetter() {
        return ((j) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference
    public j.a getSetter() {
        return ((j) getReflected()).getSetter();
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        return s.f(this);
    }

    @Override // jk.m
    public Object getDelegate(Object obj) {
        return ((j) getReflected()).getDelegate(obj);
    }

    @Override // bk.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
