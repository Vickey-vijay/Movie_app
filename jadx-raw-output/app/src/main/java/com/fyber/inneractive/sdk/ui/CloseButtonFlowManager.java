package com.fyber.inneractive.sdk.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.o;

/* JADX INFO: loaded from: classes7.dex */
public class CloseButtonFlowManager implements com.fyber.inneractive.sdk.flow.storepromo.observer.a, CloseButtonConfigurationChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f18508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f18509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f18510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f18511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18512f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CloseButtonConfiguration f18513g = new CloseButtonConfiguration(this);

    @Override // com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener
    public final void a(CloseButtonConfiguration closeButtonConfiguration) {
        int i10;
        int i11;
        if (closeButtonConfiguration.f18505f) {
            this.f18507a.setVisibility(8);
            this.f18508b.setVisibility(8);
            this.f18510d.setVisibility(8);
            this.f18509c.setVisibility(8);
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration2 = this.f18513g;
        if (closeButtonConfiguration2.f18501b) {
            if (!closeButtonConfiguration2.f18502c || this.f18512f) {
                this.f18507a.setAlpha(1.0f);
                this.f18510d.setAlpha(1.0f);
            } else {
                this.f18507a.setAlpha(0.0f);
                this.f18510d.setAlpha(0.0f);
            }
            this.f18508b.setText("");
            this.f18508b.setVisibility(8);
            int i12 = closeButtonConfiguration2.f18503d;
            if (i12 >= 5) {
                int iA = o.a(i12);
                this.f18510d.getLayoutParams().width = iA;
                this.f18510d.getLayoutParams().height = iA;
            }
            int i13 = closeButtonConfiguration2.f18504e;
            if (i13 >= 5) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18510d.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f18507a.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f18509c.getLayoutParams();
                int iA2 = o.a(i13);
                int i14 = layoutParams.width;
                int i15 = iA2 - i14;
                if (iA2 <= i14 || i15 <= (i11 = layoutParams2.rightMargin)) {
                    layoutParams3.width = iA2;
                    layoutParams3.height = iA2;
                    i10 = layoutParams2.rightMargin;
                    if (i15 < i10) {
                        i10 -= i15 / 2;
                    }
                } else {
                    int i16 = (i14 / 2) + (iA2 / 2) + i11;
                    layoutParams3.width = i16;
                    layoutParams3.height = i16;
                    layoutParams2.gravity = 53;
                    i10 = 0;
                }
                layoutParams3.setMargins(i10, i10, i10, i10);
                layoutParams3.gravity = 17;
            }
        }
        this.f18507a.setVisibility((closeButtonConfiguration.f18500a || closeButtonConfiguration.f18501b) ? 0 : 8);
        this.f18508b.setVisibility(closeButtonConfiguration.f18500a ? 0 : 8);
        int i17 = closeButtonConfiguration.f18501b ? 0 : 8;
        this.f18510d.setVisibility(i17);
        this.f18509c.setVisibility(i17);
        this.f18509c.setEnabled(closeButtonConfiguration.f18501b);
    }

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View viewFindViewById = inneractiveFullscreenAdActivity.findViewById(R.id.ia_fl_close_button);
        this.f18507a = viewFindViewById;
        this.f18508b = (TextView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_tv_close_button);
        View viewFindViewById2 = inneractiveFullscreenAdActivity.findViewById(R.id.ia_clickable_close_button);
        this.f18509c = viewFindViewById2;
        this.f18510d = (ImageView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_iv_close_button);
        this.f18511e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(R.id.close_button_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setOnClickListener(new a(inneractiveFullscreenAdActivity));
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        CloseButtonConfiguration closeButtonConfiguration = this.f18513g;
        closeButtonConfiguration.f18505f = bVar.f15680a;
        closeButtonConfiguration.f18506g.a(closeButtonConfiguration);
    }
}
