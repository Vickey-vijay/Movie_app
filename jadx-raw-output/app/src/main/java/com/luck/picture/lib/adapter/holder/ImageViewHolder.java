package com.luck.picture.lib.adapter.holder;

import a8.d;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import o8.j;
import o8.q;

/* JADX INFO: loaded from: classes6.dex */
public class ImageViewHolder extends BaseRecyclerMediaHolder {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f32081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f32082x;

    public ImageViewHolder(View view, PictureSelectionConfig pictureSelectionConfig) {
        super(view, pictureSelectionConfig);
        this.f32082x = (TextView) view.findViewById(R$id.tv_media_tag);
        ImageView imageView = (ImageView) view.findViewById(R$id.ivEditor);
        this.f32081w = imageView;
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        int iN = selectMainStyleC.n();
        if (q.c(iN)) {
            imageView.setImageResource(iN);
        }
        int[] iArrM = selectMainStyleC.m();
        if (q.a(iArrM) && (imageView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).removeRule(12);
            for (int i10 : iArrM) {
                ((RelativeLayout.LayoutParams) this.f32081w.getLayoutParams()).addRule(i10);
            }
        }
        int[] iArrX = selectMainStyleC.x();
        if (q.a(iArrX) && (this.f32082x.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) this.f32082x.getLayoutParams()).removeRule(21);
            ((RelativeLayout.LayoutParams) this.f32082x.getLayoutParams()).removeRule(12);
            for (int i11 : iArrX) {
                ((RelativeLayout.LayoutParams) this.f32082x.getLayoutParams()).addRule(i11);
            }
        }
        int iW = selectMainStyleC.w();
        if (q.c(iW)) {
            this.f32082x.setBackgroundResource(iW);
        }
        int iZ = selectMainStyleC.z();
        if (q.b(iZ)) {
            this.f32082x.setTextSize(iZ);
        }
        int iY = selectMainStyleC.y();
        if (q.c(iY)) {
            this.f32082x.setTextColor(iY);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder
    public void e(LocalMedia localMedia, int i10) {
        super.e(localMedia, i10);
        if (localMedia.H() && localMedia.G()) {
            this.f32081w.setVisibility(0);
        } else {
            this.f32081w.setVisibility(8);
        }
        this.f32082x.setVisibility(0);
        if (d.f(localMedia.s())) {
            this.f32082x.setText(this.f32064o.getString(R$string.ps_gif_tag));
            return;
        }
        if (d.j(localMedia.s())) {
            this.f32082x.setText(this.f32064o.getString(R$string.ps_webp_tag));
        } else if (j.n(localMedia.D(), localMedia.q())) {
            this.f32082x.setText(this.f32064o.getString(R$string.ps_long_chart));
        } else {
            this.f32082x.setVisibility(8);
        }
    }
}
