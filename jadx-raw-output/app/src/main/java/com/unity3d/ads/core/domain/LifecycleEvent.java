package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface LifecycleEvent {

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class Created implements LifecycleEvent {
        private final WeakReference<Activity> activity;
        private final Bundle bundle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Created copy$default(Created created, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = created.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Bundle component2() {
            return this.bundle;
        }

        public final Created copy(WeakReference<Activity> weakReference, Bundle bundle) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Created(weakReference, bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Created)) {
                return false;
            }
            Created created = (Created) obj;
            return p.e(getActivity(), created.getActivity()) && p.e(this.bundle, created.bundle);
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            return "Created(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }

        public Created(WeakReference<Activity> weakReference, Bundle bundle) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
            this.bundle = bundle;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }
    }

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class Destroyed implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Destroyed copy$default(Destroyed destroyed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = destroyed.getActivity();
            }
            return destroyed.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Destroyed copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Destroyed(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Destroyed) && p.e(getActivity(), ((Destroyed) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Destroyed(activity=" + getActivity() + ')';
        }

        public Destroyed(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class Paused implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Paused copy$default(Paused paused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = paused.getActivity();
            }
            return paused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Paused copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Paused(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paused) && p.e(getActivity(), ((Paused) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Paused(activity=" + getActivity() + ')';
        }

        public Paused(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class Resumed implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resumed copy$default(Resumed resumed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = resumed.getActivity();
            }
            return resumed.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Resumed copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Resumed(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resumed) && p.e(getActivity(), ((Resumed) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Resumed(activity=" + getActivity() + ')';
        }

        public Resumed(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class SaveInstanceState implements LifecycleEvent {
        private final WeakReference<Activity> activity;
        private final Bundle bundle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveInstanceState copy$default(SaveInstanceState saveInstanceState, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = saveInstanceState.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Bundle component2() {
            return this.bundle;
        }

        public final SaveInstanceState copy(WeakReference<Activity> weakReference, Bundle bundle) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new SaveInstanceState(weakReference, bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveInstanceState)) {
                return false;
            }
            SaveInstanceState saveInstanceState = (SaveInstanceState) obj;
            return p.e(getActivity(), saveInstanceState.getActivity()) && p.e(this.bundle, saveInstanceState.bundle);
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            return "SaveInstanceState(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }

        public SaveInstanceState(WeakReference<Activity> weakReference, Bundle bundle) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
            this.bundle = bundle;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }
    }

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class Started implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Started copy$default(Started started, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = started.getActivity();
            }
            return started.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Started copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Started(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && p.e(getActivity(), ((Started) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Started(activity=" + getActivity() + ')';
        }

        public Started(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    public static final class Stopped implements LifecycleEvent {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stopped copy$default(Stopped stopped, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = stopped.getActivity();
            }
            return stopped.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Stopped copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Stopped(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stopped) && p.e(getActivity(), ((Stopped) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Stopped(activity=" + getActivity() + ')';
        }

        public Stopped(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    WeakReference<Activity> getActivity();
}
