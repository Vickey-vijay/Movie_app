package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import ck.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MethodCallsLogger.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String str, int i10) {
        p.j(str, "name");
        Integer num = this.calledMethods.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & i10) != 0;
        this.calledMethods.put(str, Integer.valueOf(i10 | iIntValue));
        return !z10;
    }
}
