package me.goldze.mvvmhabit.binding.viewadapter.recyclerview;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: compiled from: LayoutManagers.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LayoutManagers.java */
    public class C0585a implements e {
        @Override // me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.e
        public RecyclerView.LayoutManager a(RecyclerView recyclerView) {
            return new LinearLayoutManager(recyclerView.getContext());
        }
    }

    /* JADX INFO: compiled from: LayoutManagers.java */
    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f64440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f64441b;

        public b(int i10, boolean z10) {
            this.f64440a = i10;
            this.f64441b = z10;
        }

        @Override // me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.e
        public RecyclerView.LayoutManager a(RecyclerView recyclerView) {
            return new LinearLayoutManager(recyclerView.getContext(), this.f64440a, this.f64441b);
        }
    }

    /* JADX INFO: compiled from: LayoutManagers.java */
    public class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f64442a;

        public c(int i10) {
            this.f64442a = i10;
        }

        @Override // me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.e
        public RecyclerView.LayoutManager a(RecyclerView recyclerView) {
            return new GridLayoutManager(recyclerView.getContext(), this.f64442a);
        }
    }

    /* JADX INFO: compiled from: LayoutManagers.java */
    public class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f64443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f64444b;

        public d(int i10, int i11) {
            this.f64443a = i10;
            this.f64444b = i11;
        }

        @Override // me.goldze.mvvmhabit.binding.viewadapter.recyclerview.a.e
        public RecyclerView.LayoutManager a(RecyclerView recyclerView) {
            return new StaggeredGridLayoutManager(this.f64443a, this.f64444b);
        }
    }

    /* JADX INFO: compiled from: LayoutManagers.java */
    public interface e {
        RecyclerView.LayoutManager a(RecyclerView recyclerView);
    }

    public static e a(int i10) {
        return new c(i10);
    }

    public static e b() {
        return new C0585a();
    }

    public static e c(int i10, boolean z10) {
        return new b(i10, z10);
    }

    public static e d(int i10, int i11) {
        return new d(i10, i11);
    }
}
