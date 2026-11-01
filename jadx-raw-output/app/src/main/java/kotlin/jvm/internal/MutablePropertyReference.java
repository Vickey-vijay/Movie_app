package kotlin.jvm.internal;

import jk.h;
import jk.k;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MutablePropertyReference extends PropertyReference implements h {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference
    public abstract /* synthetic */ k.a getGetter();

    public abstract /* synthetic */ h.a getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
