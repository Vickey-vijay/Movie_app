package io.bidmachine.rendering.model;

import android.content.Context;
import android.view.View;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lio/bidmachine/rendering/model/Padding;", VastAttributes.PADDING, "Lmj/r;", "setPadding", "bidmachine-android-rendering_d_2_5_2"}, k = 2, mv = {1, 7, 1})
public final class PaddingKt {
    public static final void setPadding(View view, Padding padding) {
        p.j(view, "<this>");
        if (padding == null) {
            return;
        }
        Context context = view.getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        int iDpToPx = UtilsKt.dpToPx(context, padding.getLeftDp());
        Context context2 = view.getContext();
        p.i(context2, GAMConfig.KEY_CONTEXT);
        int iDpToPx2 = UtilsKt.dpToPx(context2, padding.getTopDp());
        Context context3 = view.getContext();
        p.i(context3, GAMConfig.KEY_CONTEXT);
        int iDpToPx3 = UtilsKt.dpToPx(context3, padding.getRightDp());
        Context context4 = view.getContext();
        p.i(context4, GAMConfig.KEY_CONTEXT);
        view.setPadding(iDpToPx, iDpToPx2, iDpToPx3, UtilsKt.dpToPx(context4, padding.getBottomDp()));
    }
}
