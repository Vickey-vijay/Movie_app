package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f78052a = nj.q0.j(com.safedk.android.utils.g.f44979y, "yads", "com.monetization.ads", "com.yandex.div");

    public static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((bn0) obj).f75908a == cn0.f76327b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (lk.a0.X(stackTraceElement.toString(), ((bn0) it.next()).f75909b, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(StackTraceElement[] stackTraceElementArr, Set set) {
        String className;
        StackTraceElement stackTraceElement;
        String className2;
        String className3;
        ArrayList<bn0> arrayList = new ArrayList();
        for (Object obj : set) {
            if (((bn0) obj).f75908a == cn0.f76328c) {
                arrayList.add(obj);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            for (bn0 bn0Var : arrayList) {
                String string = Arrays.toString(stackTraceElementArr);
                ck.p.i(string, "toString(...)");
                if (lk.a0.X(string, bn0Var.f75909b, false, 2, null)) {
                    return false;
                }
            }
        }
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i10];
            String className4 = stackTraceElement2.getClassName();
            Set set2 = f78052a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (lk.x.R(className4, (String) it.next(), false, 2, null)) {
                        if (!a(stackTraceElement2, set)) {
                            break;
                        }
                        break;
                    }
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return false;
        }
        loop4: do {
            i10++;
            StackTraceElement stackTraceElement3 = (StackTraceElement) nj.n.R(stackTraceElementArr, i10);
            if (stackTraceElement3 != null && !a(stackTraceElement3, set) && (stackTraceElement = (StackTraceElement) nj.n.R(stackTraceElementArr, i10)) != null && (className2 = stackTraceElement.getClassName()) != null) {
                Set set3 = f78052a;
                if ((set3 instanceof Collection) && set3.isEmpty()) {
                    break;
                }
                Iterator it2 = set3.iterator();
                do {
                    if (!it2.hasNext()) {
                        break loop4;
                    }
                } while (!lk.x.R(className2, (String) it2.next(), false, 2, null));
                StackTraceElement stackTraceElement4 = (StackTraceElement) nj.n.R(stackTraceElementArr, i10);
                if (stackTraceElement4 == null || (className3 = stackTraceElement4.getClassName()) == null) {
                    break;
                }
            } else {
                break;
            }
        } while (!ck.p.e(className3, CallbackStackTraceMarker.class.getName()));
        StackTraceElement stackTraceElement5 = (StackTraceElement) nj.n.R(stackTraceElementArr, i10);
        if (stackTraceElement5 != null && (className = stackTraceElement5.getClassName()) != null && ck.p.e(className, CallbackStackTraceMarker.class.getName())) {
            z10 = true;
        }
        return !z10;
    }
}
