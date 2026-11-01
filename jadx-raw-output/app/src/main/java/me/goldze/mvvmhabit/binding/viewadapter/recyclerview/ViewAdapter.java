package me.goldze.mvvmhabit.binding.viewadapter.recyclerview;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;
import ul.b;

/* JADX INFO: loaded from: classes11.dex */
public class ViewAdapter {

    public static class OnScrollListener extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PublishSubject<Integer> f64438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b<Integer> f64439b;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int childCount = linearLayoutManager.getChildCount();
            if (childCount + linearLayoutManager.findFirstVisibleItemPosition() >= linearLayoutManager.getItemCount() && this.f64439b != null) {
                this.f64438a.onNext(Integer.valueOf(recyclerView.getAdapter().getItemCount()));
            }
        }
    }

    @BindingAdapter({"itemAnimator"})
    public static void a(RecyclerView recyclerView, RecyclerView.ItemAnimator itemAnimator) {
        recyclerView.setItemAnimator(itemAnimator);
    }

    @BindingAdapter({"layoutManager"})
    public static void b(RecyclerView recyclerView, a.e eVar) {
        recyclerView.setLayoutManager(eVar.a(recyclerView));
    }
}
