package io.bidmachine.rendering.model;

import android.content.Context;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.utils.RelativePercent;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001:\u0001?B\u009b\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0003\u0010\u0018\u001a\u00020\r\u0012\b\b\u0003\u0010\u001b\u001a\u00020\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010-\u001a\u00020\r\u0012\b\b\u0002\u00100\u001a\u00020\r\u0012\b\b\u0002\u00103\u001a\u00020\r\u0012\b\b\u0002\u00106\u001a\u00020\r\u0012\b\b\u0002\u00109\u001a\u00020\r\u0012\b\b\u0002\u0010<\u001a\u00020\r¢\u0006\u0004\b=\u0010>J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010'\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0019\u0010*\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R\u0017\u0010-\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010\u000f\u001a\u0004\b,\u0010\u0011R\u0017\u00100\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u0017\u00103\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u0010\u000f\u001a\u0004\b2\u0010\u0011R\u0017\u00106\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00109\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b8\u0010\u0011R\u0017\u0010<\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b;\u0010\u0011¨\u0006@"}, d2 = {"Lio/bidmachine/rendering/model/ElementLayoutParams;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "getWidthPx", "getHeightPx", "getMarginLeftPx", "getMarginTopPx", "getMarginRightPx", "getMarginBottomPx", "getTranslationXPx", "getTranslationYPx", "", "a", "F", "getWidth", "()F", "width", "b", "getHeight", "height", "c", "getWidthPercent", "widthPercent", "d", "getHeightPercent", "heightPercent", "Lio/bidmachine/rendering/model/SideBindParams;", "e", "Lio/bidmachine/rendering/model/SideBindParams;", "getLeftSideBindParams", "()Lio/bidmachine/rendering/model/SideBindParams;", "leftSideBindParams", InneractiveMediationDefs.GENDER_FEMALE, "getTopSideBindParams", "topSideBindParams", "g", "getRightSideBindParams", "rightSideBindParams", "h", "getBottomSideBindParams", "bottomSideBindParams", "i", "getMarginLeft", "marginLeft", "j", "getMarginTop", "marginTop", CampaignEx.JSON_KEY_AD_K, "getMarginRight", "marginRight", "l", "getMarginBottom", "marginBottom", InneractiveMediationDefs.GENDER_MALE, "getTranslationX", "translationX", "n", "getTranslationY", "translationY", "<init>", "(FFFFLio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;Lio/bidmachine/rendering/model/SideBindParams;FFFFFF)V", "Builder", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class ElementLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float widthPercent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float heightPercent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SideBindParams leftSideBindParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SideBindParams topSideBindParams;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SideBindParams rightSideBindParams;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SideBindParams bottomSideBindParams;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float marginLeft;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float marginTop;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float marginRight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float marginBottom;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float translationX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010)J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0002J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u0010!\u001a\u00020 R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u001c\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b'\u0010#\u0012\u0004\b(\u0010)R\u001c\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b*\u0010#\u0012\u0004\b+\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010#R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010#R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010#R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010#R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010#R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010#¨\u0006>"}, d2 = {"Lio/bidmachine/rendering/model/ElementLayoutParams$Builder;", "", "", "widthDp", "setWidth", "heightDp", "setHeight", "widthPercent", "setWidthPercent", "heightPercent", "setHeightPercent", "Lio/bidmachine/rendering/model/SideBindParams;", "leftSideBindParams", "setLeftSideBindParams", "topSideBindParams", "setTopSideBindParams", "rightSideBindParams", "setRightSideBindParams", "bottomSideBindParams", "setBottomSideBindParams", "marginLeftDp", "setMarginLeft", "marginTopDp", "setMarginTop", "marginRightDp", "setMarginRight", "marginBottomDp", "setMarginBottom", "translationXDp", "setTranslationX", "translationYDp", "setTranslationY", "Lio/bidmachine/rendering/model/ElementLayoutParams;", BillingClientBuilderBridgeCommon.buildMethodName, "a", "F", "width", "b", "height", "c", "getWidthPercent$annotations", "()V", "d", "getHeightPercent$annotations", "e", "Lio/bidmachine/rendering/model/SideBindParams;", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", "marginLeft", "j", "marginTop", CampaignEx.JSON_KEY_AD_K, "marginRight", "l", "marginBottom", InneractiveMediationDefs.GENDER_MALE, "translationX", "n", "translationY", "<init>", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private float width;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private float height;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float widthPercent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private float heightPercent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private SideBindParams leftSideBindParams;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private SideBindParams topSideBindParams;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private SideBindParams rightSideBindParams;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private SideBindParams bottomSideBindParams;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float marginLeft;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private float marginTop;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private float marginRight;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private float marginBottom;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private float translationX;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private float translationY;

        public final ElementLayoutParams build() {
            return new ElementLayoutParams(this.width, this.height, this.widthPercent, this.heightPercent, this.leftSideBindParams, this.topSideBindParams, this.rightSideBindParams, this.bottomSideBindParams, this.marginLeft, this.marginTop, this.marginRight, this.marginBottom, this.translationX, this.translationY);
        }

        public final Builder setBottomSideBindParams(SideBindParams bottomSideBindParams) {
            this.bottomSideBindParams = bottomSideBindParams;
            return this;
        }

        public final Builder setHeight(float heightDp) {
            this.height = heightDp;
            return this;
        }

        public final Builder setHeightPercent(@RelativePercent float heightPercent) {
            this.heightPercent = heightPercent;
            return this;
        }

        public final Builder setLeftSideBindParams(SideBindParams leftSideBindParams) {
            this.leftSideBindParams = leftSideBindParams;
            return this;
        }

        public final Builder setMarginBottom(float marginBottomDp) {
            this.marginBottom = marginBottomDp;
            return this;
        }

        public final Builder setMarginLeft(float marginLeftDp) {
            this.marginLeft = marginLeftDp;
            return this;
        }

        public final Builder setMarginRight(float marginRightDp) {
            this.marginRight = marginRightDp;
            return this;
        }

        public final Builder setMarginTop(float marginTopDp) {
            this.marginTop = marginTopDp;
            return this;
        }

        public final Builder setRightSideBindParams(SideBindParams rightSideBindParams) {
            this.rightSideBindParams = rightSideBindParams;
            return this;
        }

        public final Builder setTopSideBindParams(SideBindParams topSideBindParams) {
            this.topSideBindParams = topSideBindParams;
            return this;
        }

        public final Builder setTranslationX(float translationXDp) {
            this.translationX = translationXDp;
            return this;
        }

        public final Builder setTranslationY(float translationYDp) {
            this.translationY = translationYDp;
            return this;
        }

        public final Builder setWidth(float widthDp) {
            this.width = widthDp;
            return this;
        }

        public final Builder setWidthPercent(@RelativePercent float widthPercent) {
            this.widthPercent = widthPercent;
            return this;
        }
    }

    public ElementLayoutParams() {
        this(0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16383, null);
    }

    public final SideBindParams getBottomSideBindParams() {
        return this.bottomSideBindParams;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHeightPercent() {
        return this.heightPercent;
    }

    public final int getHeightPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.height);
    }

    public final SideBindParams getLeftSideBindParams() {
        return this.leftSideBindParams;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginBottomPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.marginBottom);
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }

    public final int getMarginLeftPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.marginLeft);
    }

    public final float getMarginRight() {
        return this.marginRight;
    }

    public final int getMarginRightPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.marginRight);
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final int getMarginTopPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.marginTop);
    }

    public final SideBindParams getRightSideBindParams() {
        return this.rightSideBindParams;
    }

    public final SideBindParams getTopSideBindParams() {
        return this.topSideBindParams;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final int getTranslationXPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.translationX);
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final int getTranslationYPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.translationY);
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getWidthPercent() {
        return this.widthPercent;
    }

    public final int getWidthPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return UtilsKt.dpToPx(context, this.width);
    }

    public ElementLayoutParams(float f10, float f11, @RelativePercent float f12, @RelativePercent float f13, SideBindParams sideBindParams, SideBindParams sideBindParams2, SideBindParams sideBindParams3, SideBindParams sideBindParams4, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.width = f10;
        this.height = f11;
        this.widthPercent = f12;
        this.heightPercent = f13;
        this.leftSideBindParams = sideBindParams;
        this.topSideBindParams = sideBindParams2;
        this.rightSideBindParams = sideBindParams3;
        this.bottomSideBindParams = sideBindParams4;
        this.marginLeft = f14;
        this.marginTop = f15;
        this.marginRight = f16;
        this.marginBottom = f17;
        this.translationX = f18;
        this.translationY = f19;
    }

    public /* synthetic */ ElementLayoutParams(float f10, float f11, float f12, float f13, SideBindParams sideBindParams, SideBindParams sideBindParams2, SideBindParams sideBindParams3, SideBindParams sideBindParams4, float f14, float f15, float f16, float f17, float f18, float f19, int i10, i iVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? null : sideBindParams, (i10 & 32) != 0 ? null : sideBindParams2, (i10 & 64) != 0 ? null : sideBindParams3, (i10 & 128) == 0 ? sideBindParams4 : null, (i10 & 256) != 0 ? 0.0f : f14, (i10 & 512) != 0 ? 0.0f : f15, (i10 & 1024) != 0 ? 0.0f : f16, (i10 & 2048) != 0 ? 0.0f : f17, (i10 & 4096) != 0 ? 0.0f : f18, (i10 & 8192) == 0 ? f19 : 0.0f);
    }
}
