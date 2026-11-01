package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: FocusRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface FocusState {

    /* JADX INFO: compiled from: FocusRepository.kt */
    public static final class Focused implements FocusState {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Focused copy$default(Focused focused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = focused.getActivity();
            }
            return focused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Focused copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Focused(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Focused) && p.e(getActivity(), ((Focused) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Focused(activity=" + getActivity() + ')';
        }

        public Focused(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    /* JADX INFO: compiled from: FocusRepository.kt */
    public static final class Unfocused implements FocusState {
        private final WeakReference<Activity> activity;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unfocused copy$default(Unfocused unfocused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = unfocused.getActivity();
            }
            return unfocused.copy(weakReference);
        }

        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        public final Unfocused copy(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Unfocused(weakReference);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unfocused) && p.e(getActivity(), ((Unfocused) obj).getActivity());
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Unfocused(activity=" + getActivity() + ')';
        }

        public Unfocused(WeakReference<Activity> weakReference) {
            p.j(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }
    }

    WeakReference<Activity> getActivity();
}
