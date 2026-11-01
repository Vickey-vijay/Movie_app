package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R$id;
import com.yalantis.ucrop.R$layout;
import com.yalantis.ucrop.R$styleable;
import gd.c;
import gd.d;

/* JADX INFO: loaded from: classes9.dex */
public class UCropView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureCropImageView f45747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OverlayView f45748c;

    public class a implements c {
        public a() {
        }

        @Override // gd.c
        public void a(float f10) {
            UCropView.this.f45748c.setTargetAspectRatio(f10);
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // gd.d
        public void a(float f10, float f11) {
            UCropView.this.f45747b.i(f10, f11);
        }

        @Override // gd.d
        public void b(RectF rectF) {
            UCropView.this.f45747b.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R$layout.ucrop_view, (ViewGroup) this, true);
        this.f45747b = (GestureCropImageView) findViewById(R$id.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(R$id.view_overlay);
        this.f45748c = overlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ucrop_UCropView);
        overlayView.j(typedArrayObtainStyledAttributes);
        this.f45747b.x(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    public final void c() {
        this.f45747b.setCropBoundsChangeListener(new a());
        this.f45748c.setOverlayViewChangeListener(new b());
    }

    @NonNull
    public GestureCropImageView getCropImageView() {
        return this.f45747b;
    }

    @NonNull
    public OverlayView getOverlayView() {
        return this.f45748c;
    }
}
