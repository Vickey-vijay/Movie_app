package kotlinx.coroutines;

import bk.p;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: CoroutineStart.kt */
/* JADX INFO: loaded from: classes9.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ uj.a f63014c = kotlin.enums.a.a(d());

    /* JADX INFO: compiled from: CoroutineStart.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static uj.a<CoroutineStart> getEntries() {
        return f63014c;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <R, T> void invoke(p<? super R, ? super rj.c<? super T>, ? extends Object> pVar, R r10, rj.c<? super T> cVar) {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            tk.a.b(pVar, r10, cVar);
            return;
        }
        if (i10 == 2) {
            rj.d.a(pVar, r10, cVar);
        } else if (i10 == 3) {
            tk.b.a(pVar, r10, cVar);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
