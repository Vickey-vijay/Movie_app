package io.bidmachine.rendering.internal.animation;

import ck.p;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideBindParams;
import io.bidmachine.rendering.model.SideType;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {
    public static final SideType a(ElementLayoutParams elementLayoutParams) {
        SideBindParams rightSideBindParams;
        p.j(elementLayoutParams, "<this>");
        if (elementLayoutParams.getLeftSideBindParams() == null ? elementLayoutParams.getRightSideBindParams() == null || (rightSideBindParams = elementLayoutParams.getRightSideBindParams()) == null : (rightSideBindParams = elementLayoutParams.getLeftSideBindParams()) == null) {
            return null;
        }
        return rightSideBindParams.getTargetSideType();
    }

    public static final SideType b(ElementLayoutParams elementLayoutParams) {
        SideBindParams bottomSideBindParams;
        p.j(elementLayoutParams, "<this>");
        if (elementLayoutParams.getTopSideBindParams() == null ? elementLayoutParams.getBottomSideBindParams() == null || (bottomSideBindParams = elementLayoutParams.getBottomSideBindParams()) == null : (bottomSideBindParams = elementLayoutParams.getTopSideBindParams()) == null) {
            return null;
        }
        return bottomSideBindParams.getTargetSideType();
    }
}
