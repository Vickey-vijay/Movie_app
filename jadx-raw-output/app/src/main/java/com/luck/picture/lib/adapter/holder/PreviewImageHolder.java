package com.luck.picture.lib.adapter.holder;

import android.view.View;
import androidx.annotation.NonNull;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import m8.j;

/* JADX INFO: loaded from: classes10.dex */
public class PreviewImageHolder extends BasePreviewHolder {

    public class a implements j {
        public a() {
        }

        @Override // m8.j
        public void a(View view, float f10, float f11) {
            BasePreviewHolder.a aVar = PreviewImageHolder.this.f32060r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32121b;

        public b(LocalMedia localMedia) {
            this.f32121b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.a aVar = PreviewImageHolder.this.f32060r;
            if (aVar == null) {
                return false;
            }
            aVar.a(this.f32121b);
            return false;
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void c(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void f(LocalMedia localMedia, int i10, int i11) {
        if (PictureSelectionConfig.K0 != null) {
            String strF = localMedia.f();
            if (i10 == -1 && i11 == -1) {
                PictureSelectionConfig.K0.a(this.itemView.getContext(), strF, this.f32059q);
            } else {
                PictureSelectionConfig.K0.c(this.itemView.getContext(), this.f32059q, strF, i10, i11);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void g() {
        this.f32059q.setOnViewTapListener(new a());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void h(LocalMedia localMedia) {
        this.f32059q.setOnLongClickListener(new b(localMedia));
    }

    public PreviewImageHolder(@NonNull View view) {
        super(view);
    }
}
