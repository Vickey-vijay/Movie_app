package androidx.navigation;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigatorProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\u0006\u0010\n\u001a/\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n\u001a\u001d\u0010\u000e\u001a\u00020\r*\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¨\u0006\u000f"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "T", "Landroidx/navigation/NavigatorProvider;", "", "name", "get", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;)Landroidx/navigation/Navigator;", "Ljk/c;", "clazz", "(Landroidx/navigation/NavigatorProvider;Ljk/c;)Landroidx/navigation/Navigator;", "navigator", "set", "Lmj/r;", "plusAssign", "navigation-common_release"}, k = 2, mv = {1, 6, 0})
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String str) {
        p.j(navigatorProvider, "<this>");
        p.j(str, "name");
        return (T) navigatorProvider.getNavigator(str);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, jk.c<T> cVar) {
        p.j(navigatorProvider, "<this>");
        p.j(cVar, "clazz");
        return (T) navigatorProvider.getNavigator(ak.a.a(cVar));
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        p.j(navigatorProvider, "<this>");
        p.j(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String str, Navigator<? extends NavDestination> navigator) {
        p.j(navigatorProvider, "<this>");
        p.j(str, "name");
        p.j(navigator, "navigator");
        return navigatorProvider.addNavigator(str, navigator);
    }
}
