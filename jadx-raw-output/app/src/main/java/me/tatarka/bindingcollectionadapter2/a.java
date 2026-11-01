package me.tatarka.bindingcollectionadapter2;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Q6;
import fm.c;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.collections.AsyncDiffObservableList;

/* JADX INFO: compiled from: BindingRecyclerViewAdapters.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    @BindingAdapter(requireAll = false, value = {"itemBinding", "items", Q6.G1, "itemIds", "viewHolder", "diffConfig"})
    public static <T> void a(RecyclerView recyclerView, c<T> cVar, List<T> list, BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter, BindingRecyclerViewAdapter.c<? super T> cVar2, BindingRecyclerViewAdapter.d dVar, AsyncDifferConfig<T> asyncDifferConfig) {
        if (cVar == null) {
            throw new IllegalArgumentException("itemBinding must not be null");
        }
        BindingRecyclerViewAdapter<T> bindingRecyclerViewAdapter2 = (BindingRecyclerViewAdapter) recyclerView.getAdapter();
        if (bindingRecyclerViewAdapter == null) {
            bindingRecyclerViewAdapter = bindingRecyclerViewAdapter2 == null ? new BindingRecyclerViewAdapter<>() : bindingRecyclerViewAdapter2;
        }
        bindingRecyclerViewAdapter.i(cVar);
        if (asyncDifferConfig == null || list == null) {
            bindingRecyclerViewAdapter.setItems(list);
        } else {
            int i10 = me.tatarka.bindingcollectionadapter2.recyclerview.R$id.bindingcollectiondapter_list_id;
            AsyncDiffObservableList asyncDiffObservableList = (AsyncDiffObservableList) recyclerView.getTag(i10);
            if (asyncDiffObservableList == null) {
                asyncDiffObservableList = new AsyncDiffObservableList(asyncDifferConfig);
                recyclerView.setTag(i10, asyncDiffObservableList);
                bindingRecyclerViewAdapter.setItems(asyncDiffObservableList);
            }
            asyncDiffObservableList.update(list);
        }
        bindingRecyclerViewAdapter.j(cVar2);
        bindingRecyclerViewAdapter.k(dVar);
        if (bindingRecyclerViewAdapter2 != bindingRecyclerViewAdapter) {
            recyclerView.setAdapter(bindingRecyclerViewAdapter);
        }
    }
}
