package io.bidmachine.rendering.model;

import ck.p;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lio/bidmachine/rendering/model/Gradient;", "", "Lio/bidmachine/rendering/model/GradientType;", "a", "Lio/bidmachine/rendering/model/GradientType;", "getType", "()Lio/bidmachine/rendering/model/GradientType;", "type", "Lio/bidmachine/rendering/model/GradientDirection;", "b", "Lio/bidmachine/rendering/model/GradientDirection;", "getDirection", "()Lio/bidmachine/rendering/model/GradientDirection;", "direction", "", "", "c", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "colors", "<init>", "(Lio/bidmachine/rendering/model/GradientType;Lio/bidmachine/rendering/model/GradientDirection;Ljava/util/List;)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class Gradient {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final GradientType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final GradientDirection direction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List colors;

    public Gradient(GradientType gradientType, GradientDirection gradientDirection, List<Integer> list) {
        p.j(gradientType, "type");
        p.j(gradientDirection, "direction");
        p.j(list, "colors");
        this.type = gradientType;
        this.direction = gradientDirection;
        this.colors = list;
    }

    public final List<Integer> getColors() {
        return this.colors;
    }

    public final GradientDirection getDirection() {
        return this.direction;
    }

    public final GradientType getType() {
        return this.type;
    }
}
