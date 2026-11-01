package androidx.navigation.ui;

import bk.a;
import ck.l;
import ck.p;
import kotlin.Metadata;
import mj.e;

/* JADX INFO: compiled from: AppBarConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
public final class AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener, l {
    private final /* synthetic */ a function;

    public AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(a aVar) {
        this.function = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof l)) {
            return p.e(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // ck.l
    public final e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        return ((Boolean) this.function.invoke()).booleanValue();
    }
}
