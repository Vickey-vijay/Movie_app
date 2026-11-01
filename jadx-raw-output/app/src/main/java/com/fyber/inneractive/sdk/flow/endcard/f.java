package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.i1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f15368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f15369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f15370e;

    public final void a(com.fyber.inneractive.sdk.player.ui.b bVar, com.fyber.inneractive.sdk.player.ui.n nVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        Context context = this.f15369d.getContext();
        this.f15369d.setAllCaps(bVar.f18048b);
        this.f15369d.setVisibility(0);
        if (IAConfigManager.O.E.n() && (mVar = bVar.f18055i) != null && mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
            this.f15369d.setText(R.string.ia_video_instant_install_text);
            if (bVar.f18053g) {
                String str = bVar.f18054h;
                if (str != null && str.length() == 1) {
                    TextView textView = this.f15370e;
                    int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(R.dimen.ia_image_control_size);
                    textView.setBackgroundResource(R.drawable.ia_bg_circle_overlay);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.width = dimensionPixelSize;
                    layoutParams.height = dimensionPixelSize;
                    textView.setLayoutParams(layoutParams);
                }
                this.f15370e.setText(str);
                this.f15370e.setVisibility(0);
            }
        } else {
            this.f15370e.setVisibility(8);
            Button button = this.f15369d;
            Context context2 = this.f15368c.getContext();
            String str2 = bVar.f18049c;
            button.setText(!TextUtils.isEmpty(str2) ? i1.a(str2, 15) : context2.getString(R.string.ia_video_install_now_text));
        }
        this.f15369d.setBackgroundResource(R.drawable.ia_bg_green);
        this.f15369d.setTextSize(0, context.getResources().getDimension(R.dimen.ia_video_overlay_text_large_plus));
        TextView textView2 = this.f15370e;
        if (nVar != null) {
            textView2.setOnTouchListener(new e(10, nVar));
        } else {
            textView2.setOnTouchListener(null);
        }
        Button button2 = this.f15369d;
        if (nVar != null) {
            button2.setOnTouchListener(new e(8, nVar));
        } else {
            button2.setOnTouchListener(null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f15368c;
    }

    public f(b bVar) {
        super(bVar);
        View viewInflate = LayoutInflater.from(IAConfigManager.O.f15027v.a()).inflate(R.layout.ia_layout_default_video_end_card, (ViewGroup) null);
        this.f15369d = (Button) viewInflate.findViewById(R.id.ia_b_end_card_call_to_action);
        this.f15370e = (TextView) viewInflate.findViewById(R.id.ia_endcard_tv_app_info_button);
        this.f15368c = a.a(viewInflate);
    }
}
