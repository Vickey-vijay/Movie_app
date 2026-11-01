package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import ck.p;
import ck.s;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aV\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aF\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aJ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u001aZ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013²\u0006\u0018\u0010\u0012\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0012\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lmj/g;", "viewModels", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "activityViewModels", "Ljk/c;", "viewModelClass", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "createViewModelLazy", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class FragmentViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass1 extends Lambda implements bk.a<ViewModelStore> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            p.i(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass2 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            p.i(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            p.i(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$4, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements bk.a<ViewModelStore> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            p.i(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$5, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ bk.a<CreationExtras> $extrasProducer;
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(bk.a<? extends CreationExtras> aVar, Fragment fragment) {
            super(0);
            this.$extrasProducer = aVar;
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            bk.a<CreationExtras> aVar = this.$extrasProducer;
            if (aVar != null && (creationExtrasInvoke = aVar.invoke()) != null) {
                return creationExtrasInvoke;
            }
            CreationExtras defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            p.i(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$6, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass6 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            p.i(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class C08352 extends Lambda implements bk.a<ViewModelStore> {
        public final /* synthetic */ mj.g<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08352(mj.g<? extends ViewModelStoreOwner> gVar) {
            super(0);
            this.$owner$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.m13viewModels$lambda0(this.$owner$delegate).getViewModelStore();
            p.i(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class C08363 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ mj.g<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08363(mj.g<? extends ViewModelStoreOwner> gVar) {
            super(0);
            this.$owner$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            ViewModelStoreOwner viewModelStoreOwnerM13viewModels$lambda0 = FragmentViewModelLazyKt.m13viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13viewModels$lambda0 : null;
            CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$4, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class C08374 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ mj.g<ViewModelStoreOwner> $owner$delegate;
        public final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08374(Fragment fragment, mj.g<? extends ViewModelStoreOwner> gVar) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM13viewModels$lambda0 = FragmentViewModelLazyKt.m13viewModels$lambda0(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM13viewModels$lambda0 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM13viewModels$lambda0 : null;
            if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            }
            p.i(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$6, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class C08396 extends Lambda implements bk.a<ViewModelStore> {
        public final /* synthetic */ mj.g<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C08396(mj.g<? extends ViewModelStoreOwner> gVar) {
            super(0);
            this.$owner$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = FragmentViewModelLazyKt.m14viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            p.i(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$7, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ bk.a<CreationExtras> $extrasProducer;
        public final /* synthetic */ mj.g<ViewModelStoreOwner> $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(bk.a<? extends CreationExtras> aVar, mj.g<? extends ViewModelStoreOwner> gVar) {
            super(0);
            this.$extrasProducer = aVar;
            this.$owner$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            bk.a<CreationExtras> aVar = this.$extrasProducer;
            if (aVar != null && (creationExtrasInvoke = aVar.invoke()) != null) {
                return creationExtrasInvoke;
            }
            ViewModelStoreOwner viewModelStoreOwnerM14viewModels$lambda1 = FragmentViewModelLazyKt.m14viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14viewModels$lambda1 : null;
            CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$8, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ mj.g<ViewModelStoreOwner> $owner$delegate;
        public final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Fragment fragment, mj.g<? extends ViewModelStoreOwner> gVar) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerM14viewModels$lambda1 = FragmentViewModelLazyKt.m14viewModels$lambda1(this.$owner$delegate);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM14viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM14viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            }
            p.i(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> mj.g<VM> activityViewModels(Fragment fragment, bk.a<? extends ViewModelProvider.Factory> aVar) {
        p.j(fragment, "<this>");
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fragment);
        if (aVar == null) {
            aVar = new AnonymousClass3(fragment);
        }
        return createViewModelLazy(fragment, cVarB, anonymousClass1, anonymousClass2, aVar);
    }

    public static /* synthetic */ mj.g activityViewModels$default(Fragment fragment, bk.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        p.j(fragment, "<this>");
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(fragment);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fragment);
        if (aVar == null) {
            aVar = new AnonymousClass3(fragment);
        }
        return createViewModelLazy(fragment, cVarB, anonymousClass1, anonymousClass2, aVar);
    }

    @MainThread
    public static final /* synthetic */ mj.g createViewModelLazy(final Fragment fragment, jk.c cVar, bk.a aVar, bk.a aVar2) {
        p.j(fragment, "<this>");
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        return createViewModelLazy(fragment, cVar, aVar, new bk.a<CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                p.i(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, aVar2);
    }

    public static /* synthetic */ mj.g createViewModelLazy$default(Fragment fragment, jk.c cVar, bk.a aVar, bk.a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(fragment, cVar, aVar, aVar2);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> mj.g<VM> viewModels(Fragment fragment, bk.a<? extends ViewModelStoreOwner> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2) {
        p.j(fragment, "<this>");
        p.j(aVar, "ownerProducer");
        mj.g gVarB = kotlin.b.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        C08352 c08352 = new C08352(gVarB);
        C08363 c08363 = new C08363(gVarB);
        if (aVar2 == null) {
            aVar2 = new C08374(fragment, gVarB);
        }
        return createViewModelLazy(fragment, cVarB, c08352, c08363, aVar2);
    }

    public static /* synthetic */ mj.g viewModels$default(final Fragment fragment, bk.a aVar, bk.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new bk.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        p.j(fragment, "<this>");
        p.j(aVar, "ownerProducer");
        mj.g gVarB = kotlin.b.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        C08352 c08352 = new C08352(gVarB);
        C08363 c08363 = new C08363(gVarB);
        if (aVar2 == null) {
            aVar2 = new C08374(fragment, gVarB);
        }
        return createViewModelLazy(fragment, cVarB, c08352, c08363, aVar2);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> mj.g<VM> activityViewModels(Fragment fragment, bk.a<? extends CreationExtras> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2) {
        p.j(fragment, "<this>");
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(fragment);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass6(fragment);
        }
        return createViewModelLazy(fragment, cVarB, anonymousClass4, anonymousClass5, aVar2);
    }

    @MainThread
    public static final <VM extends ViewModel> mj.g<VM> createViewModelLazy(final Fragment fragment, jk.c<VM> cVar, bk.a<? extends ViewModelStore> aVar, bk.a<? extends CreationExtras> aVar2, bk.a<? extends ViewModelProvider.Factory> aVar3) {
        p.j(fragment, "<this>");
        p.j(cVar, "viewModelClass");
        p.j(aVar, "storeProducer");
        p.j(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new bk.a<ViewModelProvider.Factory>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                    p.i(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            };
        }
        return new ViewModelLazy(cVar, aVar, aVar3, aVar2);
    }

    public static /* synthetic */ mj.g createViewModelLazy$default(final Fragment fragment, jk.c cVar, bk.a aVar, bk.a aVar2, bk.a aVar3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar2 = new bk.a<CreationExtras>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy.2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final CreationExtras invoke() {
                    CreationExtras defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    p.i(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
            };
        }
        if ((i10 & 8) != 0) {
            aVar3 = null;
        }
        return createViewModelLazy(fragment, cVar, aVar, aVar2, aVar3);
    }

    public static /* synthetic */ mj.g activityViewModels$default(Fragment fragment, bk.a aVar, bk.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        p.j(fragment, "<this>");
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(fragment);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass6(fragment);
        }
        return createViewModelLazy(fragment, cVarB, anonymousClass4, anonymousClass5, aVar2);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> mj.g<VM> viewModels(Fragment fragment, bk.a<? extends ViewModelStoreOwner> aVar, bk.a<? extends CreationExtras> aVar2, bk.a<? extends ViewModelProvider.Factory> aVar3) {
        p.j(fragment, "<this>");
        p.j(aVar, "ownerProducer");
        mj.g gVarB = kotlin.b.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(aVar));
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        C08396 c08396 = new C08396(gVarB);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar2, gVarB);
        if (aVar3 == null) {
            aVar3 = new AnonymousClass8(fragment, gVarB);
        }
        return createViewModelLazy(fragment, cVarB, c08396, anonymousClass7, aVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m13viewModels$lambda0(mj.g<? extends ViewModelStoreOwner> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m14viewModels$lambda1(mj.g<? extends ViewModelStoreOwner> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ mj.g viewModels$default(final Fragment fragment, bk.a aVar, bk.a aVar2, bk.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new bk.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.5
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        if ((i10 & 4) != 0) {
            aVar3 = null;
        }
        p.j(fragment, "<this>");
        p.j(aVar, "ownerProducer");
        mj.g gVarB = kotlin.b.b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(aVar));
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        C08396 c08396 = new C08396(gVarB);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar2, gVarB);
        if (aVar3 == null) {
            aVar3 = new AnonymousClass8(fragment, gVarB);
        }
        return createViewModelLazy(fragment, cVarB, c08396, anonymousClass7, aVar3);
    }
}
