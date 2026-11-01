package io.bidmachine.rendering.model;

import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.util.UtilsKt;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001NB\u00ad\u0001\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\u0006\u0010*\u001a\u00020%\u0012\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020+\u0012\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070+\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000103\u0012\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010@¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070+8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b\b\u0010/R\u0019\u00108\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010?\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001098\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010E\u001a\u0004\u0018\u00010@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\u0016\u001a\u0004\bG\u0010\u0018R\u0019\u0010K\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010\u0016\u001a\u0004\bJ\u0010\u0018¨\u0006O"}, d2 = {"Lio/bidmachine/rendering/model/AdElementParams;", "", "", C3426d4.i.W, "getCustomParam", "Lio/bidmachine/rendering/model/AnimationEventType;", "eventType", "Lio/bidmachine/rendering/model/AnimationParams;", "getAnimationParams", "Lio/bidmachine/rendering/model/AdElementType;", "a", "Lio/bidmachine/rendering/model/AdElementType;", "getAdElementType", "()Lio/bidmachine/rendering/model/AdElementType;", "adElementType", "Lio/bidmachine/rendering/model/Resource;", "b", "Lio/bidmachine/rendering/model/Resource;", "getResource", "()Lio/bidmachine/rendering/model/Resource;", "resource", "c", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "getSource$annotations", "()V", "source", "d", "getPlaceholder", "placeholder", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "e", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "getElementLayoutParams", "()Lio/bidmachine/rendering/model/ElementLayoutParams;", "elementLayoutParams", "Lio/bidmachine/rendering/model/AppearanceParams;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/AppearanceParams;", "getAppearanceParams", "()Lio/bidmachine/rendering/model/AppearanceParams;", "appearanceParams", "", "g", "Ljava/util/Map;", "getCustomParams", "()Ljava/util/Map;", "customParams", "h", "animationParams", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "i", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "getMeasurerFactory", "()Lio/bidmachine/rendering/measurer/MeasurerFactory;", "measurerFactory", "", "Lio/bidmachine/rendering/model/MeasurerParams;", "j", "Ljava/util/List;", "getMeasurerParamsList", "()Ljava/util/List;", "measurerParamsList", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", CampaignEx.JSON_KEY_AD_K, "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "getBrokenCreativeDetectorParams", "()Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "brokenCreativeDetectorParams", "l", "getName", "name", InneractiveMediationDefs.GENDER_MALE, "getText", "text", "<init>", "(Lio/bidmachine/rendering/model/AdElementType;Ljava/lang/String;Lio/bidmachine/rendering/model/Resource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/bidmachine/rendering/model/ElementLayoutParams;Lio/bidmachine/rendering/model/AppearanceParams;Ljava/util/Map;Ljava/util/Map;Lio/bidmachine/rendering/measurer/MeasurerFactory;Ljava/util/List;Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;)V", "Builder", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class AdElementParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AdElementType adElementType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Resource resource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String placeholder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ElementLayoutParams elementLayoutParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AppearanceParams appearanceParams;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map customParams;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map animationParams;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MeasurerFactory measurerFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List measurerParamsList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final BrokenCreativeDetectorParams brokenCreativeDetectorParams;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String text;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\bA\u0010BJ\u001c\u0010\u0005\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003J\u001c\u0010\u0013\u001a\u00020\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fJ\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0016\u0010\u001c\u001a\u00020\u00002\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010!\u001a\u00020 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b6\u0010'\u0012\u0004\b7\u00108R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010'R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lio/bidmachine/rendering/model/AdElementParams$Builder;", "", "", "", "customParams", "setCustomParams", "Lio/bidmachine/rendering/model/Resource;", "resource", "setResource", "source", "setSource", "placeholder", "setPlaceholder", "text", "setText", "", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "animationParams", "setAnimationParams", "eventType", "addAnimationParams", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "measurerFactory", "setMeasurerFactory", "", "Lio/bidmachine/rendering/model/MeasurerParams;", "measurerParamsList", "setMeasurerParamsList", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "brokenCreativeDetectorParams", "setBrokenCreativeDetectorParams", "Lio/bidmachine/rendering/model/AdElementParams;", BillingClientBuilderBridgeCommon.buildMethodName, "Lio/bidmachine/rendering/model/AdElementType;", "a", "Lio/bidmachine/rendering/model/AdElementType;", "adElementType", "b", "Ljava/lang/String;", "name", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "c", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "elementLayoutParams", "Lio/bidmachine/rendering/model/AppearanceParams;", "d", "Lio/bidmachine/rendering/model/AppearanceParams;", "appearanceParams", "e", "Ljava/util/Map;", InneractiveMediationDefs.GENDER_FEMALE, "g", "Lio/bidmachine/rendering/model/Resource;", "h", "getSource$annotations", "()V", "i", "j", CampaignEx.JSON_KEY_AD_K, "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "l", "Ljava/util/List;", InneractiveMediationDefs.GENDER_MALE, "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "<init>", "(Lio/bidmachine/rendering/model/AdElementType;Ljava/lang/String;Lio/bidmachine/rendering/model/ElementLayoutParams;Lio/bidmachine/rendering/model/AppearanceParams;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AdElementType adElementType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ElementLayoutParams elementLayoutParams;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final AppearanceParams appearanceParams;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Map customParams;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map animationParams;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Resource resource;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String source;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private String placeholder;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private String text;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private MeasurerFactory measurerFactory;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private List measurerParamsList;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private BrokenCreativeDetectorParams brokenCreativeDetectorParams;

        public Builder(AdElementType adElementType, String str, ElementLayoutParams elementLayoutParams, AppearanceParams appearanceParams) {
            p.j(adElementType, "adElementType");
            p.j(str, "name");
            p.j(elementLayoutParams, "elementLayoutParams");
            p.j(appearanceParams, "appearanceParams");
            this.adElementType = adElementType;
            this.name = str;
            this.elementLayoutParams = elementLayoutParams;
            this.appearanceParams = appearanceParams;
            this.customParams = new HashMap();
            this.animationParams = new EnumMap(AnimationEventType.class);
        }

        public final Builder addAnimationParams(AnimationEventType eventType, AnimationParams animationParams) {
            p.j(eventType, "eventType");
            p.j(animationParams, "animationParams");
            this.animationParams.put(eventType, animationParams);
            return this;
        }

        public final AdElementParams build() {
            return new AdElementParams(this.adElementType, this.name, this.resource, this.source, this.placeholder, this.text, this.elementLayoutParams, this.appearanceParams, this.customParams, this.animationParams, this.measurerFactory, this.measurerParamsList, this.brokenCreativeDetectorParams);
        }

        public final Builder setAnimationParams(Map<AnimationEventType, AnimationParams> animationParams) {
            UtilsKt.setSafely(this.animationParams, animationParams);
            return this;
        }

        public final Builder setBrokenCreativeDetectorParams(BrokenCreativeDetectorParams brokenCreativeDetectorParams) {
            this.brokenCreativeDetectorParams = brokenCreativeDetectorParams;
            return this;
        }

        public final Builder setCustomParams(Map<String, String> customParams) {
            UtilsKt.setSafely(this.customParams, customParams);
            return this;
        }

        public final Builder setMeasurerFactory(MeasurerFactory measurerFactory) {
            this.measurerFactory = measurerFactory;
            return this;
        }

        public final Builder setMeasurerParamsList(List<MeasurerParams> measurerParamsList) {
            this.measurerParamsList = measurerParamsList;
            return this;
        }

        public final Builder setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        public final Builder setResource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public final Builder setSource(String source) {
            this.source = source;
            return this;
        }

        public final Builder setText(String text) {
            this.text = text;
            return this;
        }
    }

    public AdElementParams(AdElementType adElementType, String str, Resource resource, String str2, String str3, String str4, ElementLayoutParams elementLayoutParams, AppearanceParams appearanceParams, Map<String, String> map, Map<AnimationEventType, AnimationParams> map2, MeasurerFactory measurerFactory, List<MeasurerParams> list, BrokenCreativeDetectorParams brokenCreativeDetectorParams) {
        p.j(adElementType, "adElementType");
        p.j(str, "name");
        p.j(elementLayoutParams, "elementLayoutParams");
        p.j(appearanceParams, "appearanceParams");
        p.j(map, "customParams");
        p.j(map2, "animationParams");
        this.adElementType = adElementType;
        this.resource = resource;
        this.source = str2;
        this.placeholder = str3;
        this.elementLayoutParams = elementLayoutParams;
        this.appearanceParams = appearanceParams;
        this.customParams = map;
        this.animationParams = map2;
        this.measurerFactory = measurerFactory;
        this.measurerParamsList = list;
        this.brokenCreativeDetectorParams = brokenCreativeDetectorParams;
        Locale locale = Locale.ENGLISH;
        p.i(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.name = lowerCase;
        this.text = str4 != null ? str4 : str2;
    }

    public static /* synthetic */ void getSource$annotations() {
    }

    public final AdElementType getAdElementType() {
        return this.adElementType;
    }

    public final AnimationParams getAnimationParams(AnimationEventType eventType) {
        p.j(eventType, "eventType");
        return (AnimationParams) this.animationParams.get(eventType);
    }

    public final AppearanceParams getAppearanceParams() {
        return this.appearanceParams;
    }

    public final BrokenCreativeDetectorParams getBrokenCreativeDetectorParams() {
        return this.brokenCreativeDetectorParams;
    }

    public final String getCustomParam(String key) {
        p.j(key, C3426d4.i.W);
        return (String) this.customParams.get(key);
    }

    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    public final ElementLayoutParams getElementLayoutParams() {
        return this.elementLayoutParams;
    }

    public final MeasurerFactory getMeasurerFactory() {
        return this.measurerFactory;
    }

    public final List<MeasurerParams> getMeasurerParamsList() {
        return this.measurerParamsList;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Resource getResource() {
        return this.resource;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ AdElementParams(AdElementType adElementType, String str, Resource resource, String str2, String str3, String str4, ElementLayoutParams elementLayoutParams, AppearanceParams appearanceParams, Map map, Map map2, MeasurerFactory measurerFactory, List list, BrokenCreativeDetectorParams brokenCreativeDetectorParams, int i10, i iVar) {
        this(adElementType, str, (i10 & 4) != 0 ? null : resource, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, elementLayoutParams, appearanceParams, (i10 & 256) != 0 ? new HashMap() : map, (i10 & 512) != 0 ? new EnumMap(AnimationEventType.class) : map2, (i10 & 1024) != 0 ? null : measurerFactory, (i10 & 2048) != 0 ? null : list, (i10 & 4096) != 0 ? null : brokenCreativeDetectorParams);
    }

    public final Map<AnimationEventType, AnimationParams> getAnimationParams() {
        return this.animationParams;
    }
}
