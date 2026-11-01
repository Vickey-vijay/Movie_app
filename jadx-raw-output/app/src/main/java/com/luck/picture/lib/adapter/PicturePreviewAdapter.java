package com.luck.picture.lib.adapter;

import a8.b;
import a8.d;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewAudioHolder;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PicturePreviewAdapter extends RecyclerView.Adapter<BasePreviewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<LocalMedia> f32050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BasePreviewHolder.a f32051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<Integer, BasePreviewHolder> f32052k = new LinkedHashMap<>();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public BasePreviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 2) {
            int iA = b.a(viewGroup.getContext(), 8);
            if (iA == 0) {
                iA = R$layout.ps_preview_video;
            }
            return BasePreviewHolder.d(viewGroup, i10, iA);
        }
        if (i10 == 3) {
            int iA2 = b.a(viewGroup.getContext(), 10);
            if (iA2 == 0) {
                iA2 = R$layout.ps_preview_audio;
            }
            return BasePreviewHolder.d(viewGroup, i10, iA2);
        }
        int iA3 = b.a(viewGroup.getContext(), 7);
        if (iA3 == 0) {
            iA3 = R$layout.ps_preview_image;
        }
        return BasePreviewHolder.d(viewGroup, i10, iA3);
    }

    public BasePreviewHolder c(int i10) {
        return this.f32052k.get(Integer.valueOf(i10));
    }

    public LocalMedia d(int i10) {
        if (i10 > this.f32050i.size()) {
            return null;
        }
        return this.f32050i.get(i10);
    }

    public void destroy() {
        Iterator<Integer> it = this.f32052k.keySet().iterator();
        while (it.hasNext()) {
            BasePreviewHolder basePreviewHolder = this.f32052k.get(it.next());
            if (basePreviewHolder instanceof PreviewVideoHolder) {
                ((PreviewVideoHolder) basePreviewHolder).w();
            } else if (basePreviewHolder instanceof PreviewAudioHolder) {
                ((PreviewAudioHolder) basePreviewHolder).F();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull BasePreviewHolder basePreviewHolder, int i10) {
        basePreviewHolder.l(this.f32051j);
        LocalMedia localMediaD = d(i10);
        this.f32052k.put(Integer.valueOf(i10), basePreviewHolder);
        basePreviewHolder.b(localMediaD, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<LocalMedia> list = this.f32050i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (d.i(this.f32050i.get(i10).s())) {
            return 2;
        }
        return d.d(this.f32050i.get(i10).s()) ? 3 : 1;
    }

    public void k(List<LocalMedia> list) {
        this.f32050i = list;
    }

    public void l(BasePreviewHolder.a aVar) {
        this.f32051j = aVar;
    }

    public boolean e(int i10) {
        BasePreviewHolder basePreviewHolderC = c(i10);
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            return ((PreviewVideoHolder) basePreviewHolderC).r();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull BasePreviewHolder basePreviewHolder) {
        super.onViewAttachedToWindow(basePreviewHolder);
        basePreviewHolder.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull BasePreviewHolder basePreviewHolder) {
        super.onViewDetachedFromWindow(basePreviewHolder);
        basePreviewHolder.j();
    }

    public void j(int i10) {
        BasePreviewHolder basePreviewHolderC = c(i10);
        if (basePreviewHolderC != null) {
            LocalMedia localMediaD = d(i10);
            if (localMediaD.D() == 0 && localMediaD.q() == 0) {
                basePreviewHolderC.f32059q.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                basePreviewHolderC.f32059q.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    public void m(int i10) {
        BasePreviewHolder basePreviewHolderC = c(i10);
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderC;
            if (!previewVideoHolder.r()) {
                previewVideoHolder.f32123s.setVisibility(0);
            }
        }
    }

    public void n(int i10) {
        BasePreviewHolder basePreviewHolderC = c(i10);
        if (basePreviewHolderC instanceof PreviewVideoHolder) {
            ((PreviewVideoHolder) basePreviewHolderC).x();
        }
    }
}
