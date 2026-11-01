package com.vungle.ads.internal.util;

import ck.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SafeObjectInputStream.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\nH\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/util/SafeObjectInputStream;", "Ljava/io/ObjectInputStream;", ScarConstants.IN_SIGNAL_KEY, "Ljava/io/InputStream;", "allowed", "", "Ljava/lang/Class;", "(Ljava/io/InputStream;Ljava/util/List;)V", "resolveClass", CampaignEx.JSON_KEY_DESC, "Ljava/io/ObjectStreamClass;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        p.j(desc, CampaignEx.JSON_KEY_DESC);
        Class<?> clsResolveClass = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(clsResolveClass) || p.e(String.class, clsResolveClass) || p.e(Boolean.class, clsResolveClass) || clsResolveClass.isArray() || this.allowed.contains(clsResolveClass)) {
            p.i(clsResolveClass, "c");
            return clsResolveClass;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }
}
