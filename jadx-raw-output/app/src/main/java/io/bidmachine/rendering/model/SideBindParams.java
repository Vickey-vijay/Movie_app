package io.bidmachine.rendering.model;

import ck.p;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/rendering/model/SideBindParams;", "", "Lio/bidmachine/rendering/model/SideType;", "a", "Lio/bidmachine/rendering/model/SideType;", "getTargetSideType", "()Lio/bidmachine/rendering/model/SideType;", "targetSideType", "", "b", "Ljava/lang/String;", "getTargetName", "()Ljava/lang/String;", "targetName", "<init>", "(Lio/bidmachine/rendering/model/SideType;Ljava/lang/String;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class SideBindParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SideType targetSideType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String targetName;

    public SideBindParams(SideType sideType, String str) {
        p.j(sideType, "targetSideType");
        p.j(str, "targetName");
        this.targetSideType = sideType;
        Locale locale = Locale.ENGLISH;
        p.i(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.targetName = lowerCase;
    }

    public final String getTargetName() {
        return this.targetName;
    }

    public final SideType getTargetSideType() {
        return this.targetSideType;
    }
}
