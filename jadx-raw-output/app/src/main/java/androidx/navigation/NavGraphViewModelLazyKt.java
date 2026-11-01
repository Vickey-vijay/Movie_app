package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import ck.p;
import ck.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import mj.g;

/* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u001aP\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u001a<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u001aN\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "", "navGraphId", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lmj/g;", "navGraphViewModels", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "", "navGraphRoute", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0})
public final class NavGraphViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass1 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g<NavBackStackEntry> gVar) {
            super(0);
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m24navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass2 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g<NavBackStackEntry> gVar) {
            super(0);
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m24navGraphViewModels$lambda0(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;
        public final /* synthetic */ bk.a<CreationExtras> $extrasProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(bk.a<? extends CreationExtras> aVar, g<NavBackStackEntry> gVar) {
            super(0);
            this.$extrasProducer = aVar;
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            bk.a<CreationExtras> aVar = this.$extrasProducer;
            return (aVar == null || (creationExtrasInvoke = aVar.invoke()) == null) ? NavGraphViewModelLazyKt.m25navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$4, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(g<NavBackStackEntry> gVar) {
            super(0);
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m25navGraphViewModels$lambda1(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$5, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(g<NavBackStackEntry> gVar) {
            super(0);
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            return NavGraphViewModelLazyKt.m26navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$6, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass6 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(g<NavBackStackEntry> gVar) {
            super(0);
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m26navGraphViewModels$lambda2(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$7, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements bk.a<CreationExtras> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;
        public final /* synthetic */ bk.a<CreationExtras> $extrasProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(bk.a<? extends CreationExtras> aVar, g<NavBackStackEntry> gVar) {
            super(0);
            this.$extrasProducer = aVar;
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final CreationExtras invoke() {
            CreationExtras creationExtrasInvoke;
            bk.a<CreationExtras> aVar = this.$extrasProducer;
            return (aVar == null || (creationExtrasInvoke = aVar.invoke()) == null) ? NavGraphViewModelLazyKt.m27navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelCreationExtras() : creationExtrasInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraphViewModelLazyKt$navGraphViewModels$8, reason: invalid class name */
    /* JADX INFO: compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements bk.a<ViewModelProvider.Factory> {
        public final /* synthetic */ g<NavBackStackEntry> $backStackEntry$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(g<NavBackStackEntry> gVar) {
            super(0);
            this.$backStackEntry$delegate = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final ViewModelProvider.Factory invoke() {
            return NavGraphViewModelLazyKt.m27navGraphViewModels$lambda3(this.$backStackEntry$delegate).getDefaultViewModelProviderFactory();
        }
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> g<VM> navGraphViewModels(Fragment fragment, @IdRes int i10, bk.a<? extends ViewModelProvider.Factory> aVar) {
        p.j(fragment, "<this>");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(gVarA);
        if (aVar == null) {
            aVar = new AnonymousClass2(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, anonymousClass1, aVar);
    }

    public static /* synthetic */ g navGraphViewModels$default(Fragment fragment, int i10, bk.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        p.j(fragment, "<this>");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(gVarA);
        if (aVar == null) {
            aVar = new AnonymousClass2(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, anonymousClass1, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m24navGraphViewModels$lambda0(g<NavBackStackEntry> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m25navGraphViewModels$lambda1(g<NavBackStackEntry> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m26navGraphViewModels$lambda2(g<NavBackStackEntry> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m27navGraphViewModels$lambda3(g<NavBackStackEntry> gVar) {
        return gVar.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> g<VM> navGraphViewModels(Fragment fragment, @IdRes int i10, bk.a<? extends CreationExtras> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2) {
        p.j(fragment, "<this>");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(aVar, gVarA);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass4(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, anonymousClass3, aVar2);
    }

    public static /* synthetic */ g navGraphViewModels$default(Fragment fragment, int i10, bk.a aVar, bk.a aVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        p.j(fragment, "<this>");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i10));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(aVar, gVarA);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass4(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, anonymousClass3, aVar2);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> g<VM> navGraphViewModels(Fragment fragment, String str, bk.a<? extends ViewModelProvider.Factory> aVar) {
        p.j(fragment, "<this>");
        p.j(str, "navGraphRoute");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(gVarA);
        if (aVar == null) {
            aVar = new AnonymousClass6(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, anonymousClass5, aVar);
    }

    public static /* synthetic */ g navGraphViewModels$default(Fragment fragment, String str, bk.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        p.j(fragment, "<this>");
        p.j(str, "navGraphRoute");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(gVarA);
        if (aVar == null) {
            aVar = new AnonymousClass6(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, anonymousClass5, aVar);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> g<VM> navGraphViewModels(Fragment fragment, String str, bk.a<? extends CreationExtras> aVar, bk.a<? extends ViewModelProvider.Factory> aVar2) {
        p.j(fragment, "<this>");
        p.j(str, "navGraphRoute");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar, gVarA);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass8(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, anonymousClass7, aVar2);
    }

    public static /* synthetic */ g navGraphViewModels$default(Fragment fragment, String str, bk.a aVar, bk.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        p.j(fragment, "<this>");
        p.j(str, "navGraphRoute");
        g gVarA = kotlin.b.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, str));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(gVarA);
        p.p(4, "VM");
        jk.c cVarB = s.b(ViewModel.class);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(aVar, gVarA);
        if (aVar2 == null) {
            aVar2 = new AnonymousClass8(gVarA);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, cVarB, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, anonymousClass7, aVar2);
    }
}
