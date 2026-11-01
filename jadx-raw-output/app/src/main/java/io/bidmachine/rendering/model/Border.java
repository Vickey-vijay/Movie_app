package io.bidmachine.rendering.model;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lio/bidmachine/rendering/model/Border;", "", "", "a", "I", "getStrokeWidthPx", "()I", "strokeWidthPx", "b", "getStrokeColor", "strokeColor", "<init>", "(II)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class Border {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int strokeWidthPx;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int strokeColor;

    public Border(int i10, int i11) {
        this.strokeWidthPx = i10;
        this.strokeColor = i11;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeWidthPx() {
        return this.strokeWidthPx;
    }
}
