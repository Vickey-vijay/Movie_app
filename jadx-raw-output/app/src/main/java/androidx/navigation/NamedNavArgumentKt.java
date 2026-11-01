package androidx.navigation;

import bk.l;
import ck.p;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: NamedNavArgument.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\b"}, d2 = {"", "name", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "Lmj/r;", "builder", "Landroidx/navigation/NamedNavArgument;", "navArgument", "navigation-common_release"}, k = 2, mv = {1, 6, 0})
public final class NamedNavArgumentKt {
    public static final NamedNavArgument navArgument(String str, l<? super NavArgumentBuilder, r> lVar) {
        p.j(str, "name");
        p.j(lVar, "builder");
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        lVar.invoke(navArgumentBuilder);
        return new NamedNavArgument(str, navArgumentBuilder.build());
    }
}
