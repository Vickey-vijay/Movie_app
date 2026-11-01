package androidx.navigation;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavArgsLazy.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\".\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Ljava/lang/Class;", "Landroid/os/Bundle;", "methodSignature", "[Ljava/lang/Class;", "getMethodSignature", "()[Ljava/lang/Class;", "Landroidx/collection/ArrayMap;", "Ljk/c;", "Landroidx/navigation/NavArgs;", "Ljava/lang/reflect/Method;", "methodMap", "Landroidx/collection/ArrayMap;", "getMethodMap", "()Landroidx/collection/ArrayMap;", "navigation-common_release"}, k = 2, mv = {1, 6, 0})
public final class NavArgsLazyKt {
    private static final Class<Bundle>[] methodSignature = {Bundle.class};
    private static final ArrayMap<jk.c<? extends NavArgs>, Method> methodMap = new ArrayMap<>();

    public static final ArrayMap<jk.c<? extends NavArgs>, Method> getMethodMap() {
        return methodMap;
    }

    public static final Class<Bundle>[] getMethodSignature() {
        return methodSignature;
    }
}
