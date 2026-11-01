package androidx.navigation;

import bk.l;
import ck.p;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: NavDeepLinkDslBuilder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "Lmj/r;", "deepLinkBuilder", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "navigation-common_release"}, k = 2, mv = {1, 6, 0})
public final class NavDeepLinkDslBuilderKt {
    public static final NavDeepLink navDeepLink(l<? super NavDeepLinkDslBuilder, r> lVar) {
        p.j(lVar, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        lVar.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }
}
