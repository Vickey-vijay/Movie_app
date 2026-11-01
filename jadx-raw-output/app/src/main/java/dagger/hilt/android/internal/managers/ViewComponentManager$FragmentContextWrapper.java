package dagger.hilt.android.internal.managers;

import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1, reason: invalid class name */
    public class AnonymousClass1 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                ViewComponentManager$FragmentContextWrapper.a(null, null);
                ViewComponentManager$FragmentContextWrapper.b(null, null);
                ViewComponentManager$FragmentContextWrapper.c(null, null);
            }
        }
    }

    public static /* synthetic */ Fragment a(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, Fragment fragment) {
        throw null;
    }

    public static /* synthetic */ LayoutInflater b(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, LayoutInflater layoutInflater) {
        throw null;
    }

    public static /* synthetic */ LayoutInflater c(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper, LayoutInflater layoutInflater) {
        throw null;
    }
}
