package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/rendering/model/Image;", "", "Lio/bidmachine/rendering/model/ScaleType;", "a", "Lio/bidmachine/rendering/model/ScaleType;", "getScaleType", "()Lio/bidmachine/rendering/model/ScaleType;", "scaleType", "Lio/bidmachine/rendering/model/Resource;", "b", "Lio/bidmachine/rendering/model/Resource;", "getResource", "()Lio/bidmachine/rendering/model/Resource;", "resource", "<init>", "(Lio/bidmachine/rendering/model/ScaleType;Lio/bidmachine/rendering/model/Resource;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScaleType scaleType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Resource resource;

    public Image(ScaleType scaleType, Resource resource) {
        p.j(scaleType, "scaleType");
        p.j(resource, "resource");
        this.scaleType = scaleType;
        this.resource = resource;
    }

    public final Resource getResource() {
        return this.resource;
    }

    public final ScaleType getScaleType() {
        return this.scaleType;
    }
}
