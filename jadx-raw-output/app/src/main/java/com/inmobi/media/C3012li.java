package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3012li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24779a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3012li) && this.f24779a == ((C3012li) obj).f24779a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24779a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f24779a + ")";
    }

    public C3012li(int i10) {
        this.f24779a = i10;
    }
}
