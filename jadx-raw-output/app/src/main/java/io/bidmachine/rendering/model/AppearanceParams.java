package io.bidmachine.rendering.model;

import android.content.Context;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 X2\u00020\u0001:\u0002YXBÑ\u0001\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010R\u001a\u00020M¢\u0006\u0004\bV\u0010WJ\u0010\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0017\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010#\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0019\u0010)\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010,\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0019\u00102\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u00104\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001fR\u0019\u00107\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010\u0017R\u0019\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0015\u001a\u0004\b<\u0010\u0017R\u0019\u0010C\u001a\u0004\u0018\u00010>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010F\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bD\u0010&\u001a\u0004\bE\u0010(R\u0019\u0010I\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0015\u001a\u0004\bH\u0010\u0017R\u0019\u0010L\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010(R\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010U\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0015\u001a\u0004\bT\u0010\u0017¨\u0006Z"}, d2 = {"Lio/bidmachine/rendering/model/AppearanceParams;", "", "", "default", "getBackgroundOrDefault", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "getStrokeWidthPx", "(Landroid/content/Context;)Ljava/lang/Integer;", "getCornerRadiusPx", "getCornerRadiusPxOrDefault", "Lio/bidmachine/rendering/model/Border;", "getBorder", "getTextLineSpacingPx", "Lio/bidmachine/rendering/model/Background;", "a", "Lio/bidmachine/rendering/model/Background;", "getBackground", "()Lio/bidmachine/rendering/model/Background;", A2.f54950g, "b", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "getBackgroundColor$annotations", "()V", "backgroundColor", "", "c", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", VastAttributes.VISIBLE, "d", "getClickable", "clickable", "", "e", "Ljava/lang/Float;", "getOpacity", "()Ljava/lang/Float;", VastAttributes.OPACITY, InneractiveMediationDefs.GENDER_FEMALE, "getFontSize", "fontSize", "Lio/bidmachine/rendering/model/FontStyleType;", "g", "Lio/bidmachine/rendering/model/FontStyleType;", "getFontStyleType", "()Lio/bidmachine/rendering/model/FontStyleType;", "fontStyleType", "h", "isOutlined", "i", "getStrokeWidth", "strokeWidth", "j", "getStrokeColor", "strokeColor", CampaignEx.JSON_KEY_AD_K, "getShadowColor", "shadowColor", "Lio/bidmachine/rendering/model/Padding;", "l", "Lio/bidmachine/rendering/model/Padding;", "getPadding", "()Lio/bidmachine/rendering/model/Padding;", VastAttributes.PADDING, InneractiveMediationDefs.GENDER_MALE, "getCornerRadius", "cornerRadius", "n", "getTextMaxLines", "textMaxLines", "o", "getTextLineSpacing", "textLineSpacing", "Lio/bidmachine/rendering/model/HorizontalGravity;", "p", "Lio/bidmachine/rendering/model/HorizontalGravity;", "getTextHorizontalGravity", "()Lio/bidmachine/rendering/model/HorizontalGravity;", "textHorizontalGravity", "q", "getFillColor", "fillColor", "<init>", "(Lio/bidmachine/rendering/model/Background;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Lio/bidmachine/rendering/model/FontStyleType;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lio/bidmachine/rendering/model/Padding;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Lio/bidmachine/rendering/model/HorizontalGravity;)V", VastTagName.COMPANION, "Builder", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class AppearanceParams {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final HorizontalGravity f60738r = HorizontalGravity.Center;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Background background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer backgroundColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Boolean visible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Boolean clickable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Float opacity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Float fontSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final FontStyleType fontStyleType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Boolean isOutlined;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Float strokeWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Integer strokeColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Integer shadowColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Padding padding;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Float cornerRadius;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Integer textMaxLines;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Float textLineSpacing;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final HorizontalGravity textHorizontalGravity;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Integer fillColor;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u00105J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\fJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b!\u0010\bJ\u0010\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"J\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b&\u0010\u0012J\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b(\u0010\bJ\u0017\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b*\u0010\u0012J\u0010\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010+J\u0006\u0010/\u001a\u00020.R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u00105R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00107R\u0018\u0010@\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010:R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00103R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00103R\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00103R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010:R\u0018\u0010'\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00103R\u0018\u0010)\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010:R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lio/bidmachine/rendering/model/AppearanceParams$Builder;", "", "Lio/bidmachine/rendering/model/Background;", A2.f54950g, "setBackground", "", "backgroundColor", "setBackgroundColor", "(Ljava/lang/Integer;)Lio/bidmachine/rendering/model/AppearanceParams$Builder;", "", VastAttributes.VISIBLE, "setVisible", "(Ljava/lang/Boolean;)Lio/bidmachine/rendering/model/AppearanceParams$Builder;", "clickable", "setClickable", "", VastAttributes.OPACITY, "setOpacity", "(Ljava/lang/Float;)Lio/bidmachine/rendering/model/AppearanceParams$Builder;", "fontSize", "setFontSize", "Lio/bidmachine/rendering/model/FontStyleType;", "fontStyleType", "setFontStyleType", "isOutlined", "setOutlined", "strokeWidthDp", "setStrokeWidth", "strokeColor", "setStrokeColor", "fillColor", "setFillColor", "shadowColor", "setShadowColor", "Lio/bidmachine/rendering/model/Padding;", VastAttributes.PADDING, "setPadding", "cornerRadius", "setCornerRadius", "textMaxLines", "setTextMaxLines", "textLineSpacing", "setTextLineSpacing", "Lio/bidmachine/rendering/model/HorizontalGravity;", "textHorizontalGravity", "setTextHorizontalGravity", "Lio/bidmachine/rendering/model/AppearanceParams;", BillingClientBuilderBridgeCommon.buildMethodName, "a", "Lio/bidmachine/rendering/model/Background;", "b", "Ljava/lang/Integer;", "getBackgroundColor$annotations", "()V", "c", "Ljava/lang/Boolean;", "d", "e", "Ljava/lang/Float;", InneractiveMediationDefs.GENDER_FEMALE, "g", "Lio/bidmachine/rendering/model/FontStyleType;", "h", "i", "strokeWidth", "j", CampaignEx.JSON_KEY_AD_K, "l", InneractiveMediationDefs.GENDER_MALE, "Lio/bidmachine/rendering/model/Padding;", "n", "o", "p", "q", "Lio/bidmachine/rendering/model/HorizontalGravity;", "<init>", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Background background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Integer backgroundColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Boolean visible;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Boolean clickable;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Float opacity;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Float fontSize;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private FontStyleType fontStyleType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Boolean isOutlined;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Float strokeWidth;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Integer strokeColor;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Integer fillColor;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Integer shadowColor;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Padding padding;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Float cornerRadius;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Integer textMaxLines;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Float textLineSpacing;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private HorizontalGravity textHorizontalGravity;

        public final AppearanceParams build() {
            Background background = this.background;
            Integer num = this.backgroundColor;
            Boolean bool = this.visible;
            Boolean bool2 = this.clickable;
            Float f10 = this.opacity;
            Float f11 = this.fontSize;
            FontStyleType fontStyleType = this.fontStyleType;
            Boolean bool3 = this.isOutlined;
            Float f12 = this.strokeWidth;
            Integer num2 = this.strokeColor;
            Integer num3 = this.fillColor;
            Integer num4 = this.shadowColor;
            Padding padding = this.padding;
            Float f13 = this.cornerRadius;
            Integer num5 = this.textMaxLines;
            Float f14 = this.textLineSpacing;
            HorizontalGravity horizontalGravity = this.textHorizontalGravity;
            if (horizontalGravity == null) {
                horizontalGravity = AppearanceParams.f60738r;
            }
            return new AppearanceParams(background, num, bool, bool2, f10, f11, fontStyleType, bool3, f12, num2, num3, num4, padding, f13, num5, f14, horizontalGravity);
        }

        public final Builder setBackground(Background background) {
            this.background = background;
            return this;
        }

        public final Builder setBackgroundColor(Integer backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public final Builder setClickable(Boolean clickable) {
            this.clickable = clickable;
            return this;
        }

        public final Builder setCornerRadius(Float cornerRadius) {
            this.cornerRadius = cornerRadius;
            return this;
        }

        public final Builder setFillColor(Integer fillColor) {
            this.fillColor = fillColor;
            return this;
        }

        public final Builder setFontSize(Float fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public final Builder setFontStyleType(FontStyleType fontStyleType) {
            this.fontStyleType = fontStyleType;
            return this;
        }

        public final Builder setOpacity(Float opacity) {
            this.opacity = opacity;
            return this;
        }

        public final Builder setOutlined(Boolean isOutlined) {
            this.isOutlined = isOutlined;
            return this;
        }

        public final Builder setPadding(Padding padding) {
            this.padding = padding;
            return this;
        }

        public final Builder setShadowColor(Integer shadowColor) {
            this.shadowColor = shadowColor;
            return this;
        }

        public final Builder setStrokeColor(Integer strokeColor) {
            this.strokeColor = strokeColor;
            return this;
        }

        public final Builder setStrokeWidth(Float strokeWidthDp) {
            this.strokeWidth = strokeWidthDp;
            return this;
        }

        public final Builder setTextHorizontalGravity(HorizontalGravity textHorizontalGravity) {
            this.textHorizontalGravity = textHorizontalGravity;
            return this;
        }

        public final Builder setTextLineSpacing(Float textLineSpacing) {
            this.textLineSpacing = textLineSpacing;
            return this;
        }

        public final Builder setTextMaxLines(Integer textMaxLines) {
            this.textMaxLines = textMaxLines;
            return this;
        }

        public final Builder setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
    }

    public AppearanceParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ int getBackgroundOrDefault$default(AppearanceParams appearanceParams, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return appearanceParams.getBackgroundOrDefault(i10);
    }

    public static /* synthetic */ int getCornerRadiusPxOrDefault$default(AppearanceParams appearanceParams, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return appearanceParams.getCornerRadiusPxOrDefault(context, i10);
    }

    public final Background getBackground() {
        return this.background;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundOrDefault(int i10) {
        Integer num = this.backgroundColor;
        return num != null ? num.intValue() : i10;
    }

    public final Border getBorder(Context context) {
        Integer strokeWidthPx;
        p.j(context, GAMConfig.KEY_CONTEXT);
        if (!p.e(this.isOutlined, Boolean.TRUE) || this.strokeColor == null || (strokeWidthPx = getStrokeWidthPx(context)) == null || strokeWidthPx.intValue() <= 0) {
            return null;
        }
        return new Border(strokeWidthPx.intValue(), this.strokeColor.intValue());
    }

    public final Boolean getClickable() {
        return this.clickable;
    }

    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final Integer getCornerRadiusPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Float f10 = this.cornerRadius;
        if (f10 == null) {
            return null;
        }
        f10.floatValue();
        return Integer.valueOf(UtilsKt.dpToPx(context, this.cornerRadius.floatValue()));
    }

    public final int getCornerRadiusPxOrDefault(Context context, int i10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Float f10 = this.cornerRadius;
        if (f10 == null) {
            return i10;
        }
        f10.floatValue();
        return UtilsKt.dpToPx(context, this.cornerRadius.floatValue());
    }

    public final Integer getFillColor() {
        return this.fillColor;
    }

    public final Float getFontSize() {
        return this.fontSize;
    }

    public final FontStyleType getFontStyleType() {
        return this.fontStyleType;
    }

    public final Float getOpacity() {
        return this.opacity;
    }

    public final Padding getPadding() {
        return this.padding;
    }

    public final Integer getShadowColor() {
        return this.shadowColor;
    }

    public final Integer getStrokeColor() {
        return this.strokeColor;
    }

    public final Float getStrokeWidth() {
        return this.strokeWidth;
    }

    public final Integer getStrokeWidthPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Float f10 = this.strokeWidth;
        if (f10 == null) {
            return null;
        }
        f10.floatValue();
        return Integer.valueOf(UtilsKt.dpToPx(context, this.strokeWidth.floatValue()));
    }

    public final HorizontalGravity getTextHorizontalGravity() {
        return this.textHorizontalGravity;
    }

    public final Float getTextLineSpacing() {
        return this.textLineSpacing;
    }

    public final Integer getTextLineSpacingPx(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Float f10 = this.textLineSpacing;
        if (f10 == null) {
            return null;
        }
        f10.floatValue();
        return Integer.valueOf(UtilsKt.dpToPx(context, this.textLineSpacing.floatValue()));
    }

    public final Integer getTextMaxLines() {
        return this.textMaxLines;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: isOutlined, reason: from getter */
    public final Boolean getIsOutlined() {
        return this.isOutlined;
    }

    public AppearanceParams(Background background, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, FontStyleType fontStyleType, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, Padding padding, Float f13, Integer num5, Float f14, HorizontalGravity horizontalGravity) {
        p.j(horizontalGravity, "textHorizontalGravity");
        this.background = background;
        Integer num6 = num;
        this.backgroundColor = num6;
        this.visible = bool;
        this.clickable = bool2;
        this.opacity = f10;
        this.fontSize = f11;
        this.fontStyleType = fontStyleType;
        this.isOutlined = bool3;
        this.strokeWidth = f12;
        this.strokeColor = num2;
        this.shadowColor = num4;
        this.padding = padding;
        this.cornerRadius = f13;
        this.textMaxLines = num5;
        this.textLineSpacing = f14;
        this.textHorizontalGravity = horizontalGravity;
        this.fillColor = num3 != null ? num3 : num6;
    }

    public /* synthetic */ AppearanceParams(Background background, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, FontStyleType fontStyleType, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, Padding padding, Float f13, Integer num5, Float f14, HorizontalGravity horizontalGravity, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : background, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : fontStyleType, (i10 & 128) != 0 ? null : bool3, (i10 & 256) != 0 ? null : f12, (i10 & 512) != 0 ? null : num2, (i10 & 1024) != 0 ? null : num3, (i10 & 2048) != 0 ? null : num4, (i10 & 4096) != 0 ? null : padding, (i10 & 8192) != 0 ? null : f13, (i10 & 16384) != 0 ? null : num5, (i10 & 32768) != 0 ? null : f14, (i10 & 65536) != 0 ? f60738r : horizontalGravity);
    }
}
