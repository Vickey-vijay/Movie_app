package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.navigation.NavDestination;
import bk.l;
import ck.p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt___SequencesKt;
import mj.r;
import nj.b0;

/* JADX INFO: compiled from: Navigator.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002()B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000f\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J7\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "Landroidx/navigation/NavigatorState;", "state", "Lmj/r;", "onAttach", "createDestination", "()Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "backStackEntry", "onLaunchSingleTop", "destination", "Landroid/os/Bundle;", "args", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "popUpTo", "", "savedState", "popBackStack", "onSaveState", "onRestoreState", "_state", "Landroidx/navigation/NavigatorState;", "<set-?>", "isAttached", "Z", "()Z", "getState", "()Landroidx/navigation/NavigatorState;", "<init>", "()V", "Extras", "Name", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public abstract class Navigator<D extends NavDestination> {
    private NavigatorState _state;
    private boolean isAttached;

    /* JADX INFO: compiled from: Navigator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Extras {
    }

    /* JADX INFO: compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", "value", "", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    public abstract D createDestination();

    public NavDestination navigate(D destination, Bundle args, NavOptions navOptions, Extras navigatorExtras) {
        p.j(destination, "destination");
        return destination;
    }

    public void onRestoreState(Bundle bundle) {
        p.j(bundle, "savedState");
    }

    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public void navigate(List<NavBackStackEntry> list, final NavOptions navOptions, final Extras extras) {
        p.j(list, "entries");
        Iterator it = SequencesKt___SequencesKt.B(SequencesKt___SequencesKt.K(b0.S(list), new l<NavBackStackEntry, NavBackStackEntry>(this) { // from class: androidx.navigation.Navigator.navigate.1
            public final /* synthetic */ Navigator<D> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // bk.l
            public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
                NavDestination navDestinationNavigate;
                p.j(navBackStackEntry, "backStackEntry");
                NavDestination destination = navBackStackEntry.getDestination();
                if (!(destination instanceof NavDestination)) {
                    destination = null;
                }
                if (destination != null && (navDestinationNavigate = this.this$0.navigate(destination, navBackStackEntry.getArguments(), navOptions, extras)) != null) {
                    return p.e(navDestinationNavigate, destination) ? navBackStackEntry : this.this$0.getState().createBackStackEntry(navDestinationNavigate, navDestinationNavigate.addInDefaultArgs(navBackStackEntry.getArguments()));
                }
                return null;
            }
        })).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        p.j(navBackStackEntry, "backStackEntry");
        NavDestination destination = navBackStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new l<NavOptionsBuilder, r>() { // from class: androidx.navigation.Navigator.onLaunchSingleTop.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(NavOptionsBuilder navOptionsBuilder) {
                invoke2(navOptionsBuilder);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavOptionsBuilder navOptionsBuilder) {
                p.j(navOptionsBuilder, "$this$navOptions");
                navOptionsBuilder.setLaunchSingleTop(true);
            }
        }), null);
        getState().onLaunchSingleTop(navBackStackEntry);
    }

    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z10) {
        p.j(navBackStackEntry, "popUpTo");
        List<NavBackStackEntry> value = getState().getBackStack().getValue();
        if (!value.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + value).toString());
        }
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        NavBackStackEntry navBackStackEntryPrevious = null;
        while (popBackStack()) {
            navBackStackEntryPrevious = listIterator.previous();
            if (p.e(navBackStackEntryPrevious, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntryPrevious != null) {
            getState().pop(navBackStackEntryPrevious, z10);
        }
    }

    @CallSuper
    public void onAttach(NavigatorState navigatorState) {
        p.j(navigatorState, "state");
        this._state = navigatorState;
        this.isAttached = true;
    }
}
