package tj;

import ck.p;
import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    public static final StackTraceElement d(BaseContinuationImpl baseContinuationImpl) {
        String strC;
        p.j(baseContinuationImpl, "<this>");
        d dVarB = b(baseContinuationImpl);
        if (dVarB == null) {
            return null;
        }
        a(1, dVarB.v());
        int iC = c(baseContinuationImpl);
        int i10 = iC < 0 ? -1 : dVarB.l()[iC];
        String strB = g.f72421a.b(baseContinuationImpl);
        if (strB == null) {
            strC = dVarB.c();
        } else {
            strC = strB + '/' + dVarB.c();
        }
        return new StackTraceElement(strC, dVarB.m(), dVarB.f(), i10);
    }

    public static final d b(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    public static final int c(BaseContinuationImpl baseContinuationImpl) {
        Integer num;
        int iIntValue;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return iIntValue - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
