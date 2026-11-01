package kotlin.enums;

import ck.i;
import ck.p;
import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f62995b = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<E> f62996c;

    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(E[] eArr) {
        p.j(eArr, "entries");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        p.g(cls);
        this.f62996c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f62996c.getEnumConstants();
        p.i(enumConstants, "getEnumConstants(...)");
        return kotlin.enums.a.a(enumConstants);
    }
}
