package io.bidmachine.rendering.model;

import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmParams;", "", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmType;", "a", "Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmType;", "getType", "()Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmType;", "type", "", "b", "F", "getThreshold", "()F", "threshold", "c", "getWeight", ActivityChooserModel.ATTRIBUTE_WEIGHT, "<init>", "(Lio/bidmachine/rendering/model/BrokenCreativeAlgorithmType;FF)V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class BrokenCreativeAlgorithmParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BrokenCreativeAlgorithmType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float threshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float weight;

    public BrokenCreativeAlgorithmParams(BrokenCreativeAlgorithmType brokenCreativeAlgorithmType, float f10, float f11) {
        p.j(brokenCreativeAlgorithmType, "type");
        this.type = brokenCreativeAlgorithmType;
        this.threshold = f10;
        this.weight = f11;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    public final BrokenCreativeAlgorithmType getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }
}
