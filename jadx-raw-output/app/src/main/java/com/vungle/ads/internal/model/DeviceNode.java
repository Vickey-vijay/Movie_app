package com.vungle.ads.internal.model;

import al.d;
import bl.a1;
import bl.d2;
import bl.o1;
import bl.p0;
import bl.y1;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@f
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0003MLNBs\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bF\u0010GB\u0085\u0001\b\u0017\u0012\u0006\u0010H\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bF\u0010KJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0088\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b#\u0010$J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u000fHÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b0\u0010,R\"\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u00105R$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u0010:R$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\b;\u0010,\"\u0004\b<\u0010:R$\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010=\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010@R$\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006O"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "component11", Q6.f27469t, "model", Q6.G, Q6.Q0, Q6.F, "w", "h", Q6.f27422d0, "ifa", "lmt", "ext", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)Lcom/vungle/ads/internal/model/DeviceNode;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMake", "()Ljava/lang/String;", "getModel", "getOsv", "getCarrier", "getOs", "I", "getW", "()I", "setW", "(I)V", "getH", "setH", "getUa", "setUa", "(Ljava/lang/String;)V", "getIfa", "setIfa", "Ljava/lang/Integer;", "getLmt", "setLmt", "(Ljava/lang/Integer;)V", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "getExt", "()Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "setExt", "(Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "VungleExt", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DeviceNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private VungleExt ext;
    private int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private int w;

    /* JADX INFO: compiled from: DeviceNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/DeviceNode;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<DeviceNode> serializer() {
            return DeviceNode$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DeviceNode.kt */
    @f
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\by\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u009d\u00012\u00020\u0001:\u0004\u009e\u0001\u009d\u0001B\u008d\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010*\u001a\u00020\u0010\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u00103\u001a\u00020\r\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\r\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001B¤\u0002\b\u0017\u0012\u0007\u0010\u0099\u0001\u001a\u00020\r\u0012\b\b\u0001\u0010'\u001a\u00020\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010*\u001a\u00020\u0010\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010,\u001a\u00020\r\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u00102\u001a\u00020\u0010\u0012\b\b\u0001\u00103\u001a\u00020\r\u0012\b\b\u0001\u00104\u001a\u00020\t\u0012\b\b\u0001\u00105\u001a\u00020\r\u0012\b\b\u0001\u00106\u001a\u00020\t\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u009c\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\rHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001a\u001a\u00020\rHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\rHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0094\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010*\u001a\u00020\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010,\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00102\u001a\u00020\u00102\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b>\u0010?J\t\u0010@\u001a\u00020\u000bHÖ\u0001J\t\u0010A\u001a\u00020\rHÖ\u0001J\u0013\u0010C\u001a\u00020\t2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010'\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010D\u0012\u0004\bH\u0010I\u001a\u0004\b'\u0010E\"\u0004\bF\u0010GR*\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010J\u0012\u0004\bO\u0010I\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010)\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010P\u0012\u0004\bT\u0010I\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u0010SR(\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010U\u0012\u0004\bZ\u0010I\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR*\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010J\u0012\u0004\b]\u0010I\u001a\u0004\b[\u0010L\"\u0004\b\\\u0010NR(\u0010,\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010^\u0012\u0004\bc\u0010I\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010J\u0012\u0004\bf\u0010I\u001a\u0004\bd\u0010L\"\u0004\be\u0010NR*\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010J\u0012\u0004\bi\u0010I\u001a\u0004\bg\u0010L\"\u0004\bh\u0010NR*\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u0010J\u0012\u0004\bl\u0010I\u001a\u0004\bj\u0010L\"\u0004\bk\u0010NR*\u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u0010J\u0012\u0004\bo\u0010I\u001a\u0004\bm\u0010L\"\u0004\bn\u0010NR*\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u0010J\u0012\u0004\br\u0010I\u001a\u0004\bp\u0010L\"\u0004\bq\u0010NR(\u00102\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u0010U\u0012\u0004\bu\u0010I\u001a\u0004\bs\u0010W\"\u0004\bt\u0010YR(\u00103\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u0010^\u0012\u0004\bx\u0010I\u001a\u0004\bv\u0010`\"\u0004\bw\u0010bR(\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u0010D\u0012\u0004\bz\u0010I\u001a\u0004\b4\u0010E\"\u0004\by\u0010GR(\u00105\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010^\u0012\u0004\b}\u0010I\u001a\u0004\b{\u0010`\"\u0004\b|\u0010bR(\u00106\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u0010D\u0012\u0004\b\u007f\u0010I\u001a\u0004\b6\u0010E\"\u0004\b~\u0010GR-\u00107\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b7\u0010J\u0012\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0080\u0001\u0010L\"\u0005\b\u0081\u0001\u0010NR-\u00108\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b8\u0010J\u0012\u0005\b\u0085\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010L\"\u0005\b\u0084\u0001\u0010NR/\u00109\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b9\u0010\u0086\u0001\u0012\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u0087\u0001\u0010\"\"\u0006\b\u0088\u0001\u0010\u0089\u0001R/\u0010:\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b:\u0010\u0086\u0001\u0012\u0005\b\u008d\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010\"\"\u0006\b\u008c\u0001\u0010\u0089\u0001R/\u0010;\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b;\u0010\u0086\u0001\u0012\u0005\b\u0090\u0001\u0010I\u001a\u0005\b\u008e\u0001\u0010\"\"\u0006\b\u008f\u0001\u0010\u0089\u0001R/\u0010<\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b<\u0010\u0086\u0001\u0012\u0005\b\u0093\u0001\u0010I\u001a\u0005\b\u0091\u0001\u0010\"\"\u0006\b\u0092\u0001\u0010\u0089\u0001R-\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b=\u0010J\u0012\u0005\b\u0096\u0001\u0010I\u001a\u0005\b\u0094\u0001\u0010L\"\u0005\b\u0095\u0001\u0010N¨\u0006\u009f\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "component1", "", "component2", "", "component3", "()Ljava/lang/Integer;", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", "component23", "isGooglePlayServicesAvailable", "appSetId", "appSetIdScope", C3426d4.j.Y, "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", CommonUrlParts.LOCALE, "language", "timeZone", "volumeLevel", "soundEnabled", "isTv", C3426d4.j.f28597i0, "isSideloadEnabled", Q6.V0, "amazonAdvertisingId", "sit", "oit", "ort", "obt", "gpVersion", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "toString", "hashCode", "other", "equals", "Z", "()Z", "setGooglePlayServicesAvailable", "(Z)V", "isGooglePlayServicesAvailable$annotations", "()V", "Ljava/lang/String;", "getAppSetId", "()Ljava/lang/String;", "setAppSetId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "Ljava/lang/Integer;", "getAppSetIdScope", "setAppSetIdScope", "(Ljava/lang/Integer;)V", "getAppSetIdScope$annotations", "F", "getBatteryLevel", "()F", "setBatteryLevel", "(F)V", "getBatteryLevel$annotations", "getBatteryState", "setBatteryState", "getBatteryState$annotations", "I", "getBatterySaverEnabled", "()I", "setBatterySaverEnabled", "(I)V", "getBatterySaverEnabled$annotations", "getConnectionType", "setConnectionType", "getConnectionType$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "getConnectionTypeDetail$annotations", "getLocale", "setLocale", "getLocale$annotations", "getLanguage", "setLanguage", "getLanguage$annotations", "getTimeZone", "setTimeZone", "getTimeZone$annotations", "getVolumeLevel", "setVolumeLevel", "getVolumeLevel$annotations", "getSoundEnabled", "setSoundEnabled", "getSoundEnabled$annotations", "setTv", "isTv$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSdCardAvailable$annotations", "setSideloadEnabled", "isSideloadEnabled$annotations", "getGaid", "setGaid", "getGaid$annotations", "getAmazonAdvertisingId", "setAmazonAdvertisingId", "getAmazonAdvertisingId$annotations", "Ljava/lang/Long;", "getSit", "setSit", "(Ljava/lang/Long;)V", "getSit$annotations", "getOit", "setOit", "getOit$annotations", "getOrt", "setOrt", "getOrt$annotations", "getObt", "setObt", "getObt$annotations", "getGpVersion", "setGpVersion", "getGpVersion$annotations", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class VungleExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private String gpVersion;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private Long obt;
        private Long oit;
        private Long ort;
        private int sdCardAvailable;
        private Long sit;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        /* JADX INFO: compiled from: DeviceNode.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/model/DeviceNode$VungleExt$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final b<VungleExt> serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (i) null);
        }

        public /* synthetic */ VungleExt(int i10, boolean z10, String str, Integer num, float f10, String str2, int i11, String str3, String str4, String str5, String str6, String str7, float f11, int i12, boolean z11, int i13, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, y1 y1Var) {
            if ((i10 & 0) != 0) {
                o1.a(i10, 0, DeviceNode$VungleExt$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l10;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l11;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l12;
            }
            if ((2097152 & i10) == 0) {
                this.obt = null;
            } else {
                this.obt = l13;
            }
            if ((i10 & 4194304) == 0) {
                this.gpVersion = null;
            } else {
                this.gpVersion = str10;
            }
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getGpVersion$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getObt$annotations() {
        }

        public static /* synthetic */ void getOit$annotations() {
        }

        public static /* synthetic */ void getOrt$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSit$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getSit() {
            return this.sit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getOit() {
            return this.oit;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getOrt() {
            return this.ort;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getObt() {
            return this.obt;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getGpVersion() {
            return this.gpVersion;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBatteryState() {
            return this.batteryState;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getConnectionType() {
            return this.connectionType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        public final VungleExt copy(boolean isGooglePlayServicesAvailable, String appSetId, Integer appSetIdScope, float batteryLevel, String batteryState, int batterySaverEnabled, String connectionType, String connectionTypeDetail, String locale, String language, String timeZone, float volumeLevel, int soundEnabled, boolean isTv, int sdCardAvailable, boolean isSideloadEnabled, String gaid, String amazonAdvertisingId, Long sit, Long oit, Long ort, Long obt, String gpVersion) {
            return new VungleExt(isGooglePlayServicesAvailable, appSetId, appSetIdScope, batteryLevel, batteryState, batterySaverEnabled, connectionType, connectionTypeDetail, locale, language, timeZone, volumeLevel, soundEnabled, isTv, sdCardAvailable, isSideloadEnabled, gaid, amazonAdvertisingId, sit, oit, ort, obt, gpVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && p.e(this.appSetId, vungleExt.appSetId) && p.e(this.appSetIdScope, vungleExt.appSetIdScope) && p.e(Float.valueOf(this.batteryLevel), Float.valueOf(vungleExt.batteryLevel)) && p.e(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && p.e(this.connectionType, vungleExt.connectionType) && p.e(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && p.e(this.locale, vungleExt.locale) && p.e(this.language, vungleExt.language) && p.e(this.timeZone, vungleExt.timeZone) && p.e(Float.valueOf(this.volumeLevel), Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && p.e(this.gaid, vungleExt.gaid) && p.e(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && p.e(this.sit, vungleExt.sit) && p.e(this.oit, vungleExt.oit) && p.e(this.ort, vungleExt.ort) && p.e(this.obt, vungleExt.obt) && p.e(this.gpVersion, vungleExt.gpVersion);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v27, types: [int] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r2v33, types: [int] */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v46 */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = r10 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.batterySaverEnabled)) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.hashCode(this.volumeLevel)) * 31) + Integer.hashCode(this.soundEnabled)) * 31;
            boolean z11 = this.isTv;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int iHashCode9 = (((iHashCode8 + r11) * 31) + Integer.hashCode(this.sdCardAvailable)) * 31;
            boolean z12 = this.isSideloadEnabled;
            int i11 = (iHashCode9 + (z12 ? 1 : z12)) * 31;
            String str8 = this.gaid;
            int iHashCode10 = (i11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l10 = this.sit;
            int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.oit;
            int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.ort;
            int iHashCode14 = (iHashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.obt;
            int iHashCode15 = (iHashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str10 = this.gpVersion;
            return iHashCode15 + (str10 != null ? str10.hashCode() : 0);
        }

        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ", gpVersion=" + this.gpVersion + ')';
        }

        public VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l10;
            this.oit = l11;
            this.ort = l12;
            this.obt = l13;
            this.gpVersion = str10;
        }

        public static final void write$Self(VungleExt vungleExt, d dVar, a aVar) {
            p.j(vungleExt, "self");
            p.j(dVar, "output");
            p.j(aVar, "serialDesc");
            if (dVar.q(aVar, 0) || vungleExt.isGooglePlayServicesAvailable) {
                dVar.o(aVar, 0, vungleExt.isGooglePlayServicesAvailable);
            }
            if (dVar.q(aVar, 1) || vungleExt.appSetId != null) {
                dVar.C(aVar, 1, d2.f5397a, vungleExt.appSetId);
            }
            if (dVar.q(aVar, 2) || vungleExt.appSetIdScope != null) {
                dVar.C(aVar, 2, p0.f5452a, vungleExt.appSetIdScope);
            }
            if (dVar.q(aVar, 3) || !p.e(Float.valueOf(vungleExt.batteryLevel), Float.valueOf(0.0f))) {
                dVar.B(aVar, 3, vungleExt.batteryLevel);
            }
            if (dVar.q(aVar, 4) || vungleExt.batteryState != null) {
                dVar.C(aVar, 4, d2.f5397a, vungleExt.batteryState);
            }
            if (dVar.q(aVar, 5) || vungleExt.batterySaverEnabled != 0) {
                dVar.n(aVar, 5, vungleExt.batterySaverEnabled);
            }
            if (dVar.q(aVar, 6) || vungleExt.connectionType != null) {
                dVar.C(aVar, 6, d2.f5397a, vungleExt.connectionType);
            }
            if (dVar.q(aVar, 7) || vungleExt.connectionTypeDetail != null) {
                dVar.C(aVar, 7, d2.f5397a, vungleExt.connectionTypeDetail);
            }
            if (dVar.q(aVar, 8) || vungleExt.locale != null) {
                dVar.C(aVar, 8, d2.f5397a, vungleExt.locale);
            }
            if (dVar.q(aVar, 9) || vungleExt.language != null) {
                dVar.C(aVar, 9, d2.f5397a, vungleExt.language);
            }
            if (dVar.q(aVar, 10) || vungleExt.timeZone != null) {
                dVar.C(aVar, 10, d2.f5397a, vungleExt.timeZone);
            }
            if (dVar.q(aVar, 11) || !p.e(Float.valueOf(vungleExt.volumeLevel), Float.valueOf(0.0f))) {
                dVar.B(aVar, 11, vungleExt.volumeLevel);
            }
            if (dVar.q(aVar, 12) || vungleExt.soundEnabled != 1) {
                dVar.n(aVar, 12, vungleExt.soundEnabled);
            }
            if (dVar.q(aVar, 13) || vungleExt.isTv) {
                dVar.o(aVar, 13, vungleExt.isTv);
            }
            if (dVar.q(aVar, 14) || vungleExt.sdCardAvailable != 1) {
                dVar.n(aVar, 14, vungleExt.sdCardAvailable);
            }
            if (dVar.q(aVar, 15) || vungleExt.isSideloadEnabled) {
                dVar.o(aVar, 15, vungleExt.isSideloadEnabled);
            }
            if (dVar.q(aVar, 16) || vungleExt.gaid != null) {
                dVar.C(aVar, 16, d2.f5397a, vungleExt.gaid);
            }
            if (dVar.q(aVar, 17) || vungleExt.amazonAdvertisingId != null) {
                dVar.C(aVar, 17, d2.f5397a, vungleExt.amazonAdvertisingId);
            }
            if (dVar.q(aVar, 18) || vungleExt.sit != null) {
                dVar.C(aVar, 18, a1.f5375a, vungleExt.sit);
            }
            if (dVar.q(aVar, 19) || vungleExt.oit != null) {
                dVar.C(aVar, 19, a1.f5375a, vungleExt.oit);
            }
            if (dVar.q(aVar, 20) || vungleExt.ort != null) {
                dVar.C(aVar, 20, a1.f5375a, vungleExt.ort);
            }
            if (dVar.q(aVar, 21) || vungleExt.obt != null) {
                dVar.C(aVar, 21, a1.f5375a, vungleExt.obt);
            }
            if (dVar.q(aVar, 22) || vungleExt.gpVersion != null) {
                dVar.C(aVar, 22, d2.f5397a, vungleExt.gpVersion);
            }
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getGpVersion() {
            return this.gpVersion;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Long getObt() {
            return this.obt;
        }

        public final Long getOit() {
            return this.oit;
        }

        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setGpVersion(String str) {
            this.gpVersion = str;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setObt(Long l10) {
            this.obt = l10;
        }

        public final void setOit(Long l10) {
            this.oit = l10;
        }

        public final void setOrt(Long l10) {
            this.ort = l10;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(Long l10) {
            this.sit = l10;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        public /* synthetic */ VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, i iVar) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & 2048) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & 8192) != 0 ? false : z11, (i13 & 16384) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & 65536) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & 262144) != 0 ? null : l10, (i13 & 524288) != 0 ? null : l11, (i13 & 1048576) != 0 ? null : l12, (i13 & 2097152) != 0 ? null : l13, (i13 & 4194304) != 0 ? null : str10);
        }
    }

    public /* synthetic */ DeviceNode(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, VungleExt vungleExt, y1 y1Var) {
        if (119 != (i10 & 119)) {
            o1.a(i10, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i11;
        this.h = i12;
        if ((i10 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i10 & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VungleExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String carrier, String os, int w10, int h10, String ua2, String ifa, Integer lmt, VungleExt ext) {
        p.j(make, Q6.f27469t);
        p.j(model, "model");
        p.j(osv, Q6.G);
        p.j(os, Q6.F);
        return new DeviceNode(make, model, osv, carrier, os, w10, h10, ua2, ifa, lmt, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return p.e(this.make, deviceNode.make) && p.e(this.model, deviceNode.model) && p.e(this.osv, deviceNode.osv) && p.e(this.carrier, deviceNode.carrier) && p.e(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && p.e(this.ua, deviceNode.ua) && p.e(this.ifa, deviceNode.ifa) && p.e(this.lmt, deviceNode.lmt) && p.e(this.ext, deviceNode.ext);
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + Integer.hashCode(this.w)) * 31) + Integer.hashCode(this.h)) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode5 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt) {
        p.j(str, Q6.f27469t);
        p.j(str2, "model");
        p.j(str3, Q6.G);
        p.j(str5, Q6.F);
        this.make = str;
        this.model = str2;
        this.osv = str3;
        this.carrier = str4;
        this.os = str5;
        this.w = i10;
        this.h = i11;
        this.ua = str6;
        this.ifa = str7;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public static final void write$Self(DeviceNode deviceNode, d dVar, a aVar) {
        p.j(deviceNode, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        dVar.p(aVar, 0, deviceNode.make);
        dVar.p(aVar, 1, deviceNode.model);
        dVar.p(aVar, 2, deviceNode.osv);
        if (dVar.q(aVar, 3) || deviceNode.carrier != null) {
            dVar.C(aVar, 3, d2.f5397a, deviceNode.carrier);
        }
        dVar.p(aVar, 4, deviceNode.os);
        dVar.n(aVar, 5, deviceNode.w);
        dVar.n(aVar, 6, deviceNode.h);
        if (dVar.q(aVar, 7) || deviceNode.ua != null) {
            dVar.C(aVar, 7, d2.f5397a, deviceNode.ua);
        }
        if (dVar.q(aVar, 8) || deviceNode.ifa != null) {
            dVar.C(aVar, 8, d2.f5397a, deviceNode.ifa);
        }
        if (dVar.q(aVar, 9) || deviceNode.lmt != null) {
            dVar.C(aVar, 9, p0.f5452a, deviceNode.lmt);
        }
        if (dVar.q(aVar, 10) || deviceNode.ext != null) {
            dVar.C(aVar, 10, DeviceNode$VungleExt$$serializer.INSTANCE, deviceNode.ext);
        }
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public final void setExt(VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i10) {
        this.h = i10;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public final void setW(int i10) {
        this.w = i10;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, i iVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : vungleExt);
    }
}
