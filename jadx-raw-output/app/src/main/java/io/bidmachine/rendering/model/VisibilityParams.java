package io.bidmachine.rendering.model;

import ck.i;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.rendering.utils.RelativePercent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0011B%\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lio/bidmachine/rendering/model/VisibilityParams;", "", "", "a", "F", "getVisibilityPercent", "()F", "visibilityPercent", "", "b", "Z", "isIgnoreWindowFocus", "()Z", "c", "isIgnoreOverlap", "<init>", "(FZZ)V", "Builder", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class VisibilityParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float visibilityPercent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isIgnoreWindowFocus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isIgnoreOverlap;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/bidmachine/rendering/model/VisibilityParams$Builder;", "", "", "visibilityPercent", "setVisibilityPercent", "", "isIgnoreWindowFocus", "setIgnoreWindowFocus", "isIgnoreOverlap", "setIgnoreOverlap", "Lio/bidmachine/rendering/model/VisibilityParams;", BillingClientBuilderBridgeCommon.buildMethodName, "a", "F", "getVisibilityPercent$annotations", "()V", "b", "Z", "c", "<init>", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private float visibilityPercent = 0.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isIgnoreWindowFocus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isIgnoreOverlap;

        public final VisibilityParams build() {
            return new VisibilityParams(this.visibilityPercent, this.isIgnoreWindowFocus, this.isIgnoreOverlap);
        }

        public final Builder setIgnoreOverlap(boolean isIgnoreOverlap) {
            this.isIgnoreOverlap = isIgnoreOverlap;
            return this;
        }

        public final Builder setIgnoreWindowFocus(boolean isIgnoreWindowFocus) {
            this.isIgnoreWindowFocus = isIgnoreWindowFocus;
            return this;
        }

        public final Builder setVisibilityPercent(@RelativePercent float visibilityPercent) {
            this.visibilityPercent = visibilityPercent;
            return this;
        }
    }

    public VisibilityParams() {
        this(0.0f, false, false, 7, null);
    }

    public final float getVisibilityPercent() {
        return this.visibilityPercent;
    }

    /* JADX INFO: renamed from: isIgnoreOverlap, reason: from getter */
    public final boolean getIsIgnoreOverlap() {
        return this.isIgnoreOverlap;
    }

    /* JADX INFO: renamed from: isIgnoreWindowFocus, reason: from getter */
    public final boolean getIsIgnoreWindowFocus() {
        return this.isIgnoreWindowFocus;
    }

    public VisibilityParams(@RelativePercent float f10, boolean z10, boolean z11) {
        this.visibilityPercent = f10;
        this.isIgnoreWindowFocus = z10;
        this.isIgnoreOverlap = z11;
    }

    public /* synthetic */ VisibilityParams(float f10, boolean z10, boolean z11, int i10, i iVar) {
        this((i10 & 1) != 0 ? 0.5f : f10, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
