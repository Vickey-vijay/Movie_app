package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlinx.coroutines.g;
import nk.j;
import qk.c;

/* JADX INFO: compiled from: ViewDataBindingKtx.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lqk/c;", "observable", "", "updateStateFlowRegistration", "Landroidx/databinding/CreateWeakListener;", "CREATE_STATE_FLOW_LISTENER", "Landroidx/databinding/CreateWeakListener;", "<init>", "()V", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewDataBindingKtx {
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();
    private static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.a
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener create(ViewDataBinding viewDataBinding, int i10, ReferenceQueue referenceQueue) {
            return ViewDataBindingKtx.m9CREATE_STATE_FLOW_LISTENER$lambda0(viewDataBinding, i10, referenceQueue);
        }
    };

    /* JADX INFO: compiled from: ViewDataBindingKtx.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u0016\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\tH\u0016J\u001a\u0010\f\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/ObservableReference;", "Lqk/c;", "", "Landroidx/lifecycle/LifecycleOwner;", "owner", "flow", "Lmj/r;", "startCollection", "Landroidx/databinding/WeakListener;", "getListener", TypedValues.AttributesType.S_TARGET, "addListener", "removeListener", "lifecycleOwner", "setLifecycleOwner", "Ljava/lang/ref/WeakReference;", "_lifecycleOwnerRef", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/g;", "observerJob", "Lkotlinx/coroutines/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/databinding/WeakListener;", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "databindingKtx_release"}, k = 1, mv = {1, 5, 1})
    public static final class StateFlowListener implements ObservableReference<c<? extends Object>> {
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;
        private final WeakListener<c<Object>> listener;
        private g observerJob;

        public StateFlowListener(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            p.j(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i10, this, referenceQueue);
        }

        private final void startCollection(LifecycleOwner lifecycleOwner, c<? extends Object> cVar) {
            g gVar = this.observerJob;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
            this.observerJob = j.d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, cVar, this, null), 3, null);
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(c<? extends Object> cVar) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            LifecycleOwner lifecycleOwner = weakReference == null ? null : weakReference.get();
            if (lifecycleOwner == null || cVar == null) {
                return;
            }
            startCollection(lifecycleOwner, cVar);
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<c<? extends Object>> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(c<? extends Object> cVar) {
            g gVar = this.observerJob;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
            this.observerJob = null;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference == null ? null : weakReference.get()) == lifecycleOwner) {
                return;
            }
            g gVar = this.observerJob;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            c<? extends Object> cVar = (c) this.listener.getTarget();
            if (cVar != null) {
                startCollection(lifecycleOwner, cVar);
            }
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CREATE_STATE_FLOW_LISTENER$lambda-0, reason: not valid java name */
    public static final WeakListener m9CREATE_STATE_FLOW_LISTENER$lambda0(ViewDataBinding viewDataBinding, int i10, ReferenceQueue referenceQueue) {
        p.i(referenceQueue, "referenceQueue");
        return new StateFlowListener(viewDataBinding, i10, referenceQueue).getListener();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(ViewDataBinding viewDataBinding, int localFieldId, c<?> observable) {
        p.j(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(localFieldId, observable, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
