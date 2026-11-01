package com.yandex.div.core.player;

import ck.i;
import ck.p;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPlayerPlaybackConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivPlayerPlaybackConfig {
    private final boolean autoplay;
    private final boolean isMuted;
    private final JSONObject payload;
    private final boolean repeatable;

    public DivPlayerPlaybackConfig() {
        this(false, false, false, null, 15, null);
    }

    public DivPlayerPlaybackConfig(boolean z10, boolean z11, boolean z12, JSONObject jSONObject) {
        this.autoplay = z10;
        this.isMuted = z11;
        this.repeatable = z12;
        this.payload = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivPlayerPlaybackConfig)) {
            return false;
        }
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = (DivPlayerPlaybackConfig) obj;
        return this.autoplay == divPlayerPlaybackConfig.autoplay && this.isMuted == divPlayerPlaybackConfig.isMuted && this.repeatable == divPlayerPlaybackConfig.repeatable && p.e(this.payload, divPlayerPlaybackConfig.payload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.autoplay;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.isMuted;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.repeatable;
        int i12 = (i11 + (z12 ? 1 : z12)) * 31;
        JSONObject jSONObject = this.payload;
        return i12 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.autoplay + ", isMuted=" + this.isMuted + ", repeatable=" + this.repeatable + ", payload=" + this.payload + ')';
    }

    public /* synthetic */ DivPlayerPlaybackConfig(boolean z10, boolean z11, boolean z12, JSONObject jSONObject, int i10, i iVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? null : jSONObject);
    }
}
