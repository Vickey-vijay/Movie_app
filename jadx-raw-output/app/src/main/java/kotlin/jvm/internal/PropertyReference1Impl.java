package kotlin.jvm.internal;

import jk.c;
import jk.f;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(f fVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ck.f) fVar).a(), str, str2, !(fVar instanceof c) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1, jk.m
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i10) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
