package kotlin;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import mj.g;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: compiled from: LazyJVM.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> g<T> a(bk.a<? extends T> aVar) {
        p.j(aVar, "initializer");
        i iVar = null;
        return new SynchronizedLazyImpl(aVar, iVar, 2, iVar);
    }

    public static final <T> g<T> b(LazyThreadSafetyMode lazyThreadSafetyMode, bk.a<? extends T> aVar) {
        p.j(lazyThreadSafetyMode, C3426d4.a.f28427t);
        p.j(aVar, "initializer");
        int i10 = a.$EnumSwitchMapping$0[lazyThreadSafetyMode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            i iVar = null;
            return new SynchronizedLazyImpl(aVar, iVar, i11, iVar);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
