package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import ck.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import mj.g;

/* JADX INFO: compiled from: NavArgsLazy.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lmj/g;", "", "isInitialized", "Ljk/c;", "navArgsClass", "Ljk/c;", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "Lbk/a;", "cached", "Landroidx/navigation/NavArgs;", "getValue", "()Landroidx/navigation/NavArgs;", "value", "<init>", "(Ljk/c;Lbk/a;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public final class NavArgsLazy<Args extends NavArgs> implements g<Args> {
    private final bk.a<Bundle> argumentProducer;
    private Args cached;
    private final jk.c<Args> navArgsClass;

    public NavArgsLazy(jk.c<Args> cVar, bk.a<Bundle> aVar) {
        p.j(cVar, "navArgsClass");
        p.j(aVar, "argumentProducer");
        this.navArgsClass = cVar;
        this.argumentProducer = aVar;
    }

    @Override // mj.g
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class clsA = ak.a.a(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = clsA.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            p.i(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }
}
