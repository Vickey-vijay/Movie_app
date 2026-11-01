package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    public static final class AnonymousClass1 extends Lambda implements bk.a<ViewModelStore> {
        public final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    public static final class AnonymousClass2 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    public static final class AnonymousClass3 extends Lambda implements bk.a<ViewModelStore> {
        public final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    public static final class AnonymousClass4 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ bk.a<CreationExtras> $extrasProducer;
        public final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(bk.a<? extends CreationExtras> aVar, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = aVar;
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            bk.a<CreationExtras> aVar = this.$extrasProducer;
            return (aVar == null || (creationExtrasInvoke = aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> mj.g<VM> viewModels(ComponentActivity componentActivity, bk.a<? extends ViewModelProvider.Factory> aVar) {
        ck.p.j(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        ck.p.p(4, "VM");
        return new ViewModelLazy(ck.s.b(ViewModel.class), new AnonymousClass1(componentActivity), aVar, new AnonymousClass2(componentActivity));
    }

    public static /* synthetic */ mj.g viewModels$default(ComponentActivity componentActivity, bk.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        ck.p.j(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        ck.p.p(4, "VM");
        return new ViewModelLazy(ck.s.b(ViewModel.class), new AnonymousClass1(componentActivity), aVar, new AnonymousClass2(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> mj.g<VM> viewModels(ComponentActivity componentActivity, bk.a<? extends CreationExtras> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2) {
        ck.p.j(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        ck.p.p(4, "VM");
        return new ViewModelLazy(ck.s.b(ViewModel.class), new AnonymousClass3(componentActivity), aVar2, new AnonymousClass4(aVar, componentActivity));
    }

    public static /* synthetic */ mj.g viewModels$default(ComponentActivity componentActivity, bk.a aVar, bk.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        ck.p.j(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        ck.p.p(4, "VM");
        return new ViewModelLazy(ck.s.b(ViewModel.class), new AnonymousClass3(componentActivity), aVar2, new AnonymousClass4(aVar, componentActivity));
    }
}
