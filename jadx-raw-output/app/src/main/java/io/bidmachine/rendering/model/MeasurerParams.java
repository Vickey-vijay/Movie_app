package io.bidmachine.rendering.model;

import ck.i;
import ck.p;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/rendering/model/MeasurerParams;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "b", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class MeasurerParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map parameters;

    public MeasurerParams(String str, Map<String, String> map) {
        p.j(str, "name");
        this.name = str;
        this.parameters = map;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public /* synthetic */ MeasurerParams(String str, Map map, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : map);
    }
}
