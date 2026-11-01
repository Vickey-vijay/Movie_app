package io.bidmachine.rendering.model;

import androidx.annotation.FloatRange;
import ck.i;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/bidmachine/rendering/model/Background;", "", "", "a", "F", "getOpacity", "()F", VastAttributes.OPACITY, "Lio/bidmachine/rendering/model/BackgroundSource;", "b", "Lio/bidmachine/rendering/model/BackgroundSource;", "getSource", "()Lio/bidmachine/rendering/model/BackgroundSource;", "source", "Lio/bidmachine/rendering/model/Placeholder;", "c", "Lio/bidmachine/rendering/model/Placeholder;", "getPlaceholder", "()Lio/bidmachine/rendering/model/Placeholder;", "placeholder", "<init>", "(FLio/bidmachine/rendering/model/BackgroundSource;Lio/bidmachine/rendering/model/Placeholder;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class Background {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float opacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BackgroundSource source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Placeholder placeholder;

    public Background(@FloatRange(from = 0.0d, to = 1.0d) float f10, BackgroundSource backgroundSource, Placeholder placeholder) {
        this.opacity = f10;
        this.source = backgroundSource;
        this.placeholder = placeholder;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public final BackgroundSource getSource() {
        return this.source;
    }

    public /* synthetic */ Background(float f10, BackgroundSource backgroundSource, Placeholder placeholder, int i10, i iVar) {
        this(f10, (i10 & 2) != 0 ? null : backgroundSource, (i10 & 4) != 0 ? null : placeholder);
    }
}
