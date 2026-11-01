package io.bidmachine.rendering.model;

import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lio/bidmachine/rendering/model/AnimationParams;", "", "Lio/bidmachine/rendering/model/AnimationDirectionType;", "getDirectionOrDefault", "Lio/bidmachine/rendering/model/AnimationEventType;", "a", "Lio/bidmachine/rendering/model/AnimationEventType;", "getEvent", "()Lio/bidmachine/rendering/model/AnimationEventType;", "event", "Lio/bidmachine/rendering/model/AnimationStyleType;", "b", "Lio/bidmachine/rendering/model/AnimationStyleType;", "getStyle", "()Lio/bidmachine/rendering/model/AnimationStyleType;", "style", "Lio/bidmachine/rendering/model/AnimationFunctionType;", "c", "Lio/bidmachine/rendering/model/AnimationFunctionType;", "getFunction", "()Lio/bidmachine/rendering/model/AnimationFunctionType;", "function", "", "d", "J", "getDuration", "()J", "duration", "e", "Lio/bidmachine/rendering/model/AnimationDirectionType;", "getDirection", "()Lio/bidmachine/rendering/model/AnimationDirectionType;", "direction", "<init>", "(Lio/bidmachine/rendering/model/AnimationEventType;Lio/bidmachine/rendering/model/AnimationStyleType;Lio/bidmachine/rendering/model/AnimationFunctionType;JLio/bidmachine/rendering/model/AnimationDirectionType;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class AnimationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnimationEventType event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AnimationStyleType style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AnimationFunctionType function;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AnimationDirectionType direction;

    public AnimationParams(AnimationEventType animationEventType, AnimationStyleType animationStyleType, AnimationFunctionType animationFunctionType, long j10, AnimationDirectionType animationDirectionType) {
        p.j(animationEventType, "event");
        p.j(animationStyleType, "style");
        this.event = animationEventType;
        this.style = animationStyleType;
        this.function = animationFunctionType;
        this.duration = j10;
        this.direction = animationDirectionType;
    }

    public final AnimationDirectionType getDirection() {
        return this.direction;
    }

    public final AnimationDirectionType getDirectionOrDefault() {
        AnimationDirectionType animationDirectionType = this.direction;
        return animationDirectionType == null ? AnimationDirectionType.Left : animationDirectionType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final AnimationEventType getEvent() {
        return this.event;
    }

    public final AnimationFunctionType getFunction() {
        return this.function;
    }

    public final AnimationStyleType getStyle() {
        return this.style;
    }
}
