package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import com.inmobi.media.AbstractC3211ti;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3211ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f25397a = kotlin.b.a(new bk.a() { // from class: b7.ga
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3211ti.a();
        }
    });

    public static final JSONObject a(String str, int i10) throws JSONException {
        JSONObject jSONObjectA = Si.a(str, "targetViewId", "id", str);
        jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        return jSONObjectA;
    }

    public static final vo b(WindowInsets windowInsets) {
        ck.p.j(windowInsets, "<this>");
        vo voVarE = e(windowInsets);
        vo voVarC = c(windowInsets);
        vo voVarD = d(windowInsets);
        ck.p.j(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
        ck.p.i(insets, "getInsets(...)");
        return a(voVarE, voVarC, voVarD, new vo(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final vo c(WindowInsets windowInsets) {
        ck.p.j(windowInsets, "<this>");
        C3298x5.f25687a.getClass();
        if (C3298x5.r()) {
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout());
            ck.p.i(insets, "getInsets(...)");
            return new vo(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!C3298x5.p()) {
            return (vo) f25397a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new vo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final vo d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        ck.p.j(windowInsets, "<this>");
        C3298x5.f25687a.getClass();
        if (!C3298x5.s()) {
            return (vo) f25397a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int iSin4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            iSin = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner.getRadius()));
        } else {
            iSin = 0;
        }
        if (roundedCorner2 != null) {
            iSin2 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner2.getRadius()));
        } else {
            iSin2 = 0;
        }
        if (roundedCorner3 != null) {
            iSin3 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner3.getRadius()));
        } else {
            iSin3 = 0;
        }
        if (roundedCorner4 != null) {
            iSin4 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner4.getRadius()));
        }
        return new vo(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final vo e(WindowInsets windowInsets) {
        ck.p.j(windowInsets, "<this>");
        C3298x5.f25687a.getClass();
        if (!C3298x5.r()) {
            return C3298x5.q() ? new vo(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (vo) f25397a.getValue();
        }
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
        ck.p.i(insets, "getInsets(...)");
        return new vo(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final vo a() {
        return new vo(0, 0, 0, 0);
    }

    public static final vo a(WindowInsets windowInsets) {
        ck.p.j(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (vo) f25397a.getValue());
    }

    public static final vo a(vo voVar, vo voVar2, vo voVar3, vo voVar4) {
        ck.p.j(voVar, "area");
        ck.p.j(voVar2, "display");
        ck.p.j(voVar3, "roundedCorner");
        ck.p.j(voVar4, "navigationBar");
        return new vo(qj.c.g(voVar.f25597a, voVar2.f25597a, voVar3.f25597a, voVar4.f25597a), qj.c.g(voVar.f25598b, voVar2.f25598b, voVar3.f25598b, voVar4.f25598b), qj.c.g(voVar.f25599c, voVar2.f25599c, voVar3.f25599c, voVar4.f25599c), qj.c.g(voVar.f25600d, voVar2.f25600d, voVar3.f25600d, voVar4.f25600d));
    }
}
