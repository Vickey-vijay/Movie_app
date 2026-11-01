package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import ck.p;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import jk.c;
import kotlin.Metadata;

/* JADX INFO: compiled from: DialogFragmentNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
@NavDestinationDsl
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rB)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", BillingClientBuilderBridgeCommon.buildMethodName, "Ljk/c;", "Landroidx/fragment/app/DialogFragment;", "fragmentClass", "Ljk/c;", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILjk/c;)V", "", "route", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Ljava/lang/String;Ljk/c;)V", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private c<? extends DialogFragment> fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, @IdRes int i10, c<? extends DialogFragment> cVar) {
        super(dialogFragmentNavigator, i10);
        p.j(dialogFragmentNavigator, "navigator");
        p.j(cVar, "fragmentClass");
        this.fragmentClass = cVar;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public DialogFragmentNavigator.Destination build() {
        DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) super.build();
        String name = ak.a.a(this.fragmentClass).getName();
        p.i(name, "fragmentClass.java.name");
        destination.setClassName(name);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, String str, c<? extends DialogFragment> cVar) {
        super(dialogFragmentNavigator, str);
        p.j(dialogFragmentNavigator, "navigator");
        p.j(str, "route");
        p.j(cVar, "fragmentClass");
        this.fragmentClass = cVar;
    }
}
