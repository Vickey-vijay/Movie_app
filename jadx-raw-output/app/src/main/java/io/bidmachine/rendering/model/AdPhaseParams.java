package io.bidmachine.rendering.model;

import androidx.core.view.ViewCompat;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.util.UtilsKt;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001=B\u00ad\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0006\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u0006\u0012$\u0010/\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u0004\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\u0004\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b;\u0010<J\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00068\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"R5\u0010/\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R#\u00107\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\u00048\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\"¨\u0006>"}, d2 = {"Lio/bidmachine/rendering/model/AdPhaseParams;", "", "", "sourceName", "", "Lio/bidmachine/rendering/model/EventType;", "", "Lio/bidmachine/rendering/model/EventTaskParams;", "getEventTypeMap", C3426d4.i.W, "getCustomParam", "", "a", "I", "getSequence", "()I", "sequence", "Lio/bidmachine/rendering/model/Background;", "b", "Lio/bidmachine/rendering/model/Background;", "getBackground", "()Lio/bidmachine/rendering/model/Background;", A2.f54950g, "c", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "getBackgroundColor$annotations", "()V", "backgroundColor", "Lio/bidmachine/rendering/model/AdElementParams;", "d", "Ljava/util/List;", "getAdsList", "()Ljava/util/List;", "adsList", "e", "getControlsList", "controlsList", "Lio/bidmachine/rendering/model/MethodParams;", InneractiveMediationDefs.GENDER_FEMALE, "getMethodParamsList", "methodParamsList", "g", "Ljava/util/Map;", "getSourceEventTypeMap", "()Ljava/util/Map;", "sourceEventTypeMap", "h", "getCustomParams", "customParams", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "i", "getAnimationParams", "animationParams", "j", "getStateGroups", "stateGroups", "<init>", "(ILio/bidmachine/rendering/model/Background;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "Builder", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class AdPhaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int sequence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Background background;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer backgroundColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List adsList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List controlsList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List methodParamsList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map sourceEventTypeMap;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map customParams;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map animationParams;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List stateGroups;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00101\u001a\u00020\u0005¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0016\u0010\u000b\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\u0013\u001a\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011J.\u0010\u001d\u001a\u00020\u00002&\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0018\u0018\u00010\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eJ\u001c\u0010\"\u001a\u00020\u00002\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016J\u001c\u0010&\u001a\u00020\u00002\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\u0018J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020$J\u0016\u0010*\u001a\u00020\u00002\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001aJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0017J\u0006\u0010.\u001a\u00020-R\u0014\u00101\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R2\u0010\u001c\u001a \u0012\u0004\u0012\u00020\u0017\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00103R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b=\u00100\u0012\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "", "Lio/bidmachine/rendering/model/Background;", A2.f54950g, "setBackground", "", "backgroundColor", "setBackgroundColor", "", "Lio/bidmachine/rendering/model/AdElementParams;", "adsElementParamsList", "setAdsElementParamsList", "adElementParams", "addAdsElementParams", "controlsElementParamsList", "setControlsElementParamsList", "addControlsElementParams", "Lio/bidmachine/rendering/model/MethodParams;", "methodParamsList", "setMethodParamsList", "methodParams", "addMethodParams", "", "", "", "Lio/bidmachine/rendering/model/EventType;", "", "Lio/bidmachine/rendering/model/EventTaskParams;", "sourceEventTypeMap", "setEventParamsList", "Lio/bidmachine/rendering/model/EventParams;", "eventParams", "addEventParams", "customParams", "setCustomParams", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "animationParams", "setAnimationParams", "params", "addAnimationParams", "stateGroups", "setStateGroups", "stateGroup", "addStateGroup", "Lio/bidmachine/rendering/model/AdPhaseParams;", BillingClientBuilderBridgeCommon.buildMethodName, "a", "I", "sequence", "b", "Ljava/util/List;", "c", "d", "e", "Ljava/util/Map;", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", "Lio/bidmachine/rendering/model/Background;", "j", "getBackgroundColor$annotations", "()V", "<init>", "(I)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int sequence;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Background background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List adsElementParamsList = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List controlsElementParamsList = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List methodParamsList = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Map sourceEventTypeMap = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Map customParams = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Map animationParams = new EnumMap(AnimationEventType.class);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final List stateGroups = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int backgroundColor = ViewCompat.MEASURED_STATE_MASK;

        public Builder(int i10) {
            this.sequence = i10;
        }

        public final Builder addAdsElementParams(AdElementParams adElementParams) {
            p.j(adElementParams, "adElementParams");
            this.adsElementParamsList.add(adElementParams);
            return this;
        }

        public final Builder addAnimationParams(AnimationParams params) {
            p.j(params, "params");
            this.animationParams.put(params.getEvent(), params);
            return this;
        }

        public final Builder addControlsElementParams(AdElementParams adElementParams) {
            p.j(adElementParams, "adElementParams");
            this.controlsElementParamsList.add(adElementParams);
            return this;
        }

        public final Builder addEventParams(EventParams eventParams) {
            p.j(eventParams, "eventParams");
            List<EventTaskParams> eventTaskParamsList = eventParams.getEventTaskParamsList();
            if (!eventTaskParamsList.isEmpty()) {
                String source = eventParams.getSource();
                Map enumMap = (Map) this.sourceEventTypeMap.get(source);
                if (enumMap == null) {
                    enumMap = new EnumMap(EventType.class);
                    this.sourceEventTypeMap.put(source, enumMap);
                }
                EventType eventType = eventParams.getEventType();
                List arrayList = (List) enumMap.get(eventType);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    enumMap.put(eventType, arrayList);
                }
                arrayList.addAll(eventTaskParamsList);
            }
            return this;
        }

        public final Builder addMethodParams(MethodParams methodParams) {
            p.j(methodParams, "methodParams");
            this.methodParamsList.add(methodParams);
            return this;
        }

        public final Builder addStateGroup(String stateGroup) {
            p.j(stateGroup, "stateGroup");
            this.stateGroups.add(stateGroup);
            return this;
        }

        public final AdPhaseParams build() {
            return new AdPhaseParams(this.sequence, this.background, Integer.valueOf(this.backgroundColor), this.adsElementParamsList, this.controlsElementParamsList, this.methodParamsList, this.sourceEventTypeMap, this.customParams, this.animationParams, this.stateGroups);
        }

        public final Builder setAdsElementParamsList(List<AdElementParams> adsElementParamsList) {
            UtilsKt.setSafely(this.adsElementParamsList, adsElementParamsList);
            return this;
        }

        public final Builder setAnimationParams(Map<AnimationEventType, AnimationParams> animationParams) {
            UtilsKt.setSafely(this.animationParams, animationParams);
            return this;
        }

        public final Builder setBackground(Background background) {
            this.background = background;
            return this;
        }

        public final Builder setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public final Builder setControlsElementParamsList(List<AdElementParams> controlsElementParamsList) {
            UtilsKt.setSafely(this.controlsElementParamsList, controlsElementParamsList);
            return this;
        }

        public final Builder setCustomParams(Map<String, String> customParams) {
            UtilsKt.setSafely(this.customParams, customParams);
            return this;
        }

        public final Builder setEventParamsList(Map<String, ? extends Map<EventType, List<EventTaskParams>>> sourceEventTypeMap) {
            UtilsKt.setSafely(this.sourceEventTypeMap, sourceEventTypeMap);
            return this;
        }

        public final Builder setMethodParamsList(List<MethodParams> methodParamsList) {
            UtilsKt.setSafely(this.methodParamsList, methodParamsList);
            return this;
        }

        public final Builder setStateGroups(List<String> stateGroups) {
            UtilsKt.setSafely(this.stateGroups, stateGroups);
            return this;
        }
    }

    public AdPhaseParams(int i10, Background background, Integer num, List<AdElementParams> list, List<AdElementParams> list2, List<MethodParams> list3, Map<String, ? extends Map<EventType, ? extends List<EventTaskParams>>> map, Map<String, String> map2, Map<AnimationEventType, AnimationParams> map3, List<String> list4) {
        p.j(list, "adsList");
        p.j(list2, "controlsList");
        p.j(list3, "methodParamsList");
        p.j(map, "sourceEventTypeMap");
        p.j(map2, "customParams");
        p.j(map3, "animationParams");
        p.j(list4, "stateGroups");
        this.sequence = i10;
        this.background = background;
        this.backgroundColor = num;
        this.adsList = list;
        this.controlsList = list2;
        this.methodParamsList = list3;
        this.sourceEventTypeMap = map;
        this.customParams = map2;
        this.animationParams = map3;
        this.stateGroups = list4;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public final List<AdElementParams> getAdsList() {
        return this.adsList;
    }

    public final Map<AnimationEventType, AnimationParams> getAnimationParams() {
        return this.animationParams;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<AdElementParams> getControlsList() {
        return this.controlsList;
    }

    public final String getCustomParam(String key) {
        p.j(key, C3426d4.i.W);
        return (String) this.customParams.get(key);
    }

    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    public final Map<EventType, List<EventTaskParams>> getEventTypeMap(String sourceName) {
        p.j(sourceName, "sourceName");
        return (Map) this.sourceEventTypeMap.get(sourceName);
    }

    public final List<MethodParams> getMethodParamsList() {
        return this.methodParamsList;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final Map<String, Map<EventType, List<EventTaskParams>>> getSourceEventTypeMap() {
        return this.sourceEventTypeMap;
    }

    public final List<String> getStateGroups() {
        return this.stateGroups;
    }

    public /* synthetic */ AdPhaseParams(int i10, Background background, Integer num, List list, List list2, List list3, Map map, Map map2, Map map3, List list4, int i11, i iVar) {
        this(i10, (i11 & 2) != 0 ? null : background, (i11 & 4) != 0 ? Integer.valueOf(ViewCompat.MEASURED_STATE_MASK) : num, list, list2, list3, map, map2, map3, list4);
    }
}
