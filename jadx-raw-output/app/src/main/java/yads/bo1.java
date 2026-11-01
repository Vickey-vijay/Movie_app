package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C3426d4;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONException;
import yads.bo1;

/* JADX INFO: loaded from: classes11.dex */
public final class bo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f75920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el3 f75921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl3 f75922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f75923d;

    public bo1(Context context, lu2 lu2Var, d4 d4Var) {
        this(d4Var, new el3(context), new dl3(context, lu2Var));
    }

    public final void a(CustomizableMediaView customizableMediaView, String str) {
        lj1 lj1Var;
        lj1 lj1Var2;
        d4 d4Var = this.f75920a;
        String str2 = d4Var.f76561c.f78158a;
        if (str2 != null) {
            int i10 = d4Var.f76572n;
            ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(fa3.a(layoutParams.width)) : null;
            ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
            Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(fa3.a(layoutParams2.height)) : null;
            int iA = fa3.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
            int iA2 = fa3.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
            int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
            if (mode != Integer.MIN_VALUE) {
                lj1Var = (mode == 0 || mode != 1073741824) ? lj1.f79816d : lj1.f79814b;
            } else {
                lj1Var = lj1.f79815c;
            }
            int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
            if (mode2 != Integer.MIN_VALUE) {
                lj1Var2 = (mode2 == 0 || mode2 != 1073741824) ? lj1.f79816d : lj1.f79814b;
            } else {
                lj1Var2 = lj1.f79815c;
            }
            final bl3 bl3Var = new bl3(new al3(fa3.a(customizableMediaView.getWidth()), fa3.a(customizableMediaView.getHeight())), new af1(numValueOf, numValueOf2), new jj1(new kj1(iA, lj1Var), new kj1(iA2, lj1Var2)), kotlin.collections.a.m(mj.h.a("asset", C3426d4.i.I0), mj.h.a("media_type", str)));
            final fl3 fl3Var = new fl3(i10, str2);
            this.f75923d.execute(new Runnable() { // from class: cp.s
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    bo1.a(this.f51567b, fl3Var, bl3Var);
                }
            });
        }
    }

    public /* synthetic */ bo1(d4 d4Var, el3 el3Var, dl3 dl3Var) {
        this(d4Var, el3Var, dl3Var, Executors.newSingleThreadExecutor());
    }

    public bo1(d4 d4Var, el3 el3Var, dl3 dl3Var, Executor executor) {
        this.f75920a = d4Var;
        this.f75921b = el3Var;
        this.f75922c = dl3Var;
        this.f75923d = executor;
    }

    public static final void a(bo1 bo1Var, fl3 fl3Var, bl3 bl3Var) throws JSONException {
        bo1Var.f75921b.a(fl3Var, bl3Var);
        bo1Var.f75922c.a(bl3Var, bo1Var.f75920a);
    }
}
