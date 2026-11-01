package com.fyber.inneractive.sdk.flow.endcard;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes.dex */
public final class w extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f15435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f15436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f15437e;

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f15437e;
    }

    public w(v vVar) {
        super(vVar);
        ImageView imageView = new ImageView(IAConfigManager.O.f15027v.a());
        imageView.setId(R.id.ia_inneractive_vast_endcard_static);
        this.f15436d = imageView;
        this.f15437e = a.a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        com.fyber.inneractive.sdk.util.v.a(b());
        Bitmap bitmap = this.f15435c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f15435c = null;
        this.f15436d.setImageBitmap(null);
    }
}
