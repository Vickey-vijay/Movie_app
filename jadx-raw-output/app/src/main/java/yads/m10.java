package yads;

import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes2.dex */
public final class m10 {
    public static r12 a(l10 l10Var) {
        q12 q12Var = new q12(l10Var, q22.f81688d, kotlin.collections.a.j());
        q12Var.f81681e.put("age", l10Var.getAgeView());
        q12Var.f81681e.put("body", l10Var.getBodyView());
        q12Var.f81681e.put("call_to_action", l10Var.getCallToActionView());
        q12Var.f81681e.put(C3426d4.j.D, l10Var.getDomainView());
        q12Var.f81681e.put("favicon", l10Var.getFaviconView());
        q12Var.f81681e.put("feedback", l10Var.getFeedbackView());
        q12Var.f81681e.put("icon", l10Var.getIconView());
        q12Var.f81682f = l10Var.getImageView();
        q12Var.f81681e.put(C3426d4.i.I0, l10Var.getMediaView());
        q12Var.f81681e.put("rating", l10Var.getRatingView());
        q12Var.f81681e.put("review_count", l10Var.getReviewCountView());
        q12Var.f81681e.put("sponsored", l10Var.getSponsoredView());
        q12Var.f81681e.put("title", l10Var.getTitleView());
        q12Var.f81681e.put("warning", l10Var.getWarningView());
        return new r12(q12Var);
    }
}
