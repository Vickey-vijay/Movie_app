package io.bidmachine.rendering.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import nj.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J9\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lio/bidmachine/rendering/model/EventTaskParams;", "", "Lio/bidmachine/rendering/model/EventTaskType;", "component1", "", "component2", "component3", "", "component4", "eventTaskType", TypedValues.AttributesType.S_TARGET, "value", "stateGroups", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lio/bidmachine/rendering/model/EventTaskType;", "getEventTaskType", "()Lio/bidmachine/rendering/model/EventTaskType;", "b", "Ljava/lang/String;", "getTarget", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "d", "Ljava/util/List;", "getStateGroups", "()Ljava/util/List;", "<init>", "(Lio/bidmachine/rendering/model/EventTaskType;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;)V", VastTagName.COMPANION, "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final /* data */ class EventTaskParams {
    public static final String STATE_GROUP_DEFAULT = "default";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EventTaskType eventTaskType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String target;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List stateGroups;

    public EventTaskParams(EventTaskType eventTaskType, String str, Object obj, List<String> list) {
        p.j(eventTaskType, "eventTaskType");
        p.j(str, TypedValues.AttributesType.S_TARGET);
        p.j(list, "stateGroups");
        this.eventTaskType = eventTaskType;
        this.target = str;
        this.value = obj;
        this.stateGroups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventTaskParams copy$default(EventTaskParams eventTaskParams, EventTaskType eventTaskType, String str, Object obj, List list, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            eventTaskType = eventTaskParams.eventTaskType;
        }
        if ((i10 & 2) != 0) {
            str = eventTaskParams.target;
        }
        if ((i10 & 4) != 0) {
            obj = eventTaskParams.value;
        }
        if ((i10 & 8) != 0) {
            list = eventTaskParams.stateGroups;
        }
        return eventTaskParams.copy(eventTaskType, str, obj, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventTaskType getEventTaskType() {
        return this.eventTaskType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final List<String> component4() {
        return this.stateGroups;
    }

    public final EventTaskParams copy(EventTaskType eventTaskType, String target, Object value, List<String> stateGroups) {
        p.j(eventTaskType, "eventTaskType");
        p.j(target, TypedValues.AttributesType.S_TARGET);
        p.j(stateGroups, "stateGroups");
        return new EventTaskParams(eventTaskType, target, value, stateGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTaskParams)) {
            return false;
        }
        EventTaskParams eventTaskParams = (EventTaskParams) other;
        return this.eventTaskType == eventTaskParams.eventTaskType && p.e(this.target, eventTaskParams.target) && p.e(this.value, eventTaskParams.value) && p.e(this.stateGroups, eventTaskParams.stateGroups);
    }

    public final EventTaskType getEventTaskType() {
        return this.eventTaskType;
    }

    public final List<String> getStateGroups() {
        return this.stateGroups;
    }

    public final String getTarget() {
        return this.target;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.eventTaskType.hashCode() * 31) + this.target.hashCode()) * 31;
        Object obj = this.value;
        return ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.stateGroups.hashCode();
    }

    public String toString() {
        return "EventTaskParams(eventTaskType=" + this.eventTaskType + ", target=" + this.target + ", value=" + this.value + ", stateGroups=" + this.stateGroups + ')';
    }

    public /* synthetic */ EventTaskParams(EventTaskType eventTaskType, String str, Object obj, List list, int i10, i iVar) {
        this(eventTaskType, str, (i10 & 4) != 0 ? null : obj, (i10 & 8) != 0 ? s.k() : list);
    }
}
