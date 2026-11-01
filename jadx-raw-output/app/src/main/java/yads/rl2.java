package yads;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class rl2 extends hk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io2 f82309c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.hk3
    public final void a(View view) {
        ((tl2) view).setRating(0.0f);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.hk3
    public final void b(View view, Object obj) {
        String str = (String) obj;
        try {
            ((tl2) view).setRating(ik.k.c(Float.parseFloat(str), 0.0f));
        } catch (NumberFormatException e10) {
            ck.w wVar = ck.w.f6066a;
            ck.p.i(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z10 = ad1.f75480a;
            this.f82309c.reportError("Could not parse rating value", e10);
        }
    }

    public rl2(View view, io2 io2Var) {
        super(view);
        this.f82309c = io2Var;
    }

    @Override // yads.hk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
