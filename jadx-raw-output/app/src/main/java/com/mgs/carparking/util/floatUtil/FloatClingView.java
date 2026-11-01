package com.mgs.carparking.util.floatUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.MainActivity;
import com.unity3d.services.UnityAdsConstants;
import e9.g;
import sa.g0;
import sa.o0;
import x9.i;
import x9.y;

/* JADX INFO: loaded from: classes.dex */
public class FloatClingView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f42238b;

    public class a implements g0.b {
        public a() {
        }

        @Override // sa.g0.b
        public void a(long j10) {
            Log.i("wangyi", "111");
            if (o0.X() <= o0.k()) {
                o0.i1(o0.X() + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            } else {
                FloatClingView.this.f42238b.b();
                FloatClingView.this.f42238b = null;
            }
        }
    }

    public class b implements View.OnClickListener {

        public class a implements d9.a {
            @Override // d9.a
            public void a(g gVar) {
            }

            public a() {
            }

            @Override // d9.a
            public void b(g gVar) {
                Log.i("wangyi", "停止成功");
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c9.a aVar = MainActivity.mClingPlayControl;
            if (aVar != null) {
                aVar.b(new a());
            }
            tl.a.a().b(new y());
            tl.a.a().b(new i());
        }
    }

    public FloatClingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public FloatClingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public final void c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_cling_float, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f42238b.c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, new a());
        viewInflate.findViewById(R.id.iv_delete).setOnClickListener(new b());
        addView(viewInflate, layoutParams);
    }
}
