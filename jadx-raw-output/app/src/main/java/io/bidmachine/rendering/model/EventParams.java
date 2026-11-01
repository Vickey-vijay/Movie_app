package io.bidmachine.rendering.model;

import ck.i;
import ck.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lio/bidmachine/rendering/model/EventParams;", "", "Lio/bidmachine/rendering/model/EventType;", "a", "Lio/bidmachine/rendering/model/EventType;", "getEventType", "()Lio/bidmachine/rendering/model/EventType;", "eventType", "", "Lio/bidmachine/rendering/model/EventTaskParams;", "b", "Ljava/util/List;", "getEventTaskParamsList", "()Ljava/util/List;", "eventTaskParamsList", "", "c", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "source", "<init>", "(Lio/bidmachine/rendering/model/EventType;Ljava/lang/String;Ljava/util/List;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class EventParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EventType eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List eventTaskParamsList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String source;

    public EventParams(EventType eventType, String str, List<EventTaskParams> list) {
        p.j(eventType, "eventType");
        p.j(str, "source");
        p.j(list, "eventTaskParamsList");
        this.eventType = eventType;
        this.eventTaskParamsList = list;
        Locale locale = Locale.ENGLISH;
        p.i(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.source = lowerCase;
    }

    public final List<EventTaskParams> getEventTaskParamsList() {
        return this.eventTaskParamsList;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final String getSource() {
        return this.source;
    }

    public /* synthetic */ EventParams(EventType eventType, String str, List list, int i10, i iVar) {
        this(eventType, str, (i10 & 4) != 0 ? new ArrayList() : list);
    }
}
