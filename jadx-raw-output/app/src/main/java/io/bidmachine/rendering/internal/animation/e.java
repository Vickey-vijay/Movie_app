package io.bidmachine.rendering.internal.animation;

import android.view.View;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f60082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f60083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f60084c;

    public e(float f10, float f11, float f12) {
        this.f60082a = f10;
        this.f60083b = f11;
        this.f60084c = f12;
    }

    public final float a() {
        return this.f60082a;
    }

    public final float b() {
        return this.f60083b;
    }

    public final float c() {
        return this.f60084c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f60082a, eVar.f60082a) == 0 && Float.compare(this.f60083b, eVar.f60083b) == 0 && Float.compare(this.f60084c, eVar.f60084c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f60082a) * 31) + Float.hashCode(this.f60083b)) * 31) + Float.hashCode(this.f60084c);
    }

    public String toString() {
        return "AdAnimationValues(alpha=" + this.f60082a + ", translationX=" + this.f60083b + ", translationY=" + this.f60084c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        this(view.getAlpha(), view.getTranslationX(), view.getTranslationY());
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}
