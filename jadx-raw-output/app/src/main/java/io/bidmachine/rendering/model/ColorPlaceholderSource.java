package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lio/bidmachine/rendering/model/ColorPlaceholderSource;", "Lio/bidmachine/rendering/model/PlaceholderSource;", "Lio/bidmachine/rendering/model/Color;", "a", "Lio/bidmachine/rendering/model/Color;", "getColor", "()Lio/bidmachine/rendering/model/Color;", "color", "<init>", "(Lio/bidmachine/rendering/model/Color;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class ColorPlaceholderSource implements PlaceholderSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Color color;

    public ColorPlaceholderSource(Color color) {
        p.j(color, "color");
        this.color = color;
    }

    public final Color getColor() {
        return this.color;
    }
}
