package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavHostController.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0013"}, d2 = {"Landroidx/navigation/NavHostController;", "Landroidx/navigation/NavController;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lmj/r;", "setLifecycleOwner", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "", "enabled", "enableOnBackPressed", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(Context context) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // androidx.navigation.NavController
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
        super.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.navigation.NavController
    public final void setOnBackPressedDispatcher(OnBackPressedDispatcher onBackPressedDispatcher) {
        p.j(onBackPressedDispatcher, "dispatcher");
        super.setOnBackPressedDispatcher(onBackPressedDispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void enableOnBackPressed(boolean z10) {
        super.enableOnBackPressed(z10);
    }

    @Override // androidx.navigation.NavController
    public final void setViewModelStore(ViewModelStore viewModelStore) {
        p.j(viewModelStore, "viewModelStore");
        super.setViewModelStore(viewModelStore);
    }
}
