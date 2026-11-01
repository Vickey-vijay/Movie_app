package com.mgs.carparking.ui.mine.collection;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import java.util.List;
import la.a;
import t9.d;
import t9.e;

/* JADX INFO: loaded from: classes7.dex */
public class CollectionListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f42092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoCollectionBeanEntry> f42093j;

    public void c(List<VideoCollectionBeanEntry> list) {
        this.f42093j = list;
    }

    public void d(a aVar) {
        this.f42092i = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (e.a(this.f42093j)) {
            return 0;
        }
        return this.f42093j.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        if (viewHolder instanceof d) {
            ((d) viewHolder).a(this.f42092i, this.f42093j.get(i10), Integer.valueOf(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return new CollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_collection, viewGroup, false));
    }
}
